import java.io.Serializable;

public class BeanSiniestros implements Serializable {

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

public String setLocalidad(String localidad) {
this.localidad=localidad;
}

public String setDescripcion(String descripcion) {
this.descripcion=descripcion;
}

public String setFecha_hora_sini(String fecha_hora_sini) {
this.fecha_hora_sini=fecha_hora_sini;
}

public String setProvincia(String provincia) {
this.provincia=provincia;
}

public String setDamage_asegurado(String damage_asegurado) {
this.damage_asegurado=damage_asegurado;
}

public String setFecha_situacion(String fecha_situacion) {
this.fecha_situacion=fecha_situacion;
}

public String setCp(String cp) {
this.cp=cp;
}

public String setTipo_siniestro(String tipo_siniestro) {
this.tipo_siniestro=tipo_siniestro;
}

public String setSituacion(String situacion) {
this.situacion=situacion;
}

public String setId_poliza(String id_poliza) {
this.id_poliza=id_poliza;
}

public String setLugar(String lugar) {
this.lugar=lugar;
}

public String setExpe_cia(String expe_cia) {
this.expe_cia=expe_cia;
}

public String setTramitador(String tramitador) {
this.tramitador=tramitador;
}

public String setExpe_agencia(String expe_agencia) {
this.expe_agencia=expe_agencia;
}

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

}
