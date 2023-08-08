package Matrizes;

import java.util.Scanner;
/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
 * Todos os elementos da Diagonal Principal
 * Todos os elementos da Diagonal Secundária
 * A Soma de todos os elementos da Diagonal Principal
 * A Soma de todos os elementos da Diagonal Secundária
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Laços Condicionais
 * 		Laços de Repetição
 * 		Matrizes
 */
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int[3][3];
		int l, c, somaDPrimaria = 0, somaDSecundaria = 0;
		String elementosDPrincipal= "", elementosDSecundaria= "";
		
		Scanner scanner = new Scanner(System.in);
		
		for(l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.printf("Insira os valores que deseja atribuir ao array 3x3 [%d][%d]:  ",l, c);
				numeros[l][c] = scanner.nextInt();
				
				if(l == c) {
					elementosDPrincipal += numeros[l][c]+ " ";
					somaDPrimaria += numeros[l][c];
				}
				
				if(l+c == 2) {
					elementosDSecundaria += numeros[l][c]+" ";
					somaDSecundaria += numeros[l][c];
				}
			}
		}
		System.out.println("\nElementos da diagona principal: "+elementosDPrincipal);
		System.out.println("\nElementos da diagona secundaria: "+elementosDSecundaria);
		System.out.println("\nSomatório dos elementos da diagona principal: "+somaDPrimaria);
		System.out.println("\nSomatório dos elementos da diagona secundaria: "+somaDSecundaria);		
	}

}
