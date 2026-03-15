package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1117 {
	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, cont_notas_validas=0, media=0;
		
		boolean nota_valida1= false, nota_valida2= false;
		
		do {
			do {
				nota1 = teclado.nextFloat();
				if(nota1>=0 && nota1<=10) {
					nota_valida1 = true;
					cont_notas_validas++;
				}
				else System.out.printf("nota invalida\n");
			}while(!nota_valida1);
			do {
				nota2 = teclado.nextFloat();
				if(nota2>=0 && nota2<=10) {
					nota_valida2 = true;
					cont_notas_validas++;
				}
				else System.out.printf("nota invalida\n");
			}while(!nota_valida2);
		}while(cont_notas_validas<2);
		
		if(cont_notas_validas == 2) {
			media = (nota1+nota2)/2;
			System.out.printf("media = %.2f\n",media);
		}
	}
}
