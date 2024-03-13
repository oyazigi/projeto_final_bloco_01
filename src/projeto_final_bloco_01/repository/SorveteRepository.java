package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Sorvete;

public interface SorveteRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrarSorvete(Sorvete sorvete);
	public void atualizarSorvete(Sorvete sorvete);
	public void deletarSorvete(int numero); 
	
}
