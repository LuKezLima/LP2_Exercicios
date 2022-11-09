package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Filme;

public class ComJoin {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Atividade_LucasLima");
		EntityManager entidade = fabrica.createEntityManager();
		List<Jogador> jogadores = entidade.createQuery("FROM JOGADOR f join fetch f.time", Jogador.class).getResultList();
		System.out.println(jogadores);
	}

}
