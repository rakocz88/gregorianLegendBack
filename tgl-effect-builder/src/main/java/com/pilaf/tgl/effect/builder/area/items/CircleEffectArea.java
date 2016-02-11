package com.pilaf.tgl.effect.builder.area.items;

import com.pilaf.tgl.effect.builder.enums.TargetType;

public class CircleEffectArea implements ArreaNoTarget{
	
	private final TargetType target;
	private final int areaOfEffect;
	
	private CircleEffectArea(CircleEffectBuilder builder) {
		super();
		this.target = builder.target;
		this.areaOfEffect = builder.areaOfEffect;
	}

	public TargetType getTarget() {
		return target;
	}

	public int getAreaOfEffect() {
		return areaOfEffect;
	}

	public static class CircleEffectBuilder {
		TargetType target;
		int areaOfEffect;
		 
		 public CircleEffectBuilder target(TargetType target){
			 this.target = target;
			 return this;
		 }
		 
		 public CircleEffectBuilder areaOfEffect(int areaOfEffect){
			 this.areaOfEffect = areaOfEffect;
			 return this;
		 }
		 
		 public CircleEffectArea build(){
			 return new CircleEffectArea(this);
		 }
		
	}

}
