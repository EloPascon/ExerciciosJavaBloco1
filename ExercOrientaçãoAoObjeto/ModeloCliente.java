package ExercOrienta��oAoObjeto;

public class ModeloCliente {
	//Caracteristicas atributos
	
	String nome;
	String sobrenome;
	int idade;
	boolean interesse;
	
	//comportamentos m�todos
	
	public ModeloCliente()
    {
        this.nome = "Elo�sa";
        this.sobrenome = "Pascon";
        this.idade = 19;
        this.interesse = true;
    }

public void compra()
{
	if (this.interesse==true)
		System.out.println("ele compra meu produto");
	else 
		System.out.println("n�o compra");
}

public void comprar()
{
    this.interesse=true;
}

public void n�o()
{
    this.interesse=false;
}

public void estadoAtual()
{
    System.out.println("nome "+this.nome);
    System.out.println("sobrenome: "+this.sobrenome);
    System.out.println("idade: "+this.idade);
    System.out.println("compra? "+this.interesse);
}

}
