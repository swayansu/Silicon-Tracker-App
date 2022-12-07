package com.silicon.SiliconTracker.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Address extends AbstractPersistable<Long> {
    private String street;
    private String city;
    private int pinCode;
}
