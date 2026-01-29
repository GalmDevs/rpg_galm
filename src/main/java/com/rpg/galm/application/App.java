package com.rpg.galm.application;

import com.rpg.galm.helpers.ClasseHelper;
import com.rpg.galm.models.Classe;
import com.rpg.galm.models.Player;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Application main!
 */
public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		out.print("Digite o nome do seu personagem: ");
		String nome = sc.nextLine();

		out.println("Escolha sua Classe:");
		out.println("1-Mago: usa magia e inteligenca");
		out.println("2-Guerreiro: Bate e e forte pra carai");
		out.println("3-Arquiro: visao apurada e agil");
		out.print("...sua Escolha de Classe: ");

		Player p1 = new Player(nome, getClasseSel());

		out.print("Seu " + p1.getClasse().getNomeClasse() + " se chama " + p1.getNome());

		sc.close();
	}

	public static Classe getClasseSel() {
		do {
			switch (sc.nextInt()) {
				case 1:
					return ClasseHelper.buildMago();
				case 2:
					return ClasseHelper.buildGuerreiro();
				case 3:
					return ClasseHelper.buildArqueiro();
				default:
					out.println("Escolha invalida");
			}
		} while (true);
	}
}
