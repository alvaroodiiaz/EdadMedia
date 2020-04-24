package Controller;

import Model.Elfo;
import Model.Enano;
import Model.Hobbit;
import Model.Humano;
import Model.Orco;
import Model.PrimerSer;
import Operations.BattleHelper;
import Operations.Helper;

public class main {

	public static void main(String[] args) {
		PrimerSer PrimerSer = new PrimerSer("Rey de la Noche", "Otros", "Caminantes Blancos", 100);
		Elfo Elfo1 = new Elfo("Aragorn", "II", "Thorongil", 100);
		Elfo Elfo2 = new Elfo("Eddard", "Stark", "Rey en el Norte", 100);
        Humano Humano1 = new Humano("Alvaro", "Diaz", "Portador de Matadora", 100);
        Hobbit Hobbit1 = new Hobbit("Frodo", "Bolson", "Portador del anillo", 100);
        Enano Enano1 = new Enano("Tyrion", "Lannister", "El Gigante de Lannister", 100);
        Orco Orco1 = new Orco("Grommash", "Hellscream", "Jefe del Clan Warsong", 100);
        System.out.println(PrimerSer);
        System.out.println("------------------------------------------------------");
        System.out.println(Elfo1);
        System.out.println("------------------------------------------------------");
        System.out.println(Humano1);
        System.out.println("------------------------------------------------------");
        System.out.println(Hobbit1);
        System.out.println("------------------------------------------------------");
        System.out.println(Enano1);
        System.out.println("------------------------------------------------------");
        System.out.println(Orco1);
        System.out.println("------------------------------------------------------");
        System.out.println(Elfo1.equals(Elfo2));
        System.out.println("------------------------------------------------------");
        Helper.dispararArco("Alvaro", "Orco");
        System.out.println("------------------------------------------------------");
        Helper.encantar("Alvaro", "Garra");
        System.out.println("------------------------------------------------------");
        Helper.usarHacha("Alvaro", "Elfo");
        System.out.println("------------------------------------------------------");
        Helper.crearArmadura("Alvaro");
        System.out.println("------------------------------------------------------");
        Helper.usarEspada("Alvaro", "Hobbit");
        System.out.println("------------------------------------------------------");
        Helper.usarEspadaCorta("Alvaro", "Enano");
        System.out.println("------------------------------------------------------");
        Helper.envenenaFlecha("Mago");
        System.out.println("------------------------------------------------------");
        Helper.fumar("Primer Ser");
        System.out.println("------------------------------------------------------");
        Helper.comer("Alvaro", "manzana");
        System.out.println("------------------------SPOILER-----------------------");
        Helper.morir("Eddard Stark");
        System.out.println("------------------------------------------------------");
        Helper.hablar("Tyrion", "'Solo quiero estar en lo alto del muro y mearme en el borde del mundo'");
        System.out.println("------------------------------------------------------");
        Helper.moverse("Troll", "baños de Hogwarts");
        System.out.println("------------------------------------------------------");
        BattleHelper.timeToBattle(Humano1, Orco1, "Skiller", "DragonHunter");

	}

}
