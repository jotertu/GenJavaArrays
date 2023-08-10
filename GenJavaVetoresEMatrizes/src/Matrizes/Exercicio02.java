package Matrizes;

import java.util.Scanner;
/*
 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4
 * bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma
 * linha de uma matriz de números reais, logo cada linha da matriz serão as notas de
 * um participante. Em um vetor de números reais, armazene as médias de cada
 * participante e exiba as médias de cada um na tela.
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Laços Condicionais
 * 		Laços de Repetição
 * 		Matrizes
 */
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] numeros = new float[10][4];
        float media[] = new float[10];    
        int l, c;
        
        Scanner scanner = new Scanner(System.in);
        
        for (l = 0; l < 10; l++) {
        	float sum = 0;
            for (c = 0; c < 4; c++) {
                System.out.printf("Insira a nota do %dª aluno [%d][%d]: ", (l + 1), l, c);
                numeros[l][c] = scanner.nextFloat();
                sum += numeros[l][c]; 
            }
            media[l] = sum/4;
        }
        
        for (l = 0; l < 10; l++) {
            System.out.printf("A Média Aritmética do %dª aluno é igual a: %.2f%n", (l + 1), media[l]);
        }
	}

}
