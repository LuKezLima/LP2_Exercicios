package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Jogador
 *
 */
@Entity

public class Jogador implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int id;
	@Column
	private String nacionalidade;
	private String nome
	
	@ManyToOne
	@JoinColumn(name = "id_time")
	private Time time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
