package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.DeliveryType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryTypeRepo extends JpaRepository<DeliveryType, Long> {
}
