package ExercOrientaçãoAoObjeto;

public class ModeloCliente {
	//Caracteristicas atributos
	
	String nome;
	String sobrenome;
	int idade;
	boolean interesse;
	
	//comportamentos métodos
	
	public ModeloCliente()
    {
        this.nome = "Eloísa";
        this.sobrenome = "Pascon";
        this.idade = 19;
        this.interesse = true;
    }

public void compra()
{
	if (this.interesse==true)
		System.out.println("ele compra meu produto");
	else 
		System.out.println("não compra");
}

public void comprar()
{
    this.interesse=true;
}

public void não()
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
