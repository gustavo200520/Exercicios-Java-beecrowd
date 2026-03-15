package exercicios_beecrowd.inciante;
import java.io.IOException;
import java.util.Scanner;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1067 {
	public static void main(String[] agrs) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int numero;
		numero = teclado.nextInt();
		
		if(numero>=1 && numero<=1000) {
			for(int cont=0;cont<=numero;cont++) {
				if(cont%2!=0) {
					System.out.println(cont);
				}
			}	
		}
	}
}
