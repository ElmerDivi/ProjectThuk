package com.gamesOfEarth.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamesOfEarth.backend.entitybeans.Sport;
@Repository
public interface SportRepository extends JpaRepository<Sport, Integer> {

}
