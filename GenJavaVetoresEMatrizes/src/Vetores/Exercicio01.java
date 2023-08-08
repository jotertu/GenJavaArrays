package Vetores;

import java.util.Scanner;

/*
 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá 
 * digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
 * Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser 
 * exibida na tela
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 *		Saída de dados
 *		Laços Condicionais
 *		Laços de Repetição
 *		Vetores
 */

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {2,5,1,3,4,9,7,8,10,6};
		int posicao = -1, numPesquisado, i;
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("Insira qual é o número que deseja pesquisar: ");
		numPesquisado = scanner.nextInt();
		
		for (i = 0; i < 10; i++) {
			if(numeros[i] == numPesquisado) {		
				posicao = i;
				break;
			} 
		}
		
		if (posicao != -1) {
			System.out.print("O número está localizado na posição: "+posicao);
		} else {
			System.out.print("O número "+numPesquisado+" não foi encontrado!");
		}
		
	}

}
