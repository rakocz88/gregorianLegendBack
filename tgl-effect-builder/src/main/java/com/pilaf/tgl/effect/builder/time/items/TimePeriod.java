package com.pilaf.tgl.effect.builder.time.items;

import com.pilaf.tgl.api.effect.templates.TimeEffect;

public class TimePeriod implements TimeEffect {

	private final int timeUnits;
	private final int timeStamp;
	private final boolean effectIfEnter;
	private final boolean effectStacks;
	private final int firstCallDelay;
	private final boolean constant;
	private final boolean permanently;

	private TimePeriod(TimePeriodBuilder timePeriodBuilder) {
		this.timeUnits = timePeriodBuilder.timeUnits;
		this.timeStamp = timePeriodBuilder.timeStamp;
		this.effectIfEnter = timePeriodBuilder.effectIfEnter;
		this.effectStacks = timePeriodBuilder.effectStacks;
		this.firstCallDelay = timePeriodBuilder.firstCallDelay;
		this.constant = timePeriodBuilder.constant;
		this.permanently = timePeriodBuilder.permanently;
	}

	public int getTimeUnits() {
		return timeUnits;
	}

	public int getTimeStamp() {
		return timeStamp;
	}

	public boolean isEffectIfEnter() {
		return effectIfEnter;
	}

	public boolean isEffectStacks() {
		return effectStacks;
	}

	public int getFirstCallDelay() {
		return firstCallDelay;
	}

	public boolean isConstant() {
		return constant;
	}

	public boolean isPermanently() {
		return permanently;
	}

	public static class TimePeriodBuilder {
		int timeUnits;
		int timeStamp;
		boolean effectIfEnter;
		boolean effectStacks;
		int firstCallDelay;
		boolean constant;
		boolean permanently;

		public TimePeriodBuilder timeUnits(int timeUnits) {
			this.timeUnits = timeUnits;
			return this;
		}

		public TimePeriodBuilder timeStamp(int timeStamp) {
			this.timeStamp = timeStamp;
			return this;
		}

		public TimePeriodBuilder permanently(boolean permanently) {
			this.permanently = permanently;
			return this;
		}

		public TimePeriodBuilder effectIfEnter(boolean effectIfEnter) {
			this.effectIfEnter = effectIfEnter;
			return this;
		}

		public TimePeriodBuilder effectStacks(boolean effectStacks) {
			this.effectStacks = effectStacks;
			return this;
		}

		public TimePeriodBuilder firstCallDelay(int firstCallDelay) {
			this.firstCallDelay = firstCallDelay;
			return this;
		}

		public TimePeriodBuilder constant(boolean constant) {
			this.constant = constant;
			return this;
		}

		public TimePeriod build() {
			return new TimePeriod(this);
		}
	}

}
