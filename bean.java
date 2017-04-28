import java.io.Serializable;

public class BeanDevices implements Serializable {

private String tipo;
private String device_uid;
private String fecha_alta;
private String location;

public String setTipo(String tipo) {
this.tipo=tipo;
}

public String setDevice_uid(String device_uid) {
this.device_uid=device_uid;
}

public String setFecha_alta(String fecha_alta) {
this.fecha_alta=fecha_alta;
}

public String setLocation(String location) {
this.location=location;
}

public String getTipo() {
return tipo;
}

public String getDevice_uid() {
return device_uid;
}

public String getFecha_alta() {
return fecha_alta;
}

public String getLocation() {
return location;
}

}
