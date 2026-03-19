package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1165 {
	public static void main(String args[]) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int N_testes,contador=0;
		N_testes = teclado.nextInt();
		int [] numero = new int[N_testes];
		
		for(int cont=0;cont<N_testes;cont++) {
			numero[cont] = teclado.nextInt();
		}
		
		for(int cont=0;cont<N_testes;cont++) {
			for(int cont2=1;cont2<=numero[cont];cont2++) {
				if(numero[cont]%cont2==0) {
					contador++;
				}
			}
			if(contador==2) {
				System.out.printf("%d eh primo\n",numero[cont]);
			}
			else System.out.printf("%d nao eh primo\n",numero[cont]);
			contador=0;
		}
	}
}