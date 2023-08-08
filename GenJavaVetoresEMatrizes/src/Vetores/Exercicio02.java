package Vetores;

import java.util.Scanner;

/*
 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em
 * seguida, mostre na tela:
 * Todos os elementos dos índices ímpares do vetor
 * Todos os elementos do vetor que são números pares
 * A Soma de todos os elementos do vetor
 * A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Laços Condicionais
 * 		Laços de Repetição
 * 		Vetores
 */

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		int i;
		String indicesImpares = "", indicesPares = "";
		double media = 0, soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Insira um valor para adicionar ao vetor [%d]: ",i);
			numeros[i] = scanner.nextInt();
			if(i % 2 == 0) {
			 indicesPares += numeros[i]+ " ";
			}
			
			if(i % 2 != 0) {
			 indicesImpares += numeros[i]+ " ";
			}
		
		}
		
		for(i = 0; i < 10; i++) {
			soma += numeros[i] ;
		}
		
		media = soma / 10;
		
		System.out.print("\nElementos nos indices impares: "+indicesImpares);
		System.out.print("\nElementos nos indices pares: "+indicesPares);
		System.out.printf("\nSoma: %.0f ",soma);
		System.out.printf("\nMédia: %.2f ",media);
	}

}
