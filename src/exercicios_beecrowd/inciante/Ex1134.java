package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex1134 {
	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int qtd_alcool=0, qtd_gasolina=0, qtd_diesel=0, numero;
		
		do {
			numero = teclado.nextInt();
			if(numero==1) qtd_alcool++;
			else if(numero==2) qtd_gasolina++;
			else if(numero==3) qtd_diesel++;
		}while(numero!=4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n",qtd_alcool,qtd_gasolina,qtd_diesel);
	}
	
}
