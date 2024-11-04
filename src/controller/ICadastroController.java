package controller;

import model.Pessoa;

public interface ICadastroController {
	public void insere(Pessoa pessoa)throws Exception;
	public void exclui(Pessoa pessoa)throws Exception;
	public void busca(Pessoa pessoa)throws Exception;
}
