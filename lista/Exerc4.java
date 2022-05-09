/**
 * 
 */
package lista;

import java.util.Scanner;

/**
 * @author elopa
 *
 */
public class Exerc4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner (System.in);
				
				int p1;
				
				System.out.println("digite um numero:");
				p1= ler.nextInt();
				
				if (p1%2==0)
				{
					Math.sqrt(p1);
					System.out.println("numero par e a raiz desse numero é"+Math.sqrt(p1));
					
				}
				else {
					
					Math.pow(p1, 2);
					System.out.println("numero impar e esse numero elevado é tanto"+Math.pow(p1, 2));
					
				}
					

	}

}
