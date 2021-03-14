package ejerciciosopcionales;

public class Ejercicio3_1 {
private int x;
private int y;
private int z;
	public Ejercicio3_1() {
		this.x=0;
		this.y=0;
		this.z=0;
			
	}

	public Ejercicio3_1(int a, int b, int c) {
		this.x=a;
		this.y=b;
		this.z=c;
				
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=3;
		int y=2;
		int z=1;
		
		Ejercicio3_1 punto0= new Ejercicio3_1();
		Ejercicio3_1 punto1= new Ejercicio3_1(1,2,3);
		Ejercicio3_1 punto2= new Ejercicio3_1();
		punto2.setX(x);
		punto2.setY(y);
		punto2.setZ(z);
		System.out.println("Ejercicio 3.1:\n"+"Punto de coordenadas en el origen P0: ("+ Integer.toString(punto0.getX())+", " + Integer.toString(punto0.getY()) + ", "  + Integer.toString(punto0.getZ())+ ") "
				+ "\nPunto de coordenadas en  P1: ("+ Integer.toString(punto1.getX())+", " + Integer.toString(punto1.getY()) + ", "  + Integer.toString(punto1.getZ())+ ")"+""
						+ "\nPunto de coordenadas en  P2: ("+ Integer.toString(punto2.getX())+", " + Integer.toString(punto2.getY()) + ", "  + Integer.toString(punto2.getZ())+ ")");
		
	}

}
