package ejerciciosopcionales;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.GregorianCalendar;

public class BasicTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicicio 1.1:
		
		System.out.println("-> Ejercicio 1.1: \n");
		int n=80;
		int k= 50;
		double f = combinations(n,k);
		System.out.println("Su numero combinatorio para n = " + n + " , y k = " + k + ", es de C = " + f );
		System.out.println("\n");
		
		// Ejercicicio 1.2:
		
		System.out.println("-> Ejercicio 1.2: \n");
		String word="murcielago";
		String word2="camarero";
		boolean h = allVocals(word);
		System.out.println("Su palabra es : " + word + " , comprobando si tiene todas las vocales: "+ h);
		System.out.println("\n");
		boolean h2 = allVocals(word2);
		System.out.println("Su palabra es : " + word2 + " , comprobando si tiene todas las vocales: "+ h2);
		System.out.println("\n");
		
		// Ejercicicio 1.3:
		System.out.println("\n-> Ejercicio 1.3:\n");
		System.out.println("\n");
		Calendar calendario = Calendar.getInstance();
		int dia=12;
		int mes=3;
		int año=2016;
		int dia2=calendario.get(Calendar.DATE);
		int mes2=calendario.get(Calendar.MONTH)+1;
		int year2 = calendario.get(Calendar.YEAR);
		calendario.set(2016,0,16); // ** Nota los meses van de 0-11, enero es el mes 0 y diciembre el mes 11
		int dia3=calendario.get(Calendar.DATE);
		int mes3=calendario.get(Calendar.MONTH)+1;
		int year3 = calendario.get(Calendar.YEAR);
		calendario = Calendar.getInstance();
		boolean [] l = isEvenDayOddMonthLeapYear(dia, mes ,año); // Fecha introducida con ints
		boolean [] l2 = isEvenDayOddMonthLeapYear(dia2, mes2 ,year2); // Fecha introducida, la actual
		boolean [] l3 = isEvenDayOddMonthLeapYear(dia3, mes3 ,year3); // Fecha introducida modificando la fecha con el calendario
		System.out.println("Su fecha introducida es la siguente : "+ dia+"/"+mes+"/"+año+" , comprobando si cumple"
				+ " las \nsiguientes condiciones : \n   Dia par: "+l[0] +" \n   Mes impar: "+l[1]+" \n   Año bisiesto : "+l[2]+" \nResultado:  "+ l[3]);
		System.out.println("\n");
		System.out.println("Su fecha introducida es la siguente : "+ dia2+"/"+mes2+"/"+year2+" , comprobando si cumple"
				+ " las \nsiguientes condiciones : \n   Dia par: "+l2[0] +" \n   Mes impar: "+l2[1]+" \n   Año bisiesto : "+l2[2]+" \nResultado:  "+ l2[3]);
		System.out.println("\n");
		System.out.println("Su fecha introducida es la siguente : "+ dia3+"/"+mes3+"/"+year3+" , comprobando si cumple"
				+ " las \nsiguientes condiciones : \n   Dia par: "+l3[0] +" \n   Mes impar: "+l3[1]+" \n   Año bisiesto : "+l3[2]+" \nResultado:  "+ l3[3]);
		System.out.println("\n");
	
		
		// Ejercicicio 1.4 y 1.5:
		/*
		 * 
		 * He sacado el codigo para obtener el signo del zodiaco de la siguiente página
		 * 
		 * https://github.com/Masqueprogramar/JavaBasico/blob/master/src/com/masqueprogramar/HoroscopoChino.java
		 * 		Autor: Blog masqueprogramar	
		 * 		
		 * 
		 * **/
	
		System.out.println("\n-> Ejercicio 1.4 y 1.5:\n");
		Calendar calendario2 = Calendar.getInstance();
		calendario2.set(1995,5,1); // ** Nota los meses van de 0-11, enero es el mes 0 y diciembre el mes 11
		int dia1_1_4=calendario2.get(Calendar.DATE);
		int mes1_1_4=calendario2.get(Calendar.MONTH);
		int year1_1_4 = calendario2.get(Calendar.YEAR);
		String [] resultado= printZodiacSign(calendario2);
		String [] seleccion= {"signo zodical occidental","signo del zodiaco chino"}; 
		String [] seleccionRS = {seleccionHoroscopo(calendario2,seleccion[0]),seleccionHoroscopo(calendario2,seleccion[1])};
		mes1_1_4=mes1_1_4+1;
		System.out.println("Su fecha introducida es la siguente : "+ dia1_1_4+"/"+mes1_1_4+"/"+year1_1_4+" , su signo del zodiaco es: \n"+resultado[0]+"\nSu signo del zodiaco chino: "+ resultado[1]);
		System.out.println("\n");
		System.out.println("Su fecha introducida es la siguente : "+ dia1_1_4+"/"+mes1_1_4+"/"+year1_1_4+" , su eleccion es: \n"+seleccion[0]+"\n->\n "+ seleccionRS[0]);
		System.out.println("\n");
		System.out.println("Su fecha introducida es la siguente : "+ dia1_1_4+"/"+mes1_1_4+"/"+year1_1_4+" , su eleccion es: \n"+seleccion[1]+"\n->\n "+ seleccionRS[1]);
		System.out.println("\n");
		
		//Ejercicio 2.1
		
		int [] a= {2, 3, 4, 6, 7, 8, 9, 5};
		int [] b= {4, 7, 6, 8, 9, 0, 5, 4};
		ejercicio2_1(a,b);
		
		//Ejercicio 2.2:
		int [] a2 = {51,2,5,1,4,8,5,4,85,84,5,84,5,4,74,4,65,984,1};
		ejercicio2_2(a2);
		
		// Ejercicio 2.3:
		int[][] a3 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		ejercicio2_3(a3);
		
		// Ejercicio 2.4
		
		String [] a4= {"Superman","Batman","Flash","Ironman","Capitana Marvel","Thor","Black Panther","Antman", "Joker", "Hulk", "Deadpool", "Hawk"};
		ejercicio2_4(a4);
		
	}
	
	public static double combinations(int n, int k) {
		
		if (n>=k) {
			
			int a = n;
			int b = k;
			int z = n - k;
			double c = 1; //n!
			double d = 1; //k!
			double e = 1; // z!
		
			while ( a!=0 )  {
			
				c=c*a;
				a--;
		
			}
			while ( b!=0 )  {
			
				d=d*b;
				b--;
			
			}
			while ( z!=0 )  {
			
				e=e*z;
				z--;
			
			}
			double f = c/(d*e);
		
			return f;
		} else {
			
			return -1; // No puede ser k sea mayor que n
		
		}
	
	}
	public static boolean allVocals( String word ) {
		
		String z = word;
		int find_a=z.indexOf("a");
		int find_e=z.indexOf("e");
		int find_i=z.indexOf("i");
		int find_o=z.indexOf("o");
		int find_u=z.indexOf("u");
		if (find_a>=0 && find_e>=0 && find_i>=0 && find_o>=0 && find_u>=0 ) {
			return true;
		}
		return false;
	}
	public static boolean [] isEvenDayOddMonthLeapYear (int a, int b, int c) {
	
		int x = a;
		int y = b;
		int z = c;
		boolean es_bisiesto=false;
		boolean es_mesimpar=false;
		boolean es_diapar=false;
		boolean [] resultado = {false, false, false, false}; // primer campo para la condicion del dia, segundo para la condicion del mes, tercero para la del año y cuarta si se cumplen todas
		if (z>=0){
			 es_bisiesto = z % 4 == 0 && z % 100 != 0 || z % 400 == 0;
		}
		if (y>=0){
			 es_mesimpar = y%2!=0;
		}
		if (x>=0){
			 es_diapar = x%2==0;
		}
		if( es_bisiesto== true && es_mesimpar==true && es_diapar==true) {
			resultado[3]=true;
		}
		resultado[0]=es_diapar;
		resultado[1]=es_mesimpar;
		resultado[2]=es_bisiesto;
		return resultado;
	}
	
	public static String [] printZodiacSign(Calendar calendary) {
		
		int anyo=calendary.get(Calendar.YEAR);
		
		Calendar aries_ini= Calendar.getInstance();
		aries_ini.set(anyo, 2, 21);
		Calendar aries_fin= Calendar.getInstance();
		aries_fin.set(anyo, 3, 19);
		
		Calendar tauro_ini= Calendar.getInstance();
		tauro_ini.set(anyo, 3, 20);
		Calendar tauro_fin= Calendar.getInstance();
		tauro_fin.set(anyo, 4, 20);
		
		Calendar geminis_ini= Calendar.getInstance();
		geminis_ini.set(anyo, 4, 21);
		Calendar geminis_fin= Calendar.getInstance();
		geminis_fin.set(anyo, 5, 20);
		
		Calendar cancer_ini= Calendar.getInstance();
		cancer_ini.set(anyo, 5, 21);
		Calendar cancer_fin= Calendar.getInstance();
		cancer_fin.set(anyo, 6, 22);
		
		Calendar leo_ini= Calendar.getInstance();
		leo_ini.set(anyo, 6, 23);
		Calendar leo_fin= Calendar.getInstance();
		leo_fin.set(anyo, 7, 22);
		
		Calendar virgo_ini= Calendar.getInstance();
		virgo_ini.set(anyo, 7, 13);
		Calendar virgo_fin= Calendar.getInstance();
		virgo_fin.set(anyo, 8, 22);
		
		Calendar libra_ini= Calendar.getInstance();
		libra_ini.set(anyo, 8, 23);
		Calendar libra_fin= Calendar.getInstance();
		libra_fin.set(anyo, 9, 22);
		
		Calendar escorp_ini= Calendar.getInstance();
		escorp_ini.set(anyo, 9, 23);
		Calendar escorp_fin= Calendar.getInstance();
		escorp_fin.set(anyo, 10, 21);
		
		Calendar sagi_ini= Calendar.getInstance();
		sagi_ini.set(anyo, 10, 22);
		Calendar sagi_fin= Calendar.getInstance();
		sagi_fin.set(anyo, 11, 21);
		
		Calendar capri_ini= Calendar.getInstance();
		capri_ini.set(anyo, 11, 22);
		Calendar capri_fin= Calendar.getInstance();
		capri_fin.set(anyo, 0, 19);
		
		Calendar acua_ini= Calendar.getInstance();
		acua_ini.set(anyo, 0, 20);
		Calendar acua_fin= Calendar.getInstance();
		acua_fin.set(anyo, 1, 18);
		
		Calendar piscis_ini= Calendar.getInstance();
		piscis_ini.set(anyo, 1, 19);
		Calendar piscis_fin= Calendar.getInstance();
		piscis_fin.set(anyo, 2, 20);
		 String rs1="Fecha mal introducida";
		
		if(calendary.compareTo(aries_ini)>=0 && calendary.compareTo(aries_fin)<=0) {
			rs1= "Eres Aries";
		}
		if(calendary.compareTo(tauro_ini)>=0 && calendary.compareTo(tauro_fin)<=0) {
			rs1= "Eres Tauro";
		}
		if(calendary.compareTo(geminis_ini)>=0 && calendary.compareTo(geminis_fin)<=0) {
			rs1= "Eres Geminis";
		}
		if(calendary.compareTo(cancer_ini)>=0 && calendary.compareTo(cancer_ini)<=0) {
			rs1= "Eres Cancer";
		}
		if(calendary.compareTo(leo_ini)>=0 && calendary.compareTo(leo_fin)<=0) {
			rs1="Eres Leo";
		}
		if(calendary.compareTo(virgo_ini)>=0 && calendary.compareTo(virgo_fin)<=0) {
			rs1= "Eres Virgo";
		}
		if(calendary.compareTo(libra_ini)>=0 && calendary.compareTo(libra_fin)<=0) {
			rs1= "Eres Libra";
		}
		if(calendary.compareTo(escorp_ini)>=0 && calendary.compareTo(escorp_fin)<=0) {
			rs1= "Eres Escorpio";
		}
		if(calendary.compareTo(sagi_ini)>=0 && calendary.compareTo(sagi_fin)<=0) {
			rs1 = "Eres Sagitario";
		}
		if(calendary.compareTo(capri_ini)>=0 && calendary.compareTo(capri_fin)<=0) {
			rs1 =  "Eres Capricornio";
		}
		if(calendary.compareTo(acua_ini)>=0 && calendary.compareTo(acua_fin)<=0) {
			rs1 =  "Eres Acuario";
		}
		if(calendary.compareTo(piscis_ini)>=0 && calendary.compareTo(piscis_fin)<=0) {
			rs1 =  "Eres Piscis";
		}
	     String horoscopo = "";
	    int resto = anyo % 12;
	    switch (resto) {
	            case 0: horoscopo = "Mono"; break;
	            case 1: horoscopo = "Gallo"; break;
	            case 2: horoscopo = "Perro"; break;
	            case 3: horoscopo = "Cerdo"; break;
	            case 4: horoscopo = "Rata"; break;
	            case 5: horoscopo = "Buey"; break;
	            case 6: horoscopo = "Tigre"; break;
	            case 7: horoscopo = "Conejo"; break;
	            case 8: horoscopo = "Dragon"; break;
	            case 9: horoscopo = "Serpiente"; break;
	            case 10: horoscopo = "Caballo"; break;
	            case 11: horoscopo = "Cabra"; break;
	            default: horoscopo = "Dia inválido"; break; 
	        }
	    String [] resultado= {"null", "null"};
	    resultado[0]=rs1;
	    resultado[1]=horoscopo;
		return resultado;
	}
	
	public static String seleccionHoroscopo(Calendar calendary, String seleeccion) {
	
		String [] resultado= printZodiacSign(calendary);
		if(seleeccion== "signo zodical occidental") {
			String rs=resultado[0];
			return rs;
		}else if(seleeccion== "signo del zodiaco chino") {
			String rs="Su signo del zodiaco chino es: "+resultado[1];
			return rs;
		}else {
			return "Fecha invalida";
		}
	}
	
	public static float norm2(int [] a, int [] b) {
		
		float resultado=0;
		if(comprobacionDimensionesNorm2(a,b)==true) {
			for(int i=0;i<=a.length && i<b.length;i++) {
				resultado= resultado + (a[i]-b[i])*(a[i]-b[i]);
			}
			resultado=Math.abs((float) Math.sqrt(resultado));
			return resultado;
		}else {
		resultado=-1;
		return resultado;
		}
	}
	
	public static boolean  comprobacionDimensionesNorm2(int [] a, int [] b) {
	
		if(a.length!=b.length) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void ejercicio2_1(int[] a, int [] b) {
		
		System.out.println("\n-> Ejercicio2.1:\n");
		if(comprobacionDimensionesNorm2(a,b)==false) {
			System.out.println("Se han introducido arrays con dimensiones distintas");
		}else {
			StringBuilder array_a= (new StringBuilder()).append("");
			StringBuilder array_b=(new StringBuilder()).append("");
			float resultado=norm2(a,b);
			for (int i=0;i<a.length && i<b.length;i++ ) {
				array_a.append(Integer.toString(a[i])+ " ");
				array_b.append(Integer.toString(b[i])+ " ");
			}
			System.out.println("El resultado de la norma euclidiana de a yb siendo el vector a: "+ array_a+" y siendo el vector b: "+array_b+ "el resultado es: " + Float.toString(resultado));
		}
	}
	
	public static int sumavector(int [] a) {
		
		int rs=0;
		for (int i=0;i<a.length;i++) {
			rs=rs+a[i];
		}
		return rs;
	}
	
	public static int [] cumsum(int [] a) {
		
		int l = a.length;
		int[] aux = Arrays.copyOf(a, l);

		for (int i=0;i<a.length ;i++) {
			int[] aux2 = Arrays.copyOfRange(a, 0, i+1);
			aux[i]=sumavector(aux2);
			
		}
		
		return aux;
	}
	
	public static StringBuilder arraryToString(int [] a) {
		StringBuilder array_a=(new StringBuilder()).append("");
		for (int i=0;i<a.length;i++ ) {
			array_a.append(Integer.toString(a[i])+ " ");
			
		}
		return array_a;
	}
	
	public static void ejercicio2_2(int [] a) {
		System.out.println("\n-> Ejercicio2.2:\n");
		if(a==null) {
			System.out.println("Array vacio");
		}else {
			System.out.println("\n Sy array es: " +arraryToString(a) + " y el resultado de aplicarle la funcion cumsum es: " + arraryToString(cumsum(a))+"\n");
		}
	
	}

	public static int [][] matrixTranspose(int [][] a){
		
		
		int[][] aT = new int[a[0].length][a.length];
		for (int i=0; i < a.length; i++) {
			  for (int j=0; j < a[i].length; j++) {
			    aT[j][i] = a[i][j];
			  }
			}
		
		return aT;
	}

	public static StringBuilder matrixToString(int [][] a) {
		StringBuilder matriz_a=(new StringBuilder()).append("");
	
		for (int i=0; i < a.length; i++) {
			  for (int j=0; j < a[i].length; j++) {
				  matriz_a.append(Integer.toString(a[i][j])+ " ");
			  }
			  matriz_a.append("\n");
			}
		
		return matriz_a;
	}
	
	public static void ejercicio2_3(int [][] a) {
		System.out.println("\n-> Ejercicio2.3:\n");
		if(a==null) {
			System.out.println("Matriz vacia");
		}else {
			System.out.println("\n Sy matriz es: \n" +matrixToString(a) + "\nEl resultado de aplicarle la funcion transpuesta es: \n" + matrixToString(matrixTranspose(a))+"\n");
		}
	
	}
	
	public static String [] shortOrderedHeroes(String [] a) {
	
		 String[] aux= new String[a.length];
		 aux=a;
		Arrays.sort(aux);
		System.out.println(arraryToString(aux));
		return aux;
		
	}
	public static String [] eliminarStringmenor5(String [] a) {
	
		int contador=0;
		String [] aux2=new String[a.length];
		for (int i=0; i<a.length;i++) {
			if(a[i].length()<=5) {
				aux2[contador]=a[i];
				contador++;
			}
		}
		String[] aux= new String[contador];
		aux=Arrays.copyOfRange(aux2,0,contador);
		System.out.println(arraryToString(aux));
		return aux;
	}
	public static StringBuilder arraryToString(String [] a) {
		StringBuilder array_a=(new StringBuilder()).append("");
		for (int i=0;i<a.length;i++ ) {
			array_a.append(a[i] + " ");
			
		}
		return array_a;
	}
	public static void ejercicio2_4(String [] a) {
		System.out.println("\n-> Ejercicio2.4:\n");
		if(a==null) {
			System.out.println("Array vacio");
		}else {
			System.out.println("\n Sy array es: \n" +arraryToString(a) + "\nEl resultado de aplicarle la funcion de ordenar alfabeticamente y eliminar las palabras de 5 letras o menos es: \n" + arraryToString(eliminarStringmenor5(shortOrderedHeroes(a)))+"\n");
		}
	
	}

}
