package net.nab.onlineBackend.dao;

import java.util.List;

import net.nab.onlineBackend.dto.Product;


public interface ProductDAO {
	List<Product> list();
	Product get(int id);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//business methodes
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> listLatestActiveProducts(int count);
	
}
