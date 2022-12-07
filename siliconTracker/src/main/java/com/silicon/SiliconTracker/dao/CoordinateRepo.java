package com.silicon.SiliconTracker.dao;

import com.silicon.SiliconTracker.entities.Coordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateRepo extends JpaRepository<Coordinate, Long> {
}
