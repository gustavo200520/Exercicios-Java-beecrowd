package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1789 {
	public static void main(String args[]) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int casos,velocidade, maiorNota=1, maiorVelo=0, contador=0;
		
		while (teclado.hasNext()) {
			casos=teclado.nextInt();
			for(int cont=0;cont<casos;cont++) {
				velocidade=teclado.nextInt();
				while(contador==0) {
					maiorVelo=velocidade;
					contador++;
				}
				if(velocidade>maiorVelo) {
					maiorVelo=velocidade;
				}
			}
			if(maiorVelo<10) {
				maiorNota=1;
			}
			else if(maiorVelo>=10 && maiorVelo<20) {
				maiorNota=2;
			}
			else maiorNota=3;
			System.out.println(maiorNota);
			contador=0;
		}
	}
}