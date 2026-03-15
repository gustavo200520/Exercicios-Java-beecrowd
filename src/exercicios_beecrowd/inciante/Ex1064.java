package exercicios_beecrowd.inciante;
import java.io.IOException;
import java.util.Scanner;

//Lembrar que no beecrowd a classe deve ser Main nao pode ter o package
public class Ex1064 {
	public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int tamanho=6, contador_numeros = 0;
        float media = 0;
        float [] numero = new float[tamanho];
        
        for(int cont=0;cont<tamanho; cont++) {
            numero[cont] = teclado.nextFloat();
        }

        for(int cont=0;cont<tamanho;cont++) {
            if(numero[cont]>0) {
                contador_numeros++;
                media = (media + numero[cont]);
            }
        }
        
        System.out.printf("%d valores positivos\n",contador_numeros);
        System.out.printf("%.1f\n",media/contador_numeros);
    }

}
