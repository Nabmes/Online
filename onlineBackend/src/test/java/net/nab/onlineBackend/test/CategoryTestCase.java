package net.nab.onlineBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.nab.onlineBackend.dto.Category;
import net.nab.onlineBackend.dao.CategoryDAO;


public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.nab.onlineBackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
/*@Test
public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_105.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}*/
	/*@Test
public void testGetCategory() {
	
	category = categoryDAO.get(2);
	
	assertEquals("Successfully fetch a single category from the table!","Laptop",category.getName());

	
}}*/

	/*@Test
	public void testUpdateCategory() {
			
		category = categoryDAO.get(2);
			
			category.setName("Television");
			category.setDescription("This is some description for TV!");
			category.setImageURL("CAT_10.png");
			
			assertEquals("Successfully added a category inside the table!",true,categoryDAO.update(category));
			
			
		}*/
	/*@Test
	public void testDeleteteCategory() {
			
		category = categoryDAO.get(2);

			
			assertEquals("Successfully deleted a single category inside the table!",true,categoryDAO.delete(category));
			
			
		}*/
	/*Test
	public void testListCategory() {
			//We have to put the number of active categorie which is 1 from the DB and add the function size() to the list
		assertEquals("Successfully fetch a single category from the table!",1,categoryDAO.list().size());
			
			
		}*/
	
//write all the tests in a single test

@Test
public void testCRUDCategory() {
	//add operation
	category = new Category();
	
	category.setName("Mobile");
	category.setDescription("This is some description for Mobile!");
	category.setImageURL("CAT_105.png");
	
	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	
	category = new Category();
	
	category.setName("Laptop");
	category.setDescription("This is some description for Mob!");
	category.setImageURL("CAT_105.png");
	
	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	
	//fetching and updating the category
	category = categoryDAO.get(2);
	
	category.setName("Television");
	category.setDescription("This is some description for TV!");
	category.setImageURL("CAT_10.png");
	
	assertEquals("Successfully added a category inside the table!",true,categoryDAO.update(category));
	
	//delete category
	
	category = categoryDAO.get(2);

	
	assertEquals("Successfully deleted a single category inside the table!",true,categoryDAO.delete(category));
	
	assertEquals("Successfully fetch a single category from the table!",1,categoryDAO.list().size());
	
	
}
}