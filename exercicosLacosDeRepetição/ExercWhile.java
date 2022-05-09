/**
 * 
 */
package exercicosLacosDeRepetição;

import java.util.Scanner;

/**
 	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
	 */
 
public class ExercWhile {


	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
		int n, i21=0, i50=0;
		
		System.out.println("Escreva sua idade");
		n=ler.nextInt();
		while (n!=99 && n>=100)
		{
					if (n<21)
					{
						i21=i21+1;
					  
					}
					if (n>50)
					{
						i50=i50+1;
					}
					
			}
			System.out.println("Total de idade menores de 21 é"+i21);
			System.out.println("Total de idade maiores de 50 é"+i50);
	}
}
		
		
			
		
	
		
		
	

	


