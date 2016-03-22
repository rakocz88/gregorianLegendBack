package com.pilaf.tgl.api.charakter.points;

import java.io.Serializable;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class CharakterPoints implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Health health = new Health();
    private ActionPoints actionPoints = new ActionPoints();
    private EnergyLevel energyLevel = new EnergyLevel();

    public Health getHealth() {
	return health;
    }

    public void setHealth(Health health) {
	this.health = health;
    }

    public ActionPoints getActionPoints() {
	return actionPoints;
    }

    public void setActionPoints(ActionPoints actionPoints) {
	this.actionPoints = actionPoints;
    }

    public EnergyLevel getEnergyLevel() {
	return energyLevel;
    }

    public void setEnergyLevel(EnergyLevel energyLevel) {
	this.energyLevel = energyLevel;
    }

    public void buildPoints(CharakterInCombatBase charakterInCombatBase) {
	getActionPoints().buildPoints(charakterInCombatBase);
	getHealth().buildPoints(charakterInCombatBase);
	getEnergyLevel().buildPoints(charakterInCombatBase);

    }

    public void initPoints(CharakterInCombatBase charakterInCombatBase) {
	getHealth().initPoints(charakterInCombatBase);
	getActionPoints().initPoints(charakterInCombatBase);
	getEnergyLevel().initPoints(charakterInCombatBase);

    }

}
