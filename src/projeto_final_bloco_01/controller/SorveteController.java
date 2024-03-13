package projeto_final_bloco_01.controller;

import java.util.ArrayList;

import projeto_final_bloco_01.repository.SorveteRepository;
import projeto_final_bloco_01.model.Sorvete;
import projeto_final_bloco_01.model.Milkshake;

public class SorveteController implements SorveteRepository {
	private ArrayList<Sorvete> listaSorvetes = new ArrayList<Sorvete>();
	private ArrayList<Milkshake> listaMilkshakes = new ArrayList<Milkshake>();
	static int numero = 0;
    

    @Override
    public void procurarPorNumero(int numero, int tipo) {
    	if(tipo == 1) {
    		var sorvete = buscarSorveteNaCollection(numero);
    		if (sorvete != null)sorvete.visualizar();
    		else System.out.println("\nO Sorvete número: " + numero + " não foi encontrado!");	
    	}else if (tipo == 2) {
    		var milkshake = buscarMilkshakeNaCollection(numero);
    		if (milkshake != null)milkshake.visualizar();
    		else System.out.println("\nO Milkshake número: " + numero + " não foi encontrado!");	
    	}else System.out.println("\nTipo inválido! Digite 1 para sorvete e 2 para milkshake");
    }


    @Override
    public void listarTodos() {
        for (var sorvete : listaSorvetes) {
			sorvete.visualizar();
		}
        for (var milkshake : listaMilkshakes) {
			milkshake.visualizar();
		}   
    }

    @Override
    public void cadastrarSorvete(Sorvete sorvete) {
		listaSorvetes.add(sorvete);
		System.out.println("\nO Sorvete número: " + sorvete.getId() + " foi criado com sucesso!");
    }

    public void cadastrarMilkshake(Milkshake milkshake) {
		listaMilkshakes.add(milkshake);
		System.out.println("\nO Milkshake número: " + milkshake.getId() + " foi criado com sucesso!");
    }


    @Override
    public void atualizarSorvete(Sorvete sorvete) {
        var buscaSorvete = buscarSorveteNaCollection(sorvete.getId());
		
		if (buscaSorvete != null) {
			listaSorvetes.set(listaSorvetes.indexOf(buscaSorvete), sorvete);
			System.out.println("\nO Sorvete numero: " + sorvete.getId() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO Sorvete numero: " + sorvete.getId() + " não foi encontrado!");
    }
    
    public void atualizarMilkshake(Milkshake milkshake) {
        var buscaMilkshake = buscarMilkshakeNaCollection(milkshake.getId());
		
		if (buscaMilkshake != null) {
			listaMilkshakes.set(listaMilkshakes.indexOf(buscaMilkshake), milkshake);
			System.out.println("\nO Milkshake numero: " + milkshake.getId() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO Milkshake numero: " + milkshake.getId() + " não foi encontrado!");
    }

    @Override
    public void deletarSorvete(int numero)  {
        var sorvete = buscarSorveteNaCollection(numero);
		
		if (sorvete != null) {
			if(listaSorvetes.remove(sorvete) == true)
				System.out.println("\nO Sorvete numero: " + numero + " foi deletado com sucesso!");
		}else
			System.out.println("\nO Sorvete numero: " + numero + " não foi encontrado!");
    }
    
    public void deletarMilkshake(int numero)  {
        var milkshake = buscarMilkshakeNaCollection(numero);
		
		if (milkshake != null) {
			if(listaMilkshakes.remove(milkshake) == true)
				System.out.println("\nO Milkshake numero: " + numero + " foi deletado com sucesso!");
		}else
			System.out.println("\nO Milkshake numero: " + numero + " não foi encontrado!");
    }

    
	public static int gerarNumero() {
				
		return ++ numero;

	}


	public Sorvete buscarSorveteNaCollection(int numero) {
		for (var sorvete : listaSorvetes) {
			if (sorvete.getId() == numero) {
				return sorvete;
			}
		}
		
		return null;
	}
	public Sorvete buscarMilkshakeNaCollection(int numero) {
		for (var milkshake : listaMilkshakes) {
			if (milkshake.getId() == numero) {
				return milkshake;
			}
		}
		
		return null;
	}
}
