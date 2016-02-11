package com.pilaf.tgl.effect.builder.time.items;

import com.pilaf.tgl.effect.builder.templates.TimeEffect;

public class TimePeriod implements TimeEffect {

	private final int timeUnits;
	
	public TimePeriod(TimePeriodBuilder timePeriodBuilder) {
		this.timeUnits=timePeriodBuilder.timeUnits;
	}

	public int getTimeUnits() {
		return timeUnits;
	}


	public static class TimePeriodBuilder{
		int timeUnits;
		
		public TimePeriodBuilder timeUnits(int timeUnits){
			this.timeUnits=timeUnits;
			return this;
		}
		
		public TimePeriod build(){
			return new TimePeriod(this);
		}
	}

}
