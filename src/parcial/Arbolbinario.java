package parcial;

public class Arbolbinario {

	class Nodo{
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
	
	
	public static void main(String[] args) {
			Arbolbinario main = new Arbolbinario();
			ArbolbinarioOrdenado arbol = main.new ArbolbinarioOrdenado();
			int[] dato = {400,100,700,50,200,1200,15,75,300};
			for (int i = 0; i < dato.length; i++) {
				arbol.insertar(dato[i]);
			}
			
			System.out.println("preorden: ");
			arbol.preorden(arbol.raiz);
			
			System.out.println("\nentreorden: ");
			arbol.entreorden(arbol.raiz);
			
			System.out.println("\npostorden: ");
			arbol.postorden(arbol.raiz);
	}

}
