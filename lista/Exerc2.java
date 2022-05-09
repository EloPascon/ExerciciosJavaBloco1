/**
 * 
 */
package lista;

import java.util.Scanner;

/**
 * @author elopa
 *
 */
public class Exerc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner ler = new Scanner (System.in);
			   
			   int[] n= new int [3];
	           int dado, p;
	           
	           for(int x=0; x<3; x++)
	           {
	        	   System.out.println("digite um valor");
	        	   n[x]=ler.nextInt();
	           }
	           for (int x=0; x<3; x++)
	           {
	               dado=n[x];
	            	p=x-1;	
	            	while (p>=0 && n[x]> dado)
	            	{
	            		n[x+1]= n[p];
	            				p=p-1;
	            	}
	            	n[p+1]=dado;
	           
	           }
	           for (int x=0; x<3; x++)
	           {
	        	   System.out.println("A ordem é "+ n[x]);
	           }
	           

	}

}
