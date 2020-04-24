package Operations;

import java.util.Scanner;

import Model.Humano;
import Model.Orco;

public class BattleHelper {
	// Lucha
	public static void dispararArcoHO(Humano h1, Orco o1) {
		System.out.println(h1.getNombre() + " dispara " + o1.getNombre());
	}

	public static void dispararArcoOH(Orco o1, Humano h1) {
		System.out.println(h1.getNombre() + " dispara " + o1.getNombre());
	}

	public static void encantarH(Humano h1, String objeto) {
		System.out.println(h1.getNombre() + " encanta " + objeto);
	}

	public static void encantarO(Orco o1, String objeto) {
		System.out.println(o1.getNombre() + " encanta " + objeto);
	}

	public static void usarHachaOH(Orco o1, Humano h1) {
		System.out.println(o1.getNombre() + " pega con el hacha a " + h1.getNombre());
	}

	public static void usarHachaHO(Humano h1, Orco o1) {
		System.out.println(h1.getNombre() + " pega con el hacha a " + o1.getNombre());
	}

	public static void crearArmaduraO(Orco o1) {
		System.out.println(o1.getNombre() + " crea una armadura");
	}

	public static void crearArmaduraH(Humano h1) {
		System.out.println(h1.getNombre() + " crea una armadura");
	}

	public static void usarEspadaCortaOH(Orco o1, Humano h1) {
		System.out.println(o1.getNombre() + " usa daga contra " + h1.getNombre());
	}

	public static void usarEspadaCortaHO(Humano h1, Orco o1) {
		System.out.println(h1.getNombre() + " usa daga contra " + o1.getNombre());
	}

	public static void usarEspadaHO(Humano h1, Orco o1) {
		System.out.println(h1.getNombre() + " usa espada contra " + o1.getNombre());
	}

	public static void usarEspadaOH(Orco o1, Humano h1) {
		System.out.println(o1.getNombre() + " usa espada contra " + h1.getNombre());
	}

	public static void envenenaFlechaH(Humano h1) {
		System.out.println(h1.getNombre() + " envenena flecha");
	}

	public static void envenenaFlechaO(Orco o1) {
		System.out.println(o1.getNombre() + " envenena flecha");
	}
	// Acciones vitales

	public static void disminuirSaludH(Humano h1, int salud) {
		h1.setSalud(h1.getSalud() - salud);
		System.out.println(h1.getNombre() + " ha perdido " + salud + " puntos de salud");
	}

	public static void aumentarSaludH(Humano h1, int salud) {
		h1.setSalud(h1.getSalud() + salud);
		System.out.println(h1.getNombre() + " ha sumado " + salud + " puntos de salud");
	}

	public static void disminuirSaludO(Orco o1, int salud) {
		o1.setSalud(o1.getSalud() - salud);
		System.out.println(o1.getNombre() + " ha perdido " + salud + " puntos de salud");
	}

	public static void aumentarSaludO(Orco o1, int salud) {
		o1.setSalud(o1.getSalud() + salud);
		System.out.println(o1.getNombre() + " ha sumado " + salud + " puntos de salud");
	}

	public static void morirH(Humano h1) {
		System.out.println(h1.getNombre() + " ha muerto");
	}

	public static void morirO(Orco o1) {
		System.out.println(o1.getNombre() + " ha muerto");
	}

	// Battle
	public static void timeToBattle(Humano h1, Orco o1, String arma1, String arma2) {
		Scanner battle = new Scanner(System.in);

		System.out.println("Se acabaron los juegos. Es hora de la Batalla");
		batalla: while (h1.getSalud() > 0 && o1.getSalud() > 0) {
			System.out.println("Es tu turno. Escoga una letra desde 'a' hasta 'c'");
			char accion = battle.next().charAt(0);
			switch (accion) {
			case 'a':
				dispararArcoHO(h1, o1);
				disminuirSaludO(o1, 10);
				break;
			case 'b':
				encantarH(h1, arma1);
				break;
			case 'c':
				usarEspadaHO(h1, o1);
				disminuirSaludO(o1, 20);
				break;
			}

			if (h1.getSalud() < 0) {
				break batalla;
			} else if (o1.getSalud() < 0) {
				break batalla;
			}

			System.out.println("Es turno del orco. Escoga una letra desde 'a' hasta 'c'");
			accion = battle.next().charAt(0);
			switch (accion) {
			case 'a':
				usarEspadaCortaOH(o1, h1);
				disminuirSaludO(o1, 30);
				break;
			case 'b':
				crearArmaduraO(o1);
				aumentarSaludO(o1, 30);
				break;
			case 'c':
				usarEspadaOH(o1, h1);
				disminuirSaludO(o1, 50);
				break;
			}

			if (h1.getSalud() < 0) {
				break batalla;
			} else if (o1.getSalud() < 0) {
				break batalla;
			}

			System.out.println("Es tu turno. Escoga una letra desde 'a' hasta 'c'");
			accion = battle.next().charAt(0);
			switch (accion) {
			case 'a':
				usarEspadaCortaOH(o1, h1);
				disminuirSaludH(h1, 100);
				break;
			case 'b':
				crearArmaduraH(h1);
				aumentarSaludH(h1, 30);
				break;
			case 'c':
				usarHachaHO(h1, o1);
				disminuirSaludO(o1, 50);
				break;
			}

			if (h1.getSalud() < 0) {
				break batalla;
			} else if (o1.getSalud() < 0) {
				break batalla;
			}

			System.out.println("Es turno del orco. Escoga una letra desde 'a' hasta 'c'");
			accion = battle.next().charAt(0);
			switch (accion) {
			case 'a':
				dispararArcoOH(o1, h1);
				disminuirSaludH(h1, 20);
				break;
			case 'b':
				System.out.println("Orco encontro curacion");
				aumentarSaludH(h1, 10);
				break;
			case 'c':
				usarEspadaOH(o1, h1);
				disminuirSaludH(h1, 100);
				break;
			}

			if (h1.getSalud() < 0) {
				break batalla;
			} else if (o1.getSalud() < 0) {
				break batalla;
			}
		}
		if (h1.getSalud() != o1.getSalud()) {
			if (h1.getSalud() < 0) {
				morirH(h1);
				System.out.println("ORCO WINS");
			} else if (o1.getSalud() < 0) {
				morirO(o1);
				System.out.println("HUMANO WINS");
			}
		} else {
			System.out.println("EMPATE");
		}
	}
}
