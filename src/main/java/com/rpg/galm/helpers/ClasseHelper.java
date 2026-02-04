package com.rpg.galm.helpers;

import com.rpg.galm.models.Classe;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Classe para auxiliar na operação de {@link com.rpg.galm.models.Classe}
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ClasseHelper {

	public static Classe buildMago() {
		return new Classe("Mago", 20, 35, 10, 20, 40);
	}

	public static Classe buildGuerreiro() {
		return new Classe("Guerreiro", 40, 15, 45, 30, 10);
	}

	public static Classe buildArqueiro() {
		return new Classe("Arqueiro", 30, 25, 20, 30, 25);
	}

}