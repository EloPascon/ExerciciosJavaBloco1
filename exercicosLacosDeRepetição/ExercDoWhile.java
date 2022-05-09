/**
 * 
 */
package exercicosLacosDeRepetição; 

import java.util.Scanner; 


public class ExercDoWhile {

	/**
	Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int n, soma=0, cont=0, media=0;
		
		do 
		{
			System.out.println("digite um numero ");
			n=ler.nextInt();
			
			if (n%3==0 && n!=0)
			{
				cont++;
				soma=soma+n;
			}
			
		
			
		
		} while  (n!=0);
		ler.close();
		media=soma/cont;
		System.out.println("a média dos numeros é "+media);
		
		
		

	}

} 
