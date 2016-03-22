package com.pilaf.tgl.api.charakter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pilaf.tgl.api.equipment.Armor;
import com.pilaf.tgl.api.equipment.Equipment;
import com.pilaf.tgl.api.equipment.Fists;
import com.pilaf.tgl.api.equipment.Weapon;

public class CharakterEquipment implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Weapon mainWeapon1 = new Fists();
    private Weapon offHand1;
    private Armor armor;
    private List<Equipment> equipment = new ArrayList<>();

    public Weapon getMainWeapon1() {
	return mainWeapon1;
    }

    public void setMainWeapon1(Weapon mainWeapon1) {
	this.mainWeapon1 = mainWeapon1;
    }

    public Weapon getOffHand1() {
	return offHand1;
    }

    public void setOffHand1(Weapon offHand1) {
	this.offHand1 = offHand1;
    }

    public Armor getArmor() {
	return armor;
    }

    public void setArmor(Armor armor) {
	this.armor = armor;
    }

    public List<Equipment> getEquipment() {
	return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
	this.equipment = equipment;
    }

}
