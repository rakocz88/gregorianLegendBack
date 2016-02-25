package com.pilaf.tgl.effect.builder.area.items;

import com.pilaf.tgl.api.enums.TargetType;

public class CircleEffectAreaTarget implements AreaTarget {
	
	private final TargetType target;
	private final int areaOfEffect;
	
	private CircleEffectAreaTarget(CircleEffectAreaTargetBuilder builder) {
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

	public static class CircleEffectAreaTargetBuilder{
		 TargetType target;
		 int areaOfEffect;
		 
		 public CircleEffectAreaTargetBuilder target(TargetType target){
			 this.target = target;
			 return this;
		 }
		 
		 public CircleEffectAreaTargetBuilder areaOfEffect(int areaOfEffect){
			 this.areaOfEffect = areaOfEffect;
			 return this;
		 }
		 
		 public CircleEffectAreaTarget build(){
			 return new CircleEffectAreaTarget(this);
		 }
	}
}
