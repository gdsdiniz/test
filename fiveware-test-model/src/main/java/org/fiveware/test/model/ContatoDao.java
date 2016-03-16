package org.fiveware.test.model;
      
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Contato")
public class ContatoDao {
 	
	@Id @GeneratedValue
	private int id;
	private String nome;
	private boolean favorito;
	private String tipo;
	private char sexo;

	
	public ContatoDao(){
	}
	
	public ContatoDao(String nome, boolean favorito, String tipo, char sexo) {
		this.nome = nome;
		this.favorito = favorito;
		this.tipo = tipo;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}


	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
