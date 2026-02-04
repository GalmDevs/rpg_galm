package com.rpg.galm.application;

import com.rpg.galm.helpers.ClasseHelper;
import com.rpg.galm.models.Classe;
import com.rpg.galm.models.Player;
import com.rpg.galm.service.TimelineService;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Application main!
 */
public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Digite o nome do seu personagem: ");
		String nome = sc.nextLine();

		Player p1 = new Player(nome,getClasseSel());

		System.out.println("Seu "+p1.getClasse().getNomeClasse()+" se chama "+p1.getNome());
		System.out.println("Boa Sorte !!!");

		TimelineService tlService= new TimelineService();
		tlService.buildTimeline();

		sc.close();
	}

	public static Classe getClasseSel(){
		do{
			System.out.println("Escolha sua Classe:\n");
			System.out.println("1-Mago: usa magia e inteligenca\n");
			System.out.println("2-Guerreiro: Bate e e forte pra carai\n");
			System.out.println("3-Arquiro: visao apurada e agil\n");
			System.out.print("...sua Escolha de Classe: ");

			switch (sc.nextInt()) {
				case 1:
					return ClasseHelper.buildMago();
				case 2:
					return ClasseHelper.buildGuerreiro();
				case 3:
					return ClasseHelper.buildArqueiro();
				default:
					System.out.println("Escolha invalida!!! \n\n\n\n\n");
			}
		}while(true);
	}
}
