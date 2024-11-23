package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	List<Event> findByTitre(String titre);

	List<Event> findByLieu(String lieu);
}
