package model;

import java.util.Objects;

public class Pessoa {
 
	private String nome;
	private int idade;
	
	public Pessoa() {
		super();
	}

	@Override
	public int hashCode() {
		if(idade>44) {
			return 2;
		}
		if(idade<45&&idade>18) {
			return 1;
		}
			return 0;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return idade == other.idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return  nome  +"\t"+ idade +" Anos" ;
	}
	
	
	
	
}
