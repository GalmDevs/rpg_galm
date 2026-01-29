package com.rpg.galm.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Historia {

	private String texto;

	private String[] ops;

	public Historia(String texto, String... ops) {
		this.texto = texto;
		this.ops = ops;
	}

}