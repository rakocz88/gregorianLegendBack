package com.pilaf.tgl.api.charakter.speed;

public class SpeedLimits {
    int strollLimit;
    int walkLimit;
    int runLimit;
    int springLimit;
    int maxSpeed;

    public SpeedLimits(int strollLimit, int walkLimit, int runLimit, int springLimit, int maxSpeed) {
	super();
	this.strollLimit = strollLimit;
	this.walkLimit = walkLimit;
	this.runLimit = runLimit;
	this.springLimit = springLimit;
	this.maxSpeed = maxSpeed;
    }

    public int getStrollLimit() {
	return strollLimit;
    }

    public void setStrollLimit(int strollLimit) {
	this.strollLimit = strollLimit;
    }

    public int getWalkLimit() {
	return walkLimit;
    }

    public void setWalkLimit(int walkLimit) {
	this.walkLimit = walkLimit;
    }

    public int getRunLimit() {
	return runLimit;
    }

    public void setRunLimit(int runLimit) {
	this.runLimit = runLimit;
    }

    public int getSpringLimit() {
	return springLimit;
    }

    public void setSpringLimit(int springLimit) {
	this.springLimit = springLimit;
    }

    public int getMaxSpeed() {
	return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
    }

}
