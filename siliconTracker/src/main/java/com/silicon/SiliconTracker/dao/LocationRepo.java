package com.silicon.SiliconTracker.dao;

import com.silicon.SiliconTracker.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location, Long> {
    public Location findOneById(Long id);
}
