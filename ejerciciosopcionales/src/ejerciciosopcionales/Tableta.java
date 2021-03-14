package ejerciciosopcionales;

import java.util.Calendar;

public class Tableta extends ModeloDispositivo{
private String so;
private float pantalla;
private float tiempo_recarga;
private static String [] a = {"Ninguno"};
private static Calendar fecha= Calendar.getInstance();
	public Tableta(String marca, String modelo, String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec,float tiempo_recarga, String so, float pantalla) {
		// TODO Auto-generated constructor stub
		super(marca,modelo,fabricante, fecha_fabricacion,memoria_RAM,promedio_batery,protocolos_sec);
		this.tiempo_recarga=tiempo_recarga;
		this.so=so;
		this.pantalla=pantalla;
	}
	public Tableta(String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec,float tiempo_recarga, String so, float pantalla) {
		// TODO Auto-generated constructor stub
		super(fabricante, fecha_fabricacion,memoria_RAM,promedio_batery,protocolos_sec);
		this.tiempo_recarga=tiempo_recarga;
		this.so=so;
		this.pantalla=pantalla;
	}
	public Tableta(float tiempo_recarga, String so, float pantalla) {
		// TODO Auto-generated constructor stub
		super("", fecha,-400,-400,a);
		this.tiempo_recarga=tiempo_recarga;
		this.so=so;
		this.pantalla=pantalla;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public float getPantalla() {
		return pantalla;
	}
	public void setPantalla(float pantalla) {
		this.pantalla = pantalla;
	}
	public float getTiempo_recarga() {
		return tiempo_recarga;
	}
	public void setTiempo_recarga(float tiempo_recarga) {
		this.tiempo_recarga = tiempo_recarga;
	}

}
