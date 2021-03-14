package ejerciciosopcionales;

import java.util.Calendar;

public class Ejercicio3_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 3.2:
		ejercicio3_2();
	}
	public static void ejercicio3_2() {
		String marca="HP";
		String modelo="702-il";
		String fabricante= "HP Company";
		Calendar fecha_fabricacion= Calendar.getInstance();
		int year=2018;
		int month=8;
		int date=1;
		fecha_fabricacion.set(year, month, date);
		int memoria_RAM=2000;
		float promedio_batery= (float) 4.0 ;
		String [] protocolos_sec= {"WEP","WPA","WPA2"};
		float potencia=3000;
		float tiempo_recarga=(float)6.2;
		String so="Windows 10";
		float pantalla=(float)25.7;
		Portatil portatil1 = new Portatil(marca, modelo, fabricante, fecha_fabricacion, memoria_RAM, promedio_batery, protocolos_sec, potencia, tiempo_recarga, so, pantalla);
		
		
		String fabricante2= "HP Company 2";
		Calendar fecha_fabricacion2= Calendar.getInstance();
		int year2=2013;
		int month2=2;
		int date2=1;
		fecha_fabricacion2.set(year2, month2, date2);
		int memoria_RAM2=2520;
		float promedio_batery2= (float) 4.9 ;
		String [] protocolos_sec2= {"WEP","WPA2"};
		float potencia2=5000;
		float tiempo_recarga2=(float)5.2;
		String so2="Windows 8";
		float pantalla2=(float)20.7;
		Portatil portatil2 = new Portatil(fabricante2, fecha_fabricacion2, memoria_RAM2, promedio_batery2, protocolos_sec2, potencia2, tiempo_recarga2, so2, pantalla2);
		
		
		float potencia3=5000;
		float tiempo_recarga3=(float)5.2;
		String so3="Windows 7";
		float pantalla3=(float)20.7;
		Portatil portatil3 = new Portatil(potencia3, tiempo_recarga3, so3, pantalla3);
		
		
		String marca4="HP";
		String modelo4="702-il";
		String fabricante4= "HP Company";
		Calendar fecha_fabricacion4= Calendar.getInstance();
		int year4=2018;
		int month4=8;
		int date4=1;
		fecha_fabricacion4.set(year4, month4, date4);
		int memoria_RAM4=2000;
		float promedio_batery4= (float) 4.0 ;
		String [] protocolos_sec4= {"WEP","WPA","WPA2"};
		boolean recarga_inal=true;
		boolean almacenamiento_extra=true;
		String so4="Android";
		float pantalla4=(float)6.8;
		float tiempo_recarga4=(float)2.3;
		Movil movil1 = new Movil(marca4, modelo4, fabricante4, fecha_fabricacion4, memoria_RAM4, promedio_batery4, protocolos_sec4, recarga_inal, almacenamiento_extra, so4, pantalla4,tiempo_recarga4);
		
		
		String fabricante5= "HP Company 2";
		Calendar fecha_fabricacion5= Calendar.getInstance();
		int year5=2013;
		int month5=2;
		int date5=1;
		fecha_fabricacion5.set(year5, month5, date5);
		int memoria_RAM5=2520;
		float promedio_batery5= (float) 4.9 ;
		String [] protocolos_sec5= {"WEP","WPA2"};
		boolean recarga_inal5=true;
		boolean almacenamiento_extra5=true;
		String so5="Android";
		float pantalla5=(float)6.8;
		float tiempo_recarga5=(float)2.3;
		Movil movil2 = new Movil(fabricante5, fecha_fabricacion5, memoria_RAM5, promedio_batery5, protocolos_sec5, recarga_inal5, almacenamiento_extra5, so5, pantalla5,tiempo_recarga5);
		
		
		boolean recarga_inal6=true;
		boolean almacenamiento_extra6=true;
		String so6="Android";
		float pantalla6=(float)6.8;
		float tiempo_recarga6=(float)2.3;
		Movil movil3 = new Movil(recarga_inal6, almacenamiento_extra6, so6, pantalla6,tiempo_recarga6);
		
		String marca7="HP";
		String modelo7="702-il";
		String fabricante7= "HP Company";
		Calendar fecha_fabricacion7= Calendar.getInstance();
		int year7=2018;
		int month7=8;
		int date7=1;
		fecha_fabricacion7.set(year7, month7, date7);
		int memoria_RAM7=2000;
		float promedio_batery7= (float) 4.0 ;
		String [] protocolos_sec7= {"WEP","WPA","WPA2"};
		boolean refri_liquida=true;
		boolean iluminacion=true; 
		float almacenamiento=(float)78.5;
		float pot_alimentacion=(float) 8500;
		PCsobremesa pcsobremesa1 = new PCsobremesa(marca7, modelo7, fabricante7, fecha_fabricacion7, memoria_RAM7, promedio_batery7, protocolos_sec7, refri_liquida, iluminacion, almacenamiento,pot_alimentacion);
		
		
		String fabricante8= "HP Company 2";
		Calendar fecha_fabricacion8= Calendar.getInstance();
		int year8=2013;
		int month8=2;
		int date8=1;
		fecha_fabricacion8.set(year8, month8, date8);
		int memoria_RAM8=2520;
		float promedio_batery8= (float) 4.9 ;
		String [] protocolos_sec8= {"WEP","WPA2"};
		boolean refri_liquida8=false;
		boolean iluminacion8=true; 
		float almacenamiento8=(float)65.5;
		float pot_alimentacion8=(float) 8500;
		PCsobremesa pcsobremesa2 = new PCsobremesa(fabricante8, fecha_fabricacion8, memoria_RAM8, promedio_batery8, protocolos_sec8, refri_liquida8, iluminacion8, almacenamiento8,pot_alimentacion8);
		
		
		boolean refri_liquida9=false;
		boolean iluminacion9=false; 
		float almacenamiento9=(float)50.5;
		float pot_alimentacion9=(float) 8500;
		PCsobremesa pcsobremesa3 = new PCsobremesa(refri_liquida9, iluminacion9, almacenamiento9,pot_alimentacion9);
		
		String marca10="HP";
		String modelo10="702-il";
		String fabricante10= "HP Company";
		Calendar fecha_fabricacion10= Calendar.getInstance();
		int year10=2018;
		int month10=8;
		int date10=1;
		fecha_fabricacion10.set(year10, month10, date10);
		int memoria_RAM10=2000;
		float promedio_batery10= (float) 4.0 ;
		String [] protocolos_sec10= {"WEP","WPA","WPA2"};
		float tiempo_recarga10=(float)2.3;
		String so10="Android";
		float pantalla10=(float)9.3;

		Tableta tableta1 = new Tableta(marca10, modelo10, fabricante10, fecha_fabricacion10, memoria_RAM10, promedio_batery10, protocolos_sec10, tiempo_recarga10, so10, pantalla10 );
		
		
		String fabricante11= "HP Company 2";
		Calendar fecha_fabricacion11= Calendar.getInstance();
		int year11=2013;
		int month11=2;
		int date11=1;
		fecha_fabricacion11.set(year8, month8, date8);
		int memoria_RAM11=2520;
		float promedio_batery11= (float) 4.9 ;
		String [] protocolos_sec11= {"WEP","WPA2"};
		float tiempo_recarga11=(float)3.3;
		String so11="IOs";
		float pantalla11=(float)9.1;

		
		Tableta tableta2 = new Tableta(fabricante11, fecha_fabricacion11, memoria_RAM11, promedio_batery11, protocolos_sec11, tiempo_recarga11, so11, pantalla11 );
		
		
		float tiempo_recarga12=(float)3.5;
		String so12="Android";
		float pantalla12=(float)8.5;
		
		Tableta tableta3 = new Tableta(tiempo_recarga12, so12, pantalla12 );
		
		System.out.println("-> Ejercicio 3.2:\n");
		
		System.out.println("\nAlgunas caracteristicas del portatil 1: "+"\n Fabricante: "+portatil1.getFabricante()+ "\n Memoria RAM: "+portatil1.getMemoria_RAM()+"\n Pantalla: "+portatil1.getPantalla()+"\n Potencia(W): "+portatil1.getPotencia()+ "\n Promedio de la bateria: "+portatil1.getPromedio_batery()+ "\n Sistema Operativo: "+ portatil1.getSo()+"\n Tiempo de rearga medio: "+portatil1.getTiempo_recarga());
		System.out.println("\nAlgunas caracteristicas del portatil 2: "+"\n Fabricante: "+portatil2.getFabricante()+ "\n Memoria RAM: "+portatil2.getMemoria_RAM()+"\n Pantalla: "+portatil2.getPantalla()+"\n Potencia(W): "+portatil2.getPotencia()+ "\n Promedio de la bateria: "+portatil2.getPromedio_batery()+ "\n Sistema Operativo: "+ portatil2.getSo()+"\n Tiempo de rearga medio: "+portatil2.getTiempo_recarga());
		System.out.println("\nAlgunas caracteristicas del portatil 3: "+"\n Fabricante: "+portatil3.getFabricante()+ "\n Memoria RAM: "+portatil3.getMemoria_RAM()+"\n Pantalla: "+portatil3.getPantalla()+"\n Potencia(W): "+portatil3.getPotencia()+ "\n Promedio de la bateria: "+portatil3.getPromedio_batery()+ "\n Sistema Operativo: "+ portatil3.getSo()+"\n Tiempo de rearga medio: "+portatil3.getTiempo_recarga());
		
		System.out.println("\nAlgunas caracteristicas del movil 1: "+"\n Fabricante: "+movil1.getFabricante()+ "\n Memoria RAM: "+movil1.getMemoria_RAM()+"\n Pantalla: "+movil1.getPantalla()+"\n Recarga Inlambrica activado: "+movil1.isRecarga_inal()+ "\n Promedio de la bateria: "+movil1.getPromedio_batery()+ "\n Sistema Operativo: "+ movil1.getSo()+"\n Tiempo de recarga medio: "+movil1.getTiempo_recarga());
		System.out.println("\nAlgunas caracteristicas del movil 2: "+"\n Fabricante: "+movil2.getFabricante()+ "\n Memoria RAM: "+movil2.getMemoria_RAM()+"\n Pantalla: "+movil2.getPantalla()+"\n  Recarga Inlambrica activado: "+movil2.isRecarga_inal()+ "\n Promedio de la bateria: "+movil2.getPromedio_batery()+ "\n Sistema Operativo: "+ movil2.getSo()+"\n Tiempo de recarga medio: "+movil2.getTiempo_recarga());
		System.out.println("\nAlgunas caracteristicas del movil 3: "+"\n Fabricante: "+movil3.getFabricante()+ "\n Memoria RAM: "+movil3.getMemoria_RAM()+"\n Pantalla: "+movil3.getPantalla()+"\n  Recarga Inlambrica activado: "+movil3.isRecarga_inal()+ "\n Promedio de la bateria: "+movil3.getPromedio_batery()+ "\n Sistema Operativo: "+ movil3.getSo()+"\n Tiempo de recarga medio: "+movil3.getTiempo_recarga());
		
		System.out.println("\nAlgunas caracteristicas del pc de sobremesa 1: "+"\n Fabricante: "+pcsobremesa1.getFabricante()+ "\n Memoria RAM: "+pcsobremesa1.getMemoria_RAM()+"\n Potencia alimentacion(W): "+pcsobremesa1.getPot_alimentacion());
		System.out.println("\nAlgunas caracteristicas del pc de sobremesa 2: "+"\n Fabricante: "+pcsobremesa2.getFabricante()+ "\n Memoria RAM: "+pcsobremesa2.getMemoria_RAM()+"\n Potencia alimentacion(W): "+pcsobremesa2.getPot_alimentacion());
		System.out.println("\nAlgunas caracteristicas del pc de sobremesa 3: "+"\n Fabricante: "+pcsobremesa3.getFabricante()+ "\n Memoria RAM: "+pcsobremesa3.getMemoria_RAM()+"\n Potencia alimentacion(W): "+pcsobremesa3.getPot_alimentacion());
		
		System.out.println("\nAlgunas caracteristicas de la tableta 1: "+"\n Fabricante: "+tableta1.getFabricante()+ "\n Memoria RAM: "+tableta1.getMemoria_RAM()+"\n Pantalla: "+tableta1.getPantalla()+ "\n Promedio de la bateria: "+tableta1.getPromedio_batery()+ "\n Sistema Operativo: "+ tableta1.getSo()+"\n Tiempo de rearga medio: "+tableta1.getTiempo_recarga());
		System.out.println("\nAlgunas caracteristicas de la tableta 2: "+"\n Fabricante: "+tableta2.getFabricante()+ "\n Memoria RAM: "+tableta2.getMemoria_RAM()+"\n Pantalla: "+tableta2.getPantalla()+ "\n Promedio de la bateria: "+tableta2.getPromedio_batery()+ "\n Sistema Operativo: "+ tableta2.getSo()+"\n Tiempo de rearga medio: "+tableta2.getTiempo_recarga());
		System.out.println("\nAlgunas caracteristicas de la tableta 3: "+"\n Fabricante: "+tableta3.getFabricante()+ "\n Memoria RAM: "+tableta3.getMemoria_RAM()+"\n Pantalla: "+tableta3.getPantalla()+ "\n Promedio de la bateria: "+tableta3.getPromedio_batery()+ "\n Sistema Operativo: "+ tableta3.getSo()+"\n Tiempo de rearga medio: "+tableta3.getTiempo_recarga());
		
		
	}
}
