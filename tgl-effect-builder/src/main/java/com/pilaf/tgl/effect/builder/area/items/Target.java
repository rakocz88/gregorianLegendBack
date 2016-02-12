package com.pilaf.tgl.effect.builder.area.items;

import com.pilaf.tgl.api.effect.enums.TargetType;
import com.pilaf.tgl.api.effect.templates.AreaEffect;

public class Target implements AreaEffect {
	
	private final TargetType targetType;
	
	private Target(TargetBuilder builder) {
		this.targetType = builder.targetType;
	}

	public TargetType getTargetType() {
		return targetType;
	}



	public static class TargetBuilder{
		TargetType targetType;
		
		public TargetBuilder target(TargetType targetType){
			this.targetType= targetType;
			return this;
		}
		
		public Target build(){
			return new Target(this);
		}
	}

}
