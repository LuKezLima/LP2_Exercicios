package entidades;

import java.io.Serializable;
import javax.persistence.*;
/**
 * Entity implementation class for Entity: Time
 *
 */
@Entity
public class Time implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private int id;
	@Column
	String nome;
	String pais;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPaís(String pais) {
		this.pais = pais;
	}

}
