public class SQLDevices extends PoolConn {

private final String version;

public SQLDevices(String myPool) throws SQLException, NamingException {
super(myPool);
this.version = myPool;
}

public List<TuplasDevices> getListaDevices() throws SQLException {
Connection conn = PGconectar();
List<TuplasDevices> tp = new ArrayList<>();
try {
PreparedStatement st = conn.prepareStatement("SELECT * from devices");
ResultSet rs = st.executeQuery();
while (rs.next()) {
tp.add( new TuplasDevices.
Builder().
build()
);
}
} catch (SQLException e) {
System.out.println("devices Connection Failed!");
} finally {
conn.close();
}
return tp;
}

public List<TuplasDevices> getListaDevices(int NumPage, int SizePage, String ) throws SQLException {
Connection conn = PGconectar();
List<TuplasDevices> tp = new ArrayList<>();
try {
int Offset = SizePage * (NumPage-1);
PreparedStatement st = conn.prepareStatement("SELECT * from devices where estanque = ? order by id desc LIMIT ? OFFSET ?");
st.setInt(1, Integer.parseInt(xEstanque) );
st.setInt(2, SizePage);
st.setInt(3, Offset);
ResultSet rs = st.executeQuery();
while (rs.next()) {
tp.add( new TuplasDevices.
Builder().
build()
);
}
} catch (SQLException e) {
System.out.println("devices Connection Failed!");
} finally {
conn.close();
}
return tp;
}

}
