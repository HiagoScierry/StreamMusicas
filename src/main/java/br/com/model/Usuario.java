package br.com.model;

import br.com.interfaces.model.IUsuario;

public class Usuario implements IUsuario {

	private final String nome;
	private String email;

	public Usuario( String nome, String email ) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setEmail( String email ) {
		this.email = email;
	}
}
