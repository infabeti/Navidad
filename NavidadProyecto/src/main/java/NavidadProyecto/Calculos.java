package NavidadProyecto;

public class Calculos {
	
	private int a;
	private int b;
	private int c;
	public int suma(int x, int y) {
		return x+y;
	}
	
	public int resta(int x, int y) {
		return x-y;
	}
	
	public double division(double x, double y) {
		if(y==0) {
			return -1;
		}
		else {
			return x/y;
		}	
	}
	
}
