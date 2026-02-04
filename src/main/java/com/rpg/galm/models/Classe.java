package com.rpg.galm.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Classe {

	private String nomeClasse;
	private int hp;
	private int mp;
	private int str;
	private int def;
	private int inte;

}
