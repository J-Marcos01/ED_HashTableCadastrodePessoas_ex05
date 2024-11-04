package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.CadastroController;
import controller.ICadastroController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) throws Exception {

		ICadastroController cont=new CadastroController();
		
		
		int opc=0;
		
		while(opc!=9) {
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1-Cadastrar pessoa \n2-Buscar pessoa \n3-Excluir pessoa \n9-Finalizar","Menu",JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
			case 1: {
				Pessoa aux = new Pessoa();
				String nome=JOptionPane.showInputDialog(null,"Digite o nome da pessoa","Novo Cadastro de Pessoas",JOptionPane.INFORMATION_MESSAGE);
				aux.setNome(nome);
				int idade=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade da pessoa","Novo Cadastro de Pessoas",JOptionPane.INFORMATION_MESSAGE));
				aux.setIdade(idade);
		
				try {
					cont.insere(aux);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				Pessoa aux = new Pessoa();
				String nome=JOptionPane.showInputDialog(null,"Digite o nome da pessoa","Novo Cadastro de Pessoas",JOptionPane.INFORMATION_MESSAGE);
				aux.setNome(nome);
				try {
					cont.busca(aux);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				Pessoa aux = new Pessoa();
				String nome=JOptionPane.showInputDialog(null,"Digite o nome da pessoa","Novo Cadastro de Pessoas",JOptionPane.INFORMATION_MESSAGE);
				aux.setNome(nome);
				
				try {
					cont.exclui(aux);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 9: {
				JOptionPane.showMessageDialog(null, "Finalizando...","Fim",JOptionPane.ERROR_MESSAGE);
			break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Digite 1 , 2 , 3 ou 9","Valor inválido",JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		
	}
		
		
	}


