/**
 * 
 */
package lista;

import java.util.Scanner;

/**
 * @author elopa
 *
 */
public class Exerc1 {


	
	public static void main(String[] args) {
	
		        int[] vetor = new int[4];
		        int i, maior = 0;
		        
		     Scanner input = new Scanner(System.in);

		        for(i = 0; i < 3; i++)
		        {
		            System.out.print("Digite um valor: ");
		            vetor[i] = input.nextInt();
		            if(vetor[i] > maior)
		                maior = vetor[i];
		        }
		        System.out.println("O maior valor �: "+maior);
		    }

		}
		// TODO Auto-generated method stub

	


