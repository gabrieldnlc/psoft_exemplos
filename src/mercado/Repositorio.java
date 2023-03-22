package mercado;

import java.util.HashMap;

public class Repositorio
{ 
	private HashMap<String, Produto> produtos;
	
	
	public Repositorio()
	{
		produtos = new HashMap<String, Produto>(); // <produto.ID, instância de Produto>
	}
	
	public boolean contemProduto(String id)
	{
		return (produtos.get(id) == null ? false : true);
	}
	
	/**
	 * Getter de um item no repositório.
	 * @param id ID única do produto.
	 * @return uma instância de Produto ou null, se Produto não existir no repositório.
	 */
	public Produto getProduto(String id)
	{
		return produtos.get(id);
	}
	
	public Produto addProduto(Produto prod)
	{
		return produtos.put(prod.getID(), prod);
	}
}
