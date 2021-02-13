import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	
	public static void printf(String cadena) {
		System.out.println(cadena);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    term termino1=new term(2,'x',2);
	    term termino2=new term(3,'x',4);
	    ArrayList<term> lista = new ArrayList<>();
	    lista.add(termino1);
	    lista.add(termino2);
	    poli poli1=new poli(lista);
	}
}
