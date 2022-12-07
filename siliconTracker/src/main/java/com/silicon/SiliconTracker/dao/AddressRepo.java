package com.silicon.SiliconTracker.dao;

import com.silicon.SiliconTracker.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
