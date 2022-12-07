package com.silicon.SiliconTracker.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Bus extends AbstractPersistable<Long> {
    private String busNumber;
    private int seatingCapacity;
    @OneToOne
    private Driver driver;
    @OneToOne
    private Location currentLocation;
}