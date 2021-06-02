package entity;

import java.io.Serializable;

public class Filme implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer idFilme;
	private String nome;
	private String genero;
	private String descricao;
	private String trailer;
	
	public Filme() {
	
	}

	public Filme(Integer idFilme, String nome, String genero, String descricao, String trailer) {
		super();
		this.idFilme = idFilme;
		this.nome = nome;
		this.genero = genero;
		this.descricao = descricao;
		this.trailer = trailer;
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	@Override
	public String toString() {
		return "Filme : idFilme=" + idFilme + ", nome=" + nome + ", genero=" + genero + ", descricao=" + descricao
				+ ", trailer=" + trailer + "\n";
	}
	
	
	

}
