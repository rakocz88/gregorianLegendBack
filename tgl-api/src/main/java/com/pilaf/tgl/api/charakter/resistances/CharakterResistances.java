package com.pilaf.tgl.api.charakter.resistances;

import java.io.Serializable;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class CharakterResistances implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private ElementalsResistance elementalsResistance = new ElementalsResistance();
    private WeaponResistance weaponResistance = new WeaponResistance();
    private EnergyResistance energyResistance = new EnergyResistance();

    public ElementalsResistance getElementalsResistance() {
	return elementalsResistance;
    }

    public void setElementalsResistance(ElementalsResistance elementalsResistance) {
	this.elementalsResistance = elementalsResistance;
    }

    public WeaponResistance getWeaponResistance() {
	return weaponResistance;
    }

    public void setWeaponResistance(WeaponResistance weaponResistance) {
	this.weaponResistance = weaponResistance;
    }

    public EnergyResistance getEnergyResistance() {
	return energyResistance;
    }

    public void setEnergyResistance(EnergyResistance energyResistance) {
	this.energyResistance = energyResistance;
    }

    public void initResistances(CharakterInCombatBase charakter) {
	this.energyResistance.buildValues(charakter, this.energyResistance.getAttributeModyfier());
	this.elementalsResistance.buildValues(charakter, this.elementalsResistance.getAttributeModyfier());
	this.weaponResistance.buildValues(charakter, this.weaponResistance.getAttributeModyfier());
    }

    public void buildResistances(CharakterInCombatBase charakter) {
	this.energyResistance.buildValues(charakter, this.energyResistance.getAttributeModyfier());
	this.elementalsResistance.buildValues(charakter, this.elementalsResistance.getAttributeModyfier());
	this.weaponResistance.buildValues(charakter, this.weaponResistance.getAttributeModyfier());
    }

}
