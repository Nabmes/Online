package net.nab.onlineBackend.dao;

import java.util.List;

import net.nab.online.Backend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	
}
