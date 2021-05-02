package com.test13.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test13.entities.TableColumnEntity;

public interface TableColumnRepository extends JpaRepository<TableColumnEntity, Integer>{
	List<TableColumnEntity> findByTablename(String table);
}
