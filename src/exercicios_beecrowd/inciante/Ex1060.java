package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;

//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1060 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int tamanho=6;
        int contador_numeros = 0;
        float [] numero = new float[tamanho];
        for(int cont=0;cont<tamanho; cont++) {

            numero[cont] = teclado.nextFloat();
        }


        for(int cont=0;cont<tamanho;cont++) {

            if(numero[cont]>0) {
                contador_numeros++;
            }

        }
        System.out.printf("%d valores positivos\n",contador_numeros);

    }
}