package com.zohocrmpractice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrmpractice.entities.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
