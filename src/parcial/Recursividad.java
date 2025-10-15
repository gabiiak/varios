package parcial;
/*imprimir la sucesion de fibonacci hasta un num especificado por parámetro
 * 
 * ej: 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21...
 * 
 * sumar los digitos que componen un numero más grande...
 * 
 * ej: 123 = 1 + 2 + 3 = 6*/

	
public class Recursividad {
	public int fibonacci(int n)
	{
		if (n <= 0) 
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return fibonacci (n - 1) + fibonacci (n - 2);
		}
		
	}
	public static void main(String[] args) 
		{
		Recursividad re = new Recursividad();
		System.out.println("sucesion de fibonacci");
		for (int i = 0; i < 5; i++) {
			System.out.print(re.fibonacci(i) + " - ");
		}
	}

}
