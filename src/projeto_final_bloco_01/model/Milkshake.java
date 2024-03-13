package projeto_final_bloco_01.model;

import projeto_final_bloco_01.util.Cores;

public class Milkshake extends Sorvete {
	private String calda;
	private String recheio;
	public Milkshake(String sabor, int preco, int quantidadeEstoque, int calorias, String tamanho, String calda, String recheio) {
		super(sabor, preco, quantidadeEstoque, calorias, tamanho);
		this.calda = calda;
		this.recheio = recheio;
	}
	public String getCalda() {
		return calda;
	}
	public void setCalda(String calda) {
		this.calda = calda;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public boolean colocarNoCopo(Milkshake milkshake) {
		System.out.printf("Colocamos com sucesso o milkshake de: %s no copo!", milkshake.getRecheio());
		return true;
	}
	
	@Override
	public void visualizar() {
		System.out.println(Cores.TEXT_GREEN +
				"———————————————————————————————————————————————————————————————————");
		System.out.println("Sabor do Milkshake:" + this.getSabor());
		System.out.println("Calorias do Milkshake:" + this.getCalorias());
		System.out.println("Tamanho do Milkshake:" + this.getTamanho());
		System.out.println("Preço do Milkshake:" + this.getPreco());
		System.out.println("Recheio do Milkshake:" + this.getRecheio());
		System.out.println("Calda do Milkshake:" + this.getCalda());
		System.out.println("Quantidade em estoque:" + this.getQuantidadeEstoque());
		System.out.println("———————————————————————————————————————————————————————————————————");
	}

}
