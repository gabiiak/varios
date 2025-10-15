package parcial;
import java.io.File;
public class Recursividad3 {
	public void leer(String inicio, String altura) {
		File ar = new File(inicio);
		String[] dir = ar.list();
		for(int i = 0; i<dir.length;i++) {
			File ar2 = new File(inicio + dir[i]);
			if(ar2.isFile()) {
				System.out.println(altura + dir[i]);
				
			}
			if(ar2.isDirectory()) {
				System.out.println(altura + "Dir: " + dir[i].toUpperCase());
				leer(inicio + dir[i] + "\\", altura + " ");
			}
		}
	}
	public static void main(String[] args) {
		Recursividad3 rec = new Recursividad3();
		rec.leer("C:\\Users\\alumno\\Desktop\\holi", "");
		
	}

}
