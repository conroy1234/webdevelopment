package com.domgon.product.text;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.domgen.dao.IProductDAO;
import com.domgen.dto.Product;
import com.domgen.service.ProductService;

import junit.framework.TestCase;

public class TestProductService extends TestCase {
	private ProductService productService;
@Test
public void testProductService(){
	givenThatProductServiceIsPopulated();
	whenFilterWithRed();
	thenVerifyTwoResults();
}

private void thenVerifyTwoResults() {
	// TODO Auto-generated method stub
	
}

private void whenFilterWithRed() {
	// TODO Auto-generated method stub
	
}


private void givenThatProductServiceIsPopulated() {
	productService = new ProductService();
	List<Product>prod=produceList();
	IProductDAO productDAO = mock(IProductDAO.class);
	//when(productDAO.fetchProduct()).then(prod);
}
public List<Product>produceList(){
	List<Product> prod= new ArrayList<Product>();
	Product name=new Product();
	name.setName("plum");
	name.setDiscription("ripe");
	name.setPrice("20");
	prod.add(name);
	return prod;
}
}
