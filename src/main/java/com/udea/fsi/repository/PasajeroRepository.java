package com.udea.fsi.repository;

import com.udea.fsi.domain.Pasajero;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Pasajero entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {}
