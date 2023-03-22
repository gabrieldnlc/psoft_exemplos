package mercado;

public class Controller
{
	
	private Repositorio repo;
	
	public Controller()
	{
		repo = new Repositorio();
	}
	
	public Produto addProduto(Produto prod)
	{
		return repo.addProduto(prod);
	}
	
	public Produto criaProduto(String nome, String fabricante, double preco)
	{
		Produto novo = new Produto(nome, fabricante, preco);
		return repo.addProduto(novo);
	}
	
}
