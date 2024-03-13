package projeto_final_bloco_01;
import java.util.InputMismatchException;

import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;
import projeto_final_bloco_01.model.Sorvete;

public class Menu {

    public static void main(String[] args) {
    	Sorvete teste = new Sorvete("Chocolate",15,100,500,"Pequeno(300ML)");
    	teste.visualizar();
        mostrarMenu();
    }

    public static void sobre() {
        System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND +
                "———————————————————————————————————————————————————————————————————");
        System.out.println("Desenvolvido por: Victor Yazigi Saliba");
        System.out.println("github.com/oyazigi");
        System.out.println("E-mail para contato profissional: victoryazigicontv@gmail.com");
        System.out.println("———————————————————————————————————————————————————————————————————");
    }
    public static void digitarOpcao() {
    	int op = 0;
        Scanner scan = new Scanner(System.in);
        try{op = scan.nextInt();}
        catch(InputMismatchException e) {System.out.println("Tipo de dado inválido, favor digitar novamente"); digitarOpcao();} 
        switch (op) {
            case 1:
              
                break;
            case 2:
              
                break;
            case 3:
             
                break;
            case 4:
            
                break;
            case 5:
           
                break;
            case 6:
               
                break;
            case 7:
              
                break;
            case 8:
                
                break;
            case 9:
                sobre();
                scan.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                mostrarMenu();
                break;
        }
    }
    public static void mostrarMenu() {  
        System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND +
                "___________________________________________________________________");
        System.out.println("                  Sorveteria Mágica do Victor                      ");
        System.out.println("———————————————————————————————————————————————————————————————————");
        System.out.println("								   ");
        System.out.println("		  1 - Cadastrar Sorvete				   ");
        System.out.println("		  2 - Listar todos os Sorvetes	   		   ");
        System.out.println("		  3 - Buscar Sorvete por Numero			   ");
        System.out.println("		  4 - Atualizar dados do Sorvete		   ");
        System.out.println("		  5 - Excluir Produto			           ");
        System.out.println("		  9 - Sair					   ");
        System.out.println("———————————————————————————————————————————————————————————————————");
        System.out.println("Digite a opção desejada:					   " + Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND);
        digitarOpcao();
    }
}
