package com.pilaf.tgl.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonEntity {
    
    @Id
    @GeneratedValue long id;
    
    String name;

}
