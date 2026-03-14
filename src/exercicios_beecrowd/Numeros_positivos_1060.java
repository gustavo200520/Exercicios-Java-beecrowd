package exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Numeros_positivos_1060 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int tamanho=6;
        int contador_numeros = 0;
        float [] numero = new float[tamanho];
        for(int cont=0;cont<tamanho; cont++) {

            numero[cont] = teclado.nextFloat();
        }

        //a
        for(int cont=0;cont<tamanho;cont++) {

            if(numero[cont]>0) {
                contador_numeros++;
            }

        }
        System.out.printf("%d valores positivos\n",contador_numeros);

    }
}