package manager;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entity.Filme;
import persistence.FilmeDao;

@ManagedBean(name="mb")
@RequestScoped
public class ManagerBean {
	
	private Filme filme;
	private List<Filme> filmes;

	public ManagerBean() {
		filme = new Filme();
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public List<Filme> getFilmes() {
		try {
			filmes = new FilmeDao().findAll();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public void gravar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			new FilmeDao().create(filme);
			filme = new Filme();
			fc.addMessage(null, new FacesMessage("Filme Gravado com Sucesso!"));
		}catch (Exception ex) {
			fc.addMessage(null, new FacesMessage("Error : " + ex.getMessage()));
			ex.printStackTrace();
		}
	}
	
	public void excluir() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			new FilmeDao().delete(filme);
			fc.addMessage(null, new FacesMessage("Filme Excluído com sucesso"));
		}catch (Exception ex) {
			fc.addMessage(null, new FacesMessage("Error : " + ex.getMessage()));
			ex.printStackTrace();
		}
	}

	
	
	

}
