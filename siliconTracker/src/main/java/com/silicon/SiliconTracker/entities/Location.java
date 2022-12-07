package com.silicon.SiliconTracker.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Location extends AbstractPersistable<Long> {

    @OneToOne
    private Coordinate coordinate;
    @OneToOne
    private Address address;
    private LocalTime lastUpdatedTime;
}
