package projeto_final_bloco_01.model;
import projeto_final_bloco_01.util.Cores;
public abstract class Sorvete {
	
	private String sabor;
	private int preco;
	private int quantidadeEstoque;
	private int calorias;
	private String tamanho;

	public Sorvete(String sabor, int preco, int quantidadeEstoque, int calorias, String tamanho) {
		this.sabor = sabor;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.calorias = calorias;
		this.tamanho = tamanho;
	}

    // Getters
    public String getSabor() {
        return sabor;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getCalorias() {
        return calorias;
    }

    public String getTamanho() {
        return tamanho;
    }

    // Setters
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

	
		public boolean colocarNaCasquinha(Sorvete sorvete) {
				System.out.printf("Colocamos com sucesso o sorvete de: %s na casquinha!", sorvete.getSabor());
				return true;
		}
	
		public void adicionarAoEstoque(Sorvete sorvete, int quantidade) {
			sorvete.setQuantidadeEstoque(sorvete.getQuantidadeEstoque() + quantidade);
			System.out.printf("Adicionamos com sucesso %d sorvetes de %s ao estoque! quantidade atualizada: %d", quantidade, sorvete.getSabor(), sorvete.getQuantidadeEstoque());
		}
		
		public void visualizar() {
			System.out.println(Cores.TEXT_GREEN +
					"———————————————————————————————————————————————————————————————————");
			System.out.println("Sabor do sorvete:" + this.getSabor());
			System.out.println("Calorias do sorvete:" + this.getCalorias());
			System.out.println("Tamanho do sorvete:" + this.getTamanho());
			System.out.println("Preço do sorvete:" + this.getPreco());
			System.out.println("Quantidade em estoque:" + this.getQuantidadeEstoque());
			System.out.println("———————————————————————————————————————————————————————————————————");
		}

}
