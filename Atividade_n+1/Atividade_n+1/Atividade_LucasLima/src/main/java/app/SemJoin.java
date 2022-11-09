package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Jogador;

public class SemJoin {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Atividade_LucasLima");
		EntityManager entidade = fabrica.createEntityManager();
		List<Jogador> jogadores = entidade.createQuery("FROM Jogador", Jogador.class).getResultList();
		System.out.println(jogadores);
	}

}
