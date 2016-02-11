package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.effect.builder.enums.PhysicalDmgType;
import com.pilaf.tgl.effect.builder.templates.Instant;

public class PhysicalDmg implements Instant{
	
	private final PhysicalDmgType physicalDmgType;
	
	private final int physicalDmgDice;
	
	private final int physicalDmgModifier;
	
	private PhysicalDmg(PhysicalDmgType physicalDmgType, int physicalDmgDice, int physicalDmgModifier) {
		super();
		this.physicalDmgType = physicalDmgType;
		this.physicalDmgDice = physicalDmgDice;
		this.physicalDmgModifier = physicalDmgModifier;
	}


	private PhysicalDmg(PhysicalDmgBuilder builder) {
		super();
		this.physicalDmgType = builder.physicalDmgType;
		this.physicalDmgDice = builder.physicalDmgDice;
		this.physicalDmgModifier = builder.physicalDmgModifier;
	}

	public PhysicalDmgType getPhysicalDmgType() {
		return physicalDmgType;
	}

	public int getPhysicalDmgDice() {
		return physicalDmgDice;
	}

	public int getPhysicalDmgModifier() {
		return physicalDmgModifier;
	}

	public static class PhysicalDmgBuilder{
		 PhysicalDmgType physicalDmgType;
		 int physicalDmgDice;
		 int physicalDmgModifier;
		
		public PhysicalDmgBuilder physicalDmgType(PhysicalDmgType physicalDmgType){
			this.physicalDmgType= physicalDmgType;
			return this;
		}
		
		public PhysicalDmgBuilder physicalDmgDice(int physicalDmgDice){
			this.physicalDmgDice= physicalDmgDice;
			return this;
		}
		
		public PhysicalDmgBuilder physicalDmgModifier(int physicalDmgModifier){
			this.physicalDmgModifier= physicalDmgModifier;
			return this;
		}
		
		public PhysicalDmg build(){
			return new PhysicalDmg(this);
		}
		
	}

}
