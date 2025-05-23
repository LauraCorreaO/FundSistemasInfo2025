package com.udea.fsi.repository;

import com.udea.fsi.domain.Vuelo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Vuelo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {}
