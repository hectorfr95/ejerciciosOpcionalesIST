package ejerciciosopcionales;

import java.util.Calendar;

public class PCsobremesa extends ModeloDispositivo{
private boolean refri_liquida;
private boolean ilumninacion;
private float almacenamiento; 
private float pot_alimentacion;
private static String [] a = {"Ninguno"};
private static Calendar fecha= Calendar.getInstance();
	public PCsobremesa(String marca, String modelo, String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec,boolean refri_liquida, boolean iluminacion, float almacenamiento,  float pot_alimentacion) {
		super(marca,modelo,fabricante, fecha_fabricacion,memoria_RAM,promedio_batery,protocolos_sec);
		this.ilumninacion=iluminacion;
		this.refri_liquida=refri_liquida;
		this.pot_alimentacion=pot_alimentacion;
		this.almacenamiento=almacenamiento;
	}
	public PCsobremesa(String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec,boolean refri_liquida, boolean iluminacion, float almacenamiento,  float pot_alimentacion) {
		super(fabricante, fecha_fabricacion,memoria_RAM,promedio_batery,protocolos_sec);
		this.ilumninacion=iluminacion;
		this.refri_liquida=refri_liquida;
		this.almacenamiento=almacenamiento;
		this.pot_alimentacion=pot_alimentacion;
	}
	public PCsobremesa(boolean refri_liquida, boolean iluminacion, float almacenamiento, float pot_alimentacion) {
		super("", fecha,-400,-400,a);
		this.ilumninacion=iluminacion;
		this.refri_liquida=refri_liquida;
		this.almacenamiento=almacenamiento;
		this.pot_alimentacion=pot_alimentacion;
	}
	public float getPot_alimentacion() {
		return pot_alimentacion;
	}
	public void setPot_alimentacion(float pot_alimentacion) {
		this.pot_alimentacion = pot_alimentacion;
	}
	public float getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(float almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public boolean isRefri_liquida() {
		return refri_liquida;
	}
	public void setRefri_liquida(boolean refri_liquida) {
		this.refri_liquida = refri_liquida;
	}
	public boolean isIlumninacion() {
		return ilumninacion;
	}
	public void setIlumninacion(boolean ilumninacion) {
		this.ilumninacion = ilumninacion;
	}

}
