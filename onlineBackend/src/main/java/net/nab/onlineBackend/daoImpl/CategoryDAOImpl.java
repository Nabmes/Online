package net.nab.onlineBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import net.nab.online.Backend.dto.Category;
import net.nab.onlineBackend.dao.CategoryDAO;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("Cat1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("Cat2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("Cat3.png");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories) {
			if(category.getId() ==id)
				return category;
		}
		return null;
	}

}
