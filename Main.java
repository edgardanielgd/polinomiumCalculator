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
	    term termino1=new term(1,'x',2);
	    term termino2=new term(4,'x',1);
	    term termino3=new term(4,'x',0);
	    ArrayList<term> lista = new ArrayList<>();
	    lista.add(termino1);
	    lista.add(termino2);
	    lista.add(termino3);
	    poli poli1=new poli(lista);
	    System.out.println(poli1.toString());	
	    if(poli1.IsTrinomium()) {
	    	System.out.println("Is trinomium");
	    	System.out.println(poli1.factors.get(0).toString());
	    }else System.out.println("Is not trinomium");}
}
