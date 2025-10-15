package parcial;

public class Recursividad2 {
	public int sumarDig(int n) {
		if (n < 10) {
			return n;
		}else {
			return n % 10 + sumarDig(n / 10);
		}
	}
	public static void main(String[] args) {
		Recursividad2 re = new Recursividad2();
		int cant = 689;
		int suma = re.sumarDig(cant);
		System.out.println("la suma de los dígitos de " + cant + " es " + suma);

	}

}
