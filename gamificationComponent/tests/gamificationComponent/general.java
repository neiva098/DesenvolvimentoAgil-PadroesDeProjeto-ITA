package gamificationComponent;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class general {

	@Test
	public void testGetNomeInanciasdeAchievement() {

		Achievement a = new Badge("primeiro chefe");
		Achievement b = new Points("headshot", 10);
		assertEquals(a.getNome(), "primeiro chefe");
		assertEquals(b.getNome(), "headshot");

	}

	@Test
	public void testGetPontosInstanciaPoints() {
		Achievement b = new Points("headshot", 10);
		assertEquals(10, ((Points) b).getValor());

	}

	@Test
	public void testPossuiEsseUser() {

		Usuario a = new Usuario("Alex");
		Usuario g = new Usuario("Genaro");
		Usuario d = new Usuario("Deuclécio");
		MemoryAchievementStorage memo = new MemoryAchievementStorage();

		memo.addUser(a);
		memo.addUser(g);
		memo.addUser(d);

		assertEquals(true, memo.possuiEsseUser("Alex"));
		assertEquals(true, memo.possuiEsseUser("Genaro"));
		assertEquals(true, memo.possuiEsseUser("Deuclécio"));
		assertEquals(false, memo.possuiEsseUser("Cleitinho"));

	}

	@Test
	public void testGetBadge() {

		MemoryAchievementStorage memo = new MemoryAchievementStorage();
		Achievement a = new Badge("primeiro chefe");
		Usuario alex = new Usuario("Alex");
		alex.addConquista(a);
		memo.addUser(alex);

		assertEquals(a, memo.getAchievement("Alex", "primeiro chefe"));

	}

	@Test
	public void getUser() {
		MemoryAchievementStorage memo = new MemoryAchievementStorage();

		Usuario alex = new Usuario("Alex");

		memo.addUser(alex);
		Usuario Elis = memo.getUser("Elis");

		assertEquals(alex, memo.getUser("Alex"));
		assertEquals(Elis, memo.getUser("Elis"));

	}

	@Test
	public void getConquistaUser() {

		Badge a = new Badge("primeiro chefe");
		Achievement b = new Badge("segundo chefe");
		Achievement c = new Points("terceiro chefe", 10);
		Points d = new Points("quarto chefe", 25);

		Usuario alex = new Usuario("Alex");
		alex.addConquista(a);
		alex.addConquista(b);
		alex.addConquista(c);
		alex.addConquista(d);

		assertEquals(a, alex.getConquista("primeiro chefe"));
		assertEquals(b, alex.getConquista("segundo chefe"));
		assertEquals(c, alex.getConquista("terceiro chefe"));
		assertEquals(d, alex.getConquista("quarto chefe"));

	}

	@Test
	public void testAdicionarPointsSomandoOsDeNomeIgual() {

		MemoryAchievementStorage memo = new MemoryAchievementStorage();

		Achievement a = new Points("mata muito", 100);
		Achievement b = new Points("mata muito", 200);
		Achievement c = new Points("rico de moedas", 80);

		memo.addAchievement("Alex", a);
		memo.addAchievement("Alex", b);
		memo.addAchievement("Alex", c);

		Achievement r = memo.getAchievement("Alex", "mata muito");
		int valorMataMuito = ((Points) r).getValor();
		Achievement s = memo.getAchievement("Alex", "rico de moedas");
		int valorRicoDeMoedas = ((Points) s).getValor();

		assertEquals(300, valorMataMuito);
		assertEquals(80, valorRicoDeMoedas);

	}


	@Test(expected = NullPointerException.class)
	public void mockLancarException() {
		AchievementStorage memo = AchievementStorageFactory.getAchievementStorage();
		ForumService fs = new Forum();
		fs.addComment("moises", "qualquer topico", "tirso");
		memo.getAchievement("tirso", "I CAN TALK");
	}

}
