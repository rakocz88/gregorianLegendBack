package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.effect.builder.enums.MagicalDmgType;
import com.pilaf.tgl.effect.builder.templates.Instant;

public class MagicalDmg implements Instant {

	private final MagicalDmgType magicalDmgType;

	private final int magicalDmgDice;

	private final int magicalDmgModyfier;

	private MagicalDmg(MagicalDmgType magicalDmgType, int magicalDmgDice, int magicalDmgModyfier) {
		super();
		this.magicalDmgType = magicalDmgType;
		this.magicalDmgDice = magicalDmgDice;
		this.magicalDmgModyfier = magicalDmgModyfier;
	}

	private MagicalDmg(MagicDmgBuilder builder) {
		this.magicalDmgType = builder.magicalDmgType;
		this.magicalDmgDice = builder.magicalDmgDice;
		this.magicalDmgModyfier = builder.magicalDmgModyfier;
	}

	public MagicalDmgType getMagicalDmgType() {
		return magicalDmgType;
	}

	public int getMagicalDmgDice() {
		return magicalDmgDice;
	}

	public int getMagicalDmgModyfier() {
		return magicalDmgModyfier;
	}

	public static class MagicDmgBuilder {
		MagicalDmgType magicalDmgType;
		int magicalDmgDice;
		int magicalDmgModyfier;

		public MagicDmgBuilder magicalDmgType(MagicalDmgType magicalDmgType) {
			this.magicalDmgType = magicalDmgType;
			return this;
		}

		public MagicDmgBuilder magicalDmgDice(int magicalDmgDice) {
			this.magicalDmgDice = magicalDmgDice;
			return this;
		}

		public MagicDmgBuilder magicalDmgModyfier(int magicalDmgModyfier) {
			this.magicalDmgModyfier = magicalDmgModyfier;
			return this;
		}

		public MagicalDmg build() {
			return new MagicalDmg(this);
		}

	}

}
