package ExercOrientaçãoAoObjeto;


public class Patinete {

	public static void main(String[] args) {
		
		ModeloPatinete patinete = new ModeloPatinete();
		
		
		 System.out.println("patinete");
	        patinete.velocidade = 100;
	        patinete.freio=true;
	        patinete.estadoAtual();
	        patinete.movimento();

	        System.out.println("");
	}
}
