package com.infosys.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.demo.model.Hooper;

public interface HooperDAO extends JpaRepository<Hooper, Integer> {

}
