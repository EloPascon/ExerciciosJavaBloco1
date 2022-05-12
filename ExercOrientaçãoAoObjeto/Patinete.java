package ExercOrientaçãoAoObjeto;


public class Patinete {

	public static void main(String[] args) {
		
		ModeloPatinete patinete = new ModeloPatinete();
		
		
		 System.out.println("patinete 1");
	        patinete.velocidade = 100;
	        patinete.freio=true;
	        patinete.estadoAtual();
	        patinete.movimento();

	        System.out.println("");
	
	       
	
	       System.out.println("patinete 2");
           patinete.velocidade = 80;
           patinete.freio=false;
           patinete.estadoAtual();
           patinete.movimento();

           System.out.println("");
      }
}
