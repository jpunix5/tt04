package com.test13.service;

import java.util.List;

import com.test13.entities.TableColumnEntity;

public interface TableColumnService {
	List<TableColumnEntity> findByTable(String table);
}
