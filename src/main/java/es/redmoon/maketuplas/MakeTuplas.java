/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.redmoon.maketuplas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.apache.commons.lang.StringUtils;


/**
 *
 * @author antonio
 */
public class MakeTuplas {

    public JSONObject ReadBodyTable(String tabla) throws SQLException {
        
        pruConn myConn= new pruConn("poliza-net","polizanet","yo");
        Connection conn=myConn.PGconectar();
        
         PreparedStatement st = conn.prepareStatement("SELECT DISTINCT table_name, column_name,data_type,ordinal_position\n" +
                                "FROM information_schema.columns\n" +
                                "WHERE table_schema='public'\n" +
                                "AND table_name = ?\n" +
                                "ORDER BY 4");
         st.setString(1, tabla);
         ResultSet rs = st.executeQuery();
         
         //Gson obj=new Gson();
         JSONObject obj=new JSONObject();
         
        while (rs.next()) {
            
            obj.put(rs.getString("column_name"),rs.getString("data_type"));
            
        }
        conn.close();
        //System.out.print(obj);
        return obj;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {

        // leer la estructura de la tabla
        MakeTuplas mt = new MakeTuplas();
        JSONObject obj= mt.ReadBodyTable(args[0]);
        
        //System.out.print(obj.size());
        /*
        for (Object key : obj.keySet()) {
            System.out.print(key.toString() + obj.get(key));
        }*/
        
        
        String sFichero = "tuplas.java";
        String sNombreClass= "Tuplas";
        BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
        
        // escribir la cabecera de la clase
        sNombreClass=sNombreClass+StringUtils.capitalize(args[0]);
        
        bw.write("public class " + sNombreClass + " {");
        bw.write("\n");
        
        // bloque de declaración de variables private final
        
        for (Object key : obj.keySet()) {
            bw.write("private final String "+key.toString()+";\n");
        }
        bw.write("\n");
        
        // bloque getters
        for (Object key : obj.keySet()) {

            bw.write("public String get"+StringUtils.capitalize(key.toString())+"() {\n");
            bw.write("return "+key.toString()+";\n");
            bw.write("}\n");
            bw.write("\n");
        }
        
        // bloque builder
        // public static class Builder {
        bw.write("public static class Builder {\n");
        
        // declaración de variables
        for (Object key : obj.keySet()) {
            bw.write("private String "+key.toString()+";\n");
        }
        bw.write("private String version\n");
        bw.write("\n");
        
        // public Builder() {
        bw.write("public Builder() {\n");
        bw.write("this.version = \"1.0\"\n");
        bw.write("}\n");
        
        for (Object key : obj.keySet()) {

            bw.write("public Builder "+StringUtils.capitalize(key.toString())+"(final String "+key.toString()+") {\n");
            bw.write("this."+key.toString()+" = "+key.toString()+";\n");
            bw.write("return this."+key.toString()+";\n");
            bw.write("}\n");
            bw.write("\n");
        }
        
        //
        bw.write("public "+sNombreClass+" build() {\n");
        bw.write("return new "+sNombreClass+"(this);\n");
        bw.write("}\n");
        
        // cierra el bloque builder
        bw.write("}\n\n");
        
        
        // bloque constructor privado
        // private TuplasCias(Builder builder) {
        bw.write("private "+sNombreClass+"(Builder builder) {\n");
        
        for (Object key : obj.keySet()) {
            bw.write("this."+key.toString()+"=builder."+key.toString()+";\n");
        }
        bw.write("}\n\n");
        
        // cerrar el pie de la clase
        bw.write("}\n");
        bw.close();
        
    }
    
    
}
