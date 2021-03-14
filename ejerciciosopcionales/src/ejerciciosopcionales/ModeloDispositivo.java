package ejerciciosopcionales;

import java.util.Arrays;
import java.util.Calendar;


public class ModeloDispositivo extends MyM{
private String fabricante;
private Calendar fecha_fabricacion;
private int memoria_RAM;
private float promedio_batery;
private String [] protocolos_sec;

	public ModeloDispositivo(String marca, String modelo, String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec) {
		// TODO Auto-generated constructor stub
		super(marca,modelo);
		this.fabricante = fabricante;
		this.fecha_fabricacion=	fecha_fabricacion;
		this.memoria_RAM= memoria_RAM;
		this.promedio_batery= promedio_batery;
		if(protocolos_sec.length<=4) {
			this.protocolos_sec=Arrays.copyOfRange(protocolos_sec, 0, 4);
		}else {
			this.protocolos_sec=Arrays.copyOf(protocolos_sec, 5);	
		}
	}
	public ModeloDispositivo( String fabricante, Calendar fecha_fabricacion, int memoria_RAM, float promedio_batery, String [] protocolos_sec) {
		// TODO Auto-generated constructor stub
		super("", "");
		this.fabricante = fabricante;
		this.fecha_fabricacion=	fecha_fabricacion;
		this.memoria_RAM= memoria_RAM;
		this.promedio_batery= promedio_batery;
		if(protocolos_sec.length<=5) {
			this.protocolos_sec=Arrays.copyOfRange(protocolos_sec, 0, 4);
		}else {
			this.protocolos_sec=Arrays.copyOf(protocolos_sec, 5);	
		}
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Calendar getFecha_fabricacion() {
		return fecha_fabricacion;
	}

	public void setFecha_fabricacion(Calendar fecha_fabricacion) {
		this.fecha_fabricacion = fecha_fabricacion;
	}

	public int getMemoria_RAM() {
		return memoria_RAM;
	}

	public void setMemoria_RAM(int memoria_RAM) {
		this.memoria_RAM = memoria_RAM;
	}

	public float getPromedio_batery() {
		return promedio_batery;
	}

	public void setPromedio_batery(float promedio_batery) {
		this.promedio_batery = promedio_batery;
	}

	public String[] getProtocolos_sec() {
		return protocolos_sec;
	}

	public void setProtocolos_sec(String[] protocolos_sec) {
		this.protocolos_sec = protocolos_sec;
	}

}
