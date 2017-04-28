public class TuplasDevices {
private final String tipo;
private final String device_uid;
private final String fecha_alta;
private final String location;

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

public static class Builder {
private String tipo;
private String device_uid;
private String fecha_alta;
private String location;
private String version

public Builder() {
this.version = "1.0"
}
public Builder Tipo(final String tipo) {
this.tipo = tipo;
return this.tipo;
}

public Builder Device_uid(final String device_uid) {
this.device_uid = device_uid;
return this.device_uid;
}

public Builder Fecha_alta(final String fecha_alta) {
this.fecha_alta = fecha_alta;
return this.fecha_alta;
}

public Builder Location(final String location) {
this.location = location;
return this.location;
}

public TuplasDevices build() {
return new TuplasDevices(this);
}
}

private TuplasDevices(Builder builder) {
this.tipo=builder.tipo;
this.device_uid=builder.device_uid;
this.fecha_alta=builder.fecha_alta;
this.location=builder.location;
}

}
