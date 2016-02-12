package com.pilaf.tgl.effect.builder.condition.items;

import com.pilaf.tgl.api.effect.enums.DefenceThrowType;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;

public class DefenceThrow implements ConditionEffect{
	
	private final DefenceThrowType defenceThrowType;
	private final int defenceThrowValue;

	private DefenceThrow(DefenceThrowBuilder defenceThrowBuilder) {
		this.defenceThrowType = defenceThrowBuilder.defenceThrowType;
		this.defenceThrowValue = defenceThrowBuilder.defenceThrowValue;
	}

	public DefenceThrowType getDefenceThrowType() {
		return defenceThrowType;
	}

	public int getDefenceThrowValue() {
		return defenceThrowValue;
	}

	public static class DefenceThrowBuilder{
		 DefenceThrowType defenceThrowType;
		 int defenceThrowValue;
		 
		 public DefenceThrowBuilder defenceThrowType(DefenceThrowType defenceThrowType){
			 this.defenceThrowType = defenceThrowType;
			 return this;
		 }
		 
		 public DefenceThrowBuilder defenceThrowValue(int defenceThrowValue){
			 this.defenceThrowValue = defenceThrowValue;
			 return this;
		 }
		 
		 public DefenceThrow build(){
			 return new DefenceThrow(this);
		 }
		
	}

}
