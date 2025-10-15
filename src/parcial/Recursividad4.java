package parcial;
public class Recursividad4{
	public boolean esPalindromo(String palabra){
		System.out.println(palabra);
		if (palabra.length() <= 1) return true;
		if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) return false;
		return esPalindromo(palabra.substring(1,(palabra.length() -1)));
	}

	public static void main(String[] args){
		Recursividad4 rec = new Recursividad4();
		System.out.println(rec.esPalindromo("ayayyayayayayay"));
	}
}