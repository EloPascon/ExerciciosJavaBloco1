/**
 * 
 */
package exercicosLacosDeRepetição;


public class ExecFor {

	/*Informar todos os números de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)*/
	
	public static void main(String[] args) {
		
		
		for(int x = 1000; x <= 1999; x++)
		{
			if (x%11==5)
			{
			
				System.out.println("numeros divisiveis por 11 com resto 5 \n"+x);
			}
		}
	}

}
