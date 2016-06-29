public class TuplasSiniestros {
private final String localidad;
private final String descripcion;
private final String fecha_hora_sini;
private final String provincia;
private final String damage_asegurado;
private final String fecha_situacion;
private final String cp;
private final String tipo_siniestro;
private final String situacion;
private final String id_poliza;
private final String lugar;
private final String expe_cia;
private final String tramitador;
private final String expe_agencia;

public String getLocalidad() {
return localidad;
}

public String getDescripcion() {
return descripcion;
}

public String getFecha_hora_sini() {
return fecha_hora_sini;
}

public String getProvincia() {
return provincia;
}

public String getDamage_asegurado() {
return damage_asegurado;
}

public String getFecha_situacion() {
return fecha_situacion;
}

public String getCp() {
return cp;
}

public String getTipo_siniestro() {
return tipo_siniestro;
}

public String getSituacion() {
return situacion;
}

public String getId_poliza() {
return id_poliza;
}

public String getLugar() {
return lugar;
}

public String getExpe_cia() {
return expe_cia;
}

public String getTramitador() {
return tramitador;
}

public String getExpe_agencia() {
return expe_agencia;
}

public static class Builder {
private String localidad;
private String descripcion;
private String fecha_hora_sini;
private String provincia;
private String damage_asegurado;
private String fecha_situacion;
private String cp;
private String tipo_siniestro;
private String situacion;
private String id_poliza;
private String lugar;
private String expe_cia;
private String tramitador;
private String expe_agencia;
private String version

public Builder() {
this.version = "1.0"
}
public Builder Localidad(final String localidad) {
this.localidad = localidad;
return this.localidad;
}

public Builder Descripcion(final String descripcion) {
this.descripcion = descripcion;
return this.descripcion;
}

public Builder Fecha_hora_sini(final String fecha_hora_sini) {
this.fecha_hora_sini = fecha_hora_sini;
return this.fecha_hora_sini;
}

public Builder Provincia(final String provincia) {
this.provincia = provincia;
return this.provincia;
}

public Builder Damage_asegurado(final String damage_asegurado) {
this.damage_asegurado = damage_asegurado;
return this.damage_asegurado;
}

public Builder Fecha_situacion(final String fecha_situacion) {
this.fecha_situacion = fecha_situacion;
return this.fecha_situacion;
}

public Builder Cp(final String cp) {
this.cp = cp;
return this.cp;
}

public Builder Tipo_siniestro(final String tipo_siniestro) {
this.tipo_siniestro = tipo_siniestro;
return this.tipo_siniestro;
}

public Builder Situacion(final String situacion) {
this.situacion = situacion;
return this.situacion;
}

public Builder Id_poliza(final String id_poliza) {
this.id_poliza = id_poliza;
return this.id_poliza;
}

public Builder Lugar(final String lugar) {
this.lugar = lugar;
return this.lugar;
}

public Builder Expe_cia(final String expe_cia) {
this.expe_cia = expe_cia;
return this.expe_cia;
}

public Builder Tramitador(final String tramitador) {
this.tramitador = tramitador;
return this.tramitador;
}

public Builder Expe_agencia(final String expe_agencia) {
this.expe_agencia = expe_agencia;
return this.expe_agencia;
}

public TuplasSiniestros build() {
return new TuplasSiniestros(this);
}
}

private TuplasSiniestros(Builder builder) {
this.localidad=builder.localidad;
this.descripcion=builder.descripcion;
this.fecha_hora_sini=builder.fecha_hora_sini;
this.provincia=builder.provincia;
this.damage_asegurado=builder.damage_asegurado;
this.fecha_situacion=builder.fecha_situacion;
this.cp=builder.cp;
this.tipo_siniestro=builder.tipo_siniestro;
this.situacion=builder.situacion;
this.id_poliza=builder.id_poliza;
this.lugar=builder.lugar;
this.expe_cia=builder.expe_cia;
this.tramitador=builder.tramitador;
this.expe_agencia=builder.expe_agencia;
}

}
