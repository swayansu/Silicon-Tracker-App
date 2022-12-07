package com.silicon.SiliconTracker.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Driver extends AbstractPersistable<Long> {
    private String driverName;
    private int age;
    private String licenseId;
}
