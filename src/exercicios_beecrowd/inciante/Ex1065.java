package exercicios_beecrowd.inciante;
import java.io.IOException;
import java.util.Scanner;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1065 { 
	    public static void main(String[] args) throws IOException {
	    	Scanner teclado = new Scanner(System.in);	  
	    	int [] numero = new int[5];
	    	int contador_par=0;
	    	
	    	for(int cont=0;cont<5;cont++) {
	    		numero[cont]= teclado.nextInt();
	    	}
	    	
	       for(int cont=0;cont<5;cont++) {
	    	   if(numero[cont]%2==0) {
	    		   contador_par++;
	    	   }
	       }
	       
	       System.out.printf("%d valores pares\n",contador_par);
	    }
	 
	}