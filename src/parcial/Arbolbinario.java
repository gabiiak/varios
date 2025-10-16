package parcial;

public class Arbolbinario {

	public static class Nodo{
		int dato;
		Nodo izquierdo, derecho;
		
		public Nodo(int dato) {
			this.dato = dato;
			izquierdo = derecho = null;
		}
	}
	class ArbolbinarioOrdenado{
		Nodo raiz;
		public ArbolbinarioOrdenado(){
			raiz = null;
		}
		public void insertar(int dato) {
			raiz = insertarRec(raiz,dato);
		}
		private Nodo insertarRec(Nodo raiz, int dato) {
			if (raiz == null) {
				raiz = new Nodo(dato);
				return raiz;
			}
			if (dato < raiz.dato) {
				raiz.izquierdo = insertarRec(raiz.izquierdo, dato);
			}
			if (dato > raiz.dato) {
				raiz.derecho = insertarRec(raiz.derecho, dato);
			}
			return raiz;
		}
		public void preorden(Nodo nodo) {
			if (nodo != null) {
				System.out.print(nodo.dato + "-");
				preorden(nodo.izquierdo);
				preorden(nodo.derecho);
			}
		}
		public void entreorden(Nodo nodo) {
			if (nodo != null) {
				entreorden(nodo.izquierdo);
				System.out.print(nodo.dato + "-");
				entreorden(nodo.derecho);
			}
		}
		public void postorden(Nodo nodo) {
			if (nodo != null) {
				postorden(nodo.izquierdo);
				postorden(nodo.derecho);
				System.out.print(nodo.dato + "-");
			}
		}
	}
	public static int contarHojas(Nodo nodo) {
		if (nodo == null) { //caso base
			return 0;
		}
		if (nodo .izquierdo == null && nodo.derecho == null) {
			return 1;
		}
		return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
	}
	public static int contarRamas(Nodo nodo) {
		if (nodo == null || (nodo.izquierdo == null && nodo.derecho == null)) return 0;
		return 1 + contarRamas(nodo.izquierdo) + contarRamas(nodo.derecho);
	}
	public static int altura(Nodo nodo) {
		if (nodo == null) {
			return 0;
		}
		int altizq = altura(nodo.izquierdo);
		int altder = altura(nodo.derecho);
		if (altder < altizq) return 1 + altizq;
		else return 1 + altder;
	}
	
	
	public static void main(String[] args) {
			Arbolbinario main = new Arbolbinario();
			ArbolbinarioOrdenado arbol = main.new ArbolbinarioOrdenado();
			int[] dato = {400,100,700,50,200,1200,15,75,300,28,983,600};
			for (int i = 0; i < dato.length; i++) {
				arbol.insertar(dato[i]);
			}
			
			System.out.println("preorden: ");
			arbol.preorden(arbol.raiz);
			
			System.out.println("\nentreorden: ");
			arbol.entreorden(arbol.raiz);
			
			System.out.println("\npostorden: ");
			arbol.postorden(arbol.raiz);
			
			System.out.println("\nCantidad de hojas: " + contarHojas(arbol.raiz));
			System.out.println("\nCantidad de Ramas: " + contarRamas(arbol.raiz));
			System.out.println("\nAltura: " + altura(arbol.raiz));
			
	}

}
