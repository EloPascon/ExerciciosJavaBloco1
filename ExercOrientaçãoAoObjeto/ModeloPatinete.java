package ExercOrientaçãoAoObjeto;

public class ModeloPatinete {
	//caracteristicas atributos
	
	String cor;
	double peso;
	int velocidade;
	boolean freio;
	
	
	
	//comportamento métodos 
	
	  public ModeloPatinete()
	    {
	        this.cor = "azul";
	        this.peso = 10.5;
	        this.velocidade = 100;
	        this.freio = true;
	    }
	
	public void locomover()
	{
		if (this.freio==true)
			System.out.println("se freiar ele para");
		else 
			System.out.println("continua em movimento");
	}
	
	public void freiar()
    {
        this.freio=true;
    }

    public void movimento()
    {
        this.freio=false;
    }

    public void estadoAtual()
    {
        System.out.println("Cor: "+this.cor);
        System.out.println("Peso: "+this.peso);
        System.out.println("velocidade : "+this.velocidade);
        System.out.println("freio em uso? "+this.freio);
    }

	
	

}
