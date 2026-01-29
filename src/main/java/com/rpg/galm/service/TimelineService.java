package com.rpg.galm.service;

import com.rpg.galm.models.Historia;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class TimelineService {

	private List<Historia> acontecimentos;

	public List<Historia> getAcontecimentos() {
		return acontecimentos == null ? new ArrayList<>() : acontecimentos;
	}

	public void buildTimeline() {
		if (getAcontecimentos() == null || getAcontecimentos().isEmpty()) {
			inicializarHistoria();
		}
	}

	public void inicializarHistoria() {
		getAcontecimentos().add(new Historia("INICIO", "OP1", "OP2", "OP3"));
	}

}
