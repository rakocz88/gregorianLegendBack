package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.api.effect.templates.ActionEffect;

public class Kill implements ActionEffect {

	@Override
	public void takeAction(int paramValue) {
		System.out.println("Kill");

	}

	@Override
	public int returnValue(int paramValue) {
		return 0;
	}

}
