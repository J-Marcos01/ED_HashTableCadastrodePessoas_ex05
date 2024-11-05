package controller;


import javax.swing.JOptionPane;

import br.edu.fateczl.Lista.Lista;
import model.Pessoa;

public class CadastroController implements ICadastroController {

	Lista[]tabela;
	
	public CadastroController(){
	tabela=new Lista[3];
	inicializa();
	}
	private void inicializa() {
		int tamanho=tabela.length;
		for(int i =0;i<tamanho;i++) {
			tabela[i]=new Lista();
		}
	}
	public void insere(Pessoa pessoa) throws Exception {
		
		int pos =pessoa.hashCode();
		tabela[pos].addFirst(pessoa);
		
	}

	public void exclui(Pessoa pessoa) throws Exception {
		int tamanho=tabela.length;
		for(int i=0;i<tamanho;i++) {
			int size=tabela[i].size();
			for(int j=0;j<size;j++) {
				Pessoa aux = new Pessoa();
				aux=(Pessoa) tabela[i].get(j);
				if(pessoa.getNome().equals(aux.getNome())) {
					JOptionPane.showMessageDialog(null, aux," Removido",JOptionPane.INFORMATION_MESSAGE);;
					tabela[i].remove(j);
				}else {
					if(i==tamanho&&j==size) {
						JOptionPane.showMessageDialog(null, " Pessoa não encontrada ","Busca pessoas",JOptionPane.INFORMATION_MESSAGE);
					}
			}
		}
		
	}
	}
	public void busca(Pessoa pessoa) throws Exception {
		
		int tamanho=tabela.length;
		for(int i=0;i<tamanho;i++) {
			int size=tabela[i].size();
			for(int j=0;j<size;j++) {
				Pessoa aux = new Pessoa();
				aux=(Pessoa) tabela[i].get(j);
				if(pessoa.getNome().equals(aux.getNome())){
					JOptionPane.showMessageDialog(null, aux +" Cadastrado ","Busca pessoas",JOptionPane.INFORMATION_MESSAGE);					
				}else {
					if(i==tamanho&&j==size) {
						JOptionPane.showMessageDialog(null, " Pessoa não encontrada ","Busca pessoas",JOptionPane.INFORMATION_MESSAGE);
					}
			}
		}		
	}
}
}

