package ejerciciosopcionales;

import java.util.Calendar;

public class Movil extends ModeloDispositivo{
private boolean recarga_inal;
private boolean almacenamiento_extra;
private float tiempo_recarga;
private String so;
private float pantalla;
private static String [] a = {"Ninguno"};
private static Calendar fecha= Calendar.getInstance();
	public Movil(String marca, String modelo, String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec,boolean recarga_inal, boolean almacenamiento_extra, String so, float pantalla,float tiempo_recarga) {
		super(marca,modelo,fabricante, fecha_fabricacion,memoria_RAM,promedio_batery,protocolos_sec);
		this.almacenamiento_extra=almacenamiento_extra;
		this.recarga_inal=recarga_inal;
		this.so=so;
		this.pantalla=pantalla;
		this.tiempo_recarga=tiempo_recarga;
	}
	
	public Movil( String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec,boolean recarga_inal, boolean almacenamiento_extra, String so, float pantalla,float tiempo_recarga) {
		super(fabricante, fecha_fabricacion,memoria_RAM,promedio_batery,protocolos_sec);
		this.almacenamiento_extra=almacenamiento_extra;
		this.recarga_inal=recarga_inal;
		this.so=so;
		this.pantalla=pantalla;
		this.tiempo_recarga=tiempo_recarga;
	}
	public Movil( boolean recarga_inal, boolean almacenamiento_extra, String so, float pantalla,float tiempo_recarga) {
		super("", fecha,-400,-400,a);
		this.almacenamiento_extra=almacenamiento_extra;
		this.recarga_inal=recarga_inal;
		this.so=so;
		this.pantalla=pantalla;
		this.tiempo_recarga=tiempo_recarga;
	}
	public float getTiempo_recarga() {
		return tiempo_recarga;
	}

	public void setTiempo_recarga(float tiempo_recarga) {
		this.tiempo_recarga = tiempo_recarga;
	}

	public float getPantalla() {
		return pantalla;
	}
	public void setPantalla(float pantalla) {
		this.pantalla = pantalla;
	}
	public boolean isRecarga_inal() {
		return recarga_inal;
	}
	public void setRecarga_inal(boolean recarga_inal) {
		this.recarga_inal = recarga_inal;
	}
	public boolean isAlmacenamiento_extra() {
		return almacenamiento_extra;
	}
	public void setAlmacenamiento_extra(boolean almacenamiento_extra) {
		this.almacenamiento_extra = almacenamiento_extra;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}

}
