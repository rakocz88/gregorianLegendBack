package com.pilaf.tgl.api.charakter;

import java.io.Serializable;

public class CharakterDescriptions implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String name;

    private String charakterClass;

    private String race;

    private String gender;

    private int size;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getCharakterClass() {
	return charakterClass;
    }

    public void setCharakterClass(String charakterClass) {
	this.charakterClass = charakterClass;
    }

    public String getRace() {
	return race;
    }

    public void setRace(String race) {
	this.race = race;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

}
