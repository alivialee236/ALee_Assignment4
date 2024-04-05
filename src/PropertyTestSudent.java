/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Description: This class represents GFA test cases for a Property object.
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alivia Lee
*/

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class PropertyTestSudent {

	@Test
	public void testNoArgProperty() {
		
		Property property = new Property();
		assertEquals ("", property.getPropertyName());
		assertEquals ("", property.getCity());
		assertEquals ("", property.getOwner());
		assertEquals (0.0, property.getRentAmount());
		assertEquals (0, property.getPlot().getX());
		assertEquals (0, property.getPlot().getY());
		assertEquals (1, property.getPlot().getWidth());
		assertEquals (1, property.getPlot().getDepth());
			
	}
	
	@Test
	public void testGivenPropertyVal() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me");
		assertEquals ("Property Name", property.getPropertyName());
		assertEquals ("City Name", property.getCity());
		assertEquals ("Me", property.getOwner());
		assertEquals (100.00, property.getRentAmount());
		assertEquals (0, property.getPlot().getX());
		assertEquals (0, property.getPlot().getY());
		assertEquals (1, property.getPlot().getWidth());
		assertEquals (1, property.getPlot().getDepth());
		
	}
	
	@Test
	public void testGivenPropertyPlotVal() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me",1,2,3,4);
		assertEquals ("Property Name", property.getPropertyName());
		assertEquals ("City Name", property.getCity());
		assertEquals ("Me", property.getOwner());
		assertEquals (100.00, property.getRentAmount());
		assertEquals (1, property.getPlot().getX());
		assertEquals (2, property.getPlot().getY());
		assertEquals (3, property.getPlot().getWidth());
		assertEquals (4, property.getPlot().getDepth());
		
	}
	
	@Test
	public void testCopyProperty() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me",1,2,3,4);
		Property copy = new Property(property);
		assertEquals (property.getPropertyName(), copy.getPropertyName());
		assertEquals (property.getCity(), copy.getCity());
		assertEquals (property.getOwner(), copy.getOwner());
		assertEquals (property.getRentAmount(), copy.getRentAmount());
		assertEquals (property.getPlot().getX(), copy.getPlot().getX());
		assertEquals (property.getPlot().getY(), copy.getPlot().getY());
		assertEquals (property.getPlot().getWidth(), copy.getPlot().getWidth());
		assertEquals (property.getPlot().getDepth(),copy.getPlot().getDepth());
		
	}
	
	@Test
	public void testGetPropertyName() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me");
		assertEquals ("Property Name", property.getPropertyName());
		
	}
	
	@Test
	public void testGetCity() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me");
		assertEquals ("City Name", property.getCity());
		
	}
	
	@Test
	public void testGetRentAmount() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me");
		assertEquals (100.00, property.getRentAmount());
		
	}
	
	@Test
	public void testGetOwner() {
		
		Property property = new Property("Property Name", "City Name", 100.00, "Me");
		assertEquals ("Me", property.getOwner());
		
	}
	
	@Test
	public void testToString() {
		
		Property property = new Property("Property Name","City Name", 100.0, "Owner Name");
		assertEquals("Property Name,City Name,Owner Name,100.0",property.toString());	
	}
	
}
