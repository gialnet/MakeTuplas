public class SQLSiniestros extends PoolConn {

private final String version;

public SQLSiniestros(String myPool) throws SQLException, NamingException {
super(myPool);
this.version = myPool;
}

public List<TuplasSiniestros> getListaSiniestros() throws SQLException {
Connection conn = PGconectar();
List<TuplasSiniestros> tp = new ArrayList<>();
try {
PreparedStatement st = conn.prepareStatement("SELECT * from siniestros");
ResultSet rs = st.executeQuery();
while (rs.next()) {
tp.add( new TuplasSiniestros.
Builder().
build()
);
}
} catch (SQLException e) {
System.out.println("siniestros Connection Failed!");
} finally {
conn.close();
}
return tp;
}

public List<TuplasSiniestros> getListaSiniestros(int NumPage, int SizePage, String ) throws SQLException {
Connection conn = PGconectar();
List<TuplasSiniestros> tp = new ArrayList<>();
try {
int Offset = SizePage * (NumPage-1);
PreparedStatement st = conn.prepareStatement("SELECT * from siniestros where estanque = ? order by id desc LIMIT ? OFFSET ?");
st.setInt(1, Integer.parseInt(xEstanque) );
st.setInt(2, SizePage);
st.setInt(3, Offset);
ResultSet rs = st.executeQuery();
while (rs.next()) {
tp.add( new TuplasSiniestros.
Builder().
build()
);
}
} catch (SQLException e) {
System.out.println("siniestros Connection Failed!");
} finally {
conn.close();
}
return tp;
}

}
