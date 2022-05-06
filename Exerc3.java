/**
 * 
 */
package lista;

import java.util.Scanner;

/**
 * @author elopa
 *
 */
public class Exerc3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("escreva sua idade");
		idade=leia.nextInt();
				
			if (idade>=10 && idade<=14)
			{
				System.out.println("infantil");
			}
			else if (idade>=15 && idade<=17)
			{
				System.out.println("juvenil");
			}
			else if (idade>=18)
			{
				System.out.println("adulto");
			}
			else 
			{
				System.out.println("não tem idade para participar");
			}

	}

}
