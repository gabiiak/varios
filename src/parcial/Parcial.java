package parcial;

public class Parcial {
	class Nodo {
		int info;
		Nodo ant, sig;
	}
	private Nodo raiz;
	
	public Parcial(){
		raiz = null;
	}
	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco != null) {
			cant++;
			reco = reco.sig;
		}
		return cant;
		
	}
	public void insertar(int x1, int x2) {
		Nodo nuevo1 = new Nodo();
		Nodo nuevo2 = new Nodo();
		Nodo reco = raiz;
		nuevo1.info = x1;
		nuevo2.info = x2;
		
		nuevo1.sig = nuevo2;
        nuevo2.ant = nuevo1;
		
		if(raiz == null) {
			raiz = nuevo1;
			return;
		}else if(cantidad() == 2 || cantidad() == 6) {
			nuevo2.sig = raiz;
			raiz.ant = nuevo2;
			raiz = nuevo1;
			
			/*raiz.ant = nuevo2;
			nuevo2.sig = raiz;
			raiz = nuevo1;*/
		}else {
			while (reco.sig != null) {
				reco = reco.sig;
			}
			reco.sig = nuevo1;
			nuevo1.ant = reco;
		}
		
	}
	public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print(reco.info);
            if (reco.sig != null) {
                System.out.print("-");
            }
            reco = reco.sig;
        }
        System.out.println();
    }
	public void sumarPares() {
		Nodo reco = raiz;
		int suma = 0;
		int pos = 1; //comienzo a partir de una posición par
		if (raiz == null) System.out.println("la lista está vacía");
		while (reco != null) {
			if (pos % 2 == 0) {
				suma = suma + reco.info;
			}
			pos++;
			reco = reco.sig;
		}
		System.out.println("la suma de todas las posiciones es: " + suma);
	}
	public void borrarMenores() {
		int primero = raiz.info;
		Nodo reco = raiz.sig;
		Nodo anterior = reco;
		while(reco != null) {
			if (reco.info < primero) {
                anterior = reco.ant;
                anterior.sig = reco.sig;
                if (reco.sig != null)
                    reco.sig.ant = anterior;
            }
            reco = reco.sig;
		}
	}
	public boolean buscar(int x) {
		Nodo reco = raiz;
        while (reco != null) {
            if (reco.info == x) {
                return true;
            }
            reco = reco.sig;
        }
        return false;
    }
	
    
	public static void main (String[] args) {
		Parcial par = new Parcial();
		/*punto 1*/
		par.insertar(15,2);
		par.insertar(3,4);
		par.insertar(5,6);
		par.insertar(7,8);
		par.insertar(15,20);
		par.imprimir();
		/*punto 2*/
		par.sumarPares();
		
		/*punto 5*/
		par.borrarMenores();
		par.imprimir();
		/*punto 6*/
		System.out.println("el elemento 3 existe en la lista? " + par.buscar(3));
		
		
	}
}
