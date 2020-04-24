package Operations;

import java.util.Scanner;

import Model.PrimerSer;

public class Helper {
	//Lucha
	public static void dispararArco(String tirador, String objetivo) {
		System.out.println(tirador + " dispara " + objetivo);
	}

	public static void encantar(String cosa, String objeto) {
		System.out.println(cosa + " encanta " + objeto);
	}

	public static void usarHacha(String guerrero, String objetivo) {
		System.out.println(guerrero + " pega con el hacha a " + objetivo);
	}

	public static void crearArmadura(String guerrero) {
		System.out.println(guerrero + " crea una armadura");
	}

	public static void usarEspadaCorta(String guerrero, String objetivo) {
		System.out.println(guerrero + " usa daga contra " + objetivo);
	}

	public static void usarEspada(String guerrero, String objetivo) {
		System.out.println(guerrero + " usa espada contra " + objetivo);
	}

	public static void envenenaFlecha(String mago) {
		System.out.println(mago + " envenena flecha");
	}

	//Acciones Vitales
	public static void fumar(String persona) {
		System.out.println(persona + " esta fumando");
	}

	public static void comer(String persona, String tipo) {
		System.out.println(persona + " esta comiendo " + tipo);
	}

	public static void morir(String guerrero) {
		System.out.println(guerrero + " ha muerto");
	}

	public static void hablar(String cosa, String texto) {
		System.out.println(cosa+" dice "+ texto);
	}

	public static void moverse(String guerrero, String posicion) {
		System.out.println(guerrero + " se mueve a " + posicion);
	}
}
