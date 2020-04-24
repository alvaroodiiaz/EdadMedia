package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Humano;
import Model.Orco;
import Operations.BattleHelper;

class BattleHelperTest {
	Humano h1 = new Humano("Alvaro", "Diaz", "Portador de Matadora", 100);
	Orco o1 = new Orco("Grommash", "Hellscream", "Jefe del Clan Warsong", 100);
	@Test
	void testDisminuirSaludH() {
		BattleHelper.disminuirSaludH(h1, 20);
		int esperado=80;
		assertEquals(h1.getSalud(), esperado);
	}

	@Test
	void testAumentarSaludH() {
		h1.setSalud(100);
		BattleHelper.aumentarSaludH(h1, 20);
		int esperado=120;
		assertEquals(h1.getSalud(), esperado);
	}

	@Test
	void testDisminuirSaludO() {
		BattleHelper.disminuirSaludO(o1, 20);
		int esperado=80;
		assertEquals(o1.getSalud(), esperado);
	}

	@Test
	void testAumentarSaludO() {
		o1.setSalud(100);
		BattleHelper.aumentarSaludO(o1, 20);
		int esperado=120;
		assertEquals(o1.getSalud(), esperado);
	}

}
