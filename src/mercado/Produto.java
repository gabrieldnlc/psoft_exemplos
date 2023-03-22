package mercado;

public class Produto
{
	private String nome;
	private String id;
	private String fabricante;
	private double preco;
		
	public Produto(String nome, String fabricante, double preco)
	{
		this.nome = nome;
		this.id = nome; // TODO ID única para cada instância
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public String getNome() { return nome; }
	public String getFabricante() { return fabricante; }
	public String getID() { return id; }
	public double getPreco() { return preco; }
	
}
