package ExercOrientaçãoAoObjeto;

public class Cliente {
	
public static void main(String[] args) {
		
		ModeloCliente cliente = new ModeloCliente();
		
		
		 System.out.println("Cliente");
	       cliente.idade=19;
	       cliente.interesse=true;
	       cliente.estadoAtual();
	       cliente.nome="Eloisa";
	       cliente.sobrenome="Pascon";
	    
	       

	        System.out.println("");
	
	   	 System.out.println("Cliente");
	       cliente.idade=49;
	       cliente.interesse=false;
	       cliente.estadoAtual();
	       cliente.nome="Regina";
	       cliente.sobrenome="Pascon";
	       
	
	     

           System.out.println("");
      }
	

}
