package com.pilaf.tgl.effect.builder.time.items;

import com.pilaf.tgl.api.effect.templates.TimeEffect;

public class Hit implements TimeEffect {

    private Hit() {

    }

    private Hit(HitBuilder hitBuilder) {
	// TODO Auto-generated constructor stub
    }

    public static class HitBuilder {

	public Hit build() {
	    return new Hit(this);
	}
    }

}
