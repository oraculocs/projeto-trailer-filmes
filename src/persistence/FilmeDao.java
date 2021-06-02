package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Filme;

public class FilmeDao extends Dao{
	
	//Método Gravar
	public void create(Filme f)throws Exception{
		open();
		stmt = con.prepareStatement("insert into filme values(null, ?,?,?,?)");
		stmt.setString(1, f.getNome());
		stmt.setString(2, f.getGenero());
		stmt.setString(3, f.getDescricao());
		stmt.setString(4, f.getTrailer());
		stmt.execute();
		close();
	}
	
	//Método para Listar
	public List<Filme> findAll()throws Exception{
		open();
		stmt = con.prepareStatement("select * from filme");	
		List<Filme> lista = new ArrayList<Filme>();
		rs = stmt.executeQuery();
		while(rs.next()) {
			Filme f = new Filme(rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5));
			lista.add(f);
			
		}
		close();
		return lista;
	}
	
	//Método para deletar
	public void delete(Filme f)throws Exception{
		open();
		stmt = con.prepareStatement("delete from filme where idFilme=?");
		stmt.setInt(1, f.getIdFilme());
		stmt.execute();
		close();
	}
	
	public static void main(String[] args) {
		
		try {
			Filme f = new Filme(5, "Os Vingadores (Guerra Infinita)", "Super Herói", "Avengers x Thanos em um poderoso combate", "https://www.youtube.com/v/4jGRyEa2jhE");
			FilmeDao dao = new FilmeDao();
			//dao.create(f);
			//System.out.println(f);
			//System.out.println("Dados Gravados com sucesso");
			//System.out.println(new FilmeDao().findAll());
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
