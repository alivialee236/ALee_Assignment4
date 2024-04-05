/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Description: This class represents GFA test cases for a ManagementCompany object.
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

public class ManagmentCompanyTestSudent {

	@Test
	public void testNoArgManagementCompany() {
		
		ManagementCompany company = new ManagementCompany();
		assertEquals ("", company.getName());
		assertEquals ("", company.getTaxID());
		assertEquals (0.0, company.getMgmFeePer());
		assertEquals (0, company.getPlot().getX());
		assertEquals (0, company.getPlot().getY());
		assertEquals (10, company.getPlot().getWidth());
		assertEquals (10, company.getPlot().getDepth());
		assertEquals (0, company.getPropertiesCount());
	}
	
	@Test
	public void testGivenManagementCompanyVal() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals ("Management Company", company.getName());
		assertEquals ("1234567", company.getTaxID());
		assertEquals (50.0, company.getMgmFeePer());
		assertEquals (0, company.getPlot().getX());
		assertEquals (0, company.getPlot().getY());
		assertEquals (10, company.getPlot().getWidth());
		assertEquals (10, company.getPlot().getDepth());
		assertEquals (0, company.getPropertiesCount());
	}

	@Test
	public void testGivenManagementCompanyPlotVal() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0,1,2,3,4);
		assertEquals ("Management Company", company.getName());
		assertEquals ("1234567", company.getTaxID());
		assertEquals (50.0, company.getMgmFeePer());
		assertEquals (1, company.getPlot().getX());
		assertEquals (2, company.getPlot().getY());
		assertEquals (3, company.getPlot().getWidth());
		assertEquals (4, company.getPlot().getDepth());
		assertEquals (0, company.getPropertiesCount());
	}
	
	@Test
	public void testManagementCompanyCopy() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0,1,2,3,4);
		ManagementCompany copy = new ManagementCompany(company);
		assertEquals (company.getName(), copy.getName());
		assertEquals (company.getTaxID(), copy.getTaxID());
		assertEquals (company.getMgmFeePer(), copy.getMgmFeePer());
		assertEquals (company.getPlot().getX(), copy.getPlot().getX());
		assertEquals (company.getPlot().getY(), copy.getPlot().getY());
		assertEquals (company.getPlot().getWidth(), copy.getPlot().getWidth());
		assertEquals (company.getPlot().getDepth(), copy.getPlot().getDepth());
		assertEquals (company.getPropertiesCount(), copy.getPropertiesCount());
	}
	
	@Test
	public void testGetName() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals ("Management Company", company.getName());
		
	}
	
	@Test
	public void testGetTaxID() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals ("1234567", company.getTaxID());
		
	}
	
	@Test
	public void testGetMgmFeePer() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals (50.0, company.getMgmFeePer());
		
	}
	
	@Test
	public void testGetProperties() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property1 = new Property();
		Property property2 = new Property("Property Name", "City Name", 100.00, "Me",5,5,2,2);
		company.addProperty(property1);
		company.addProperty(property2);
		assertEquals(5, company.getProperties().length);
		Property[] tester = company.getProperties();
		assertEquals (property1, tester[0]);
		assertEquals (property2, tester[1]);
		
	}
	
	@Test
	public void testGetPlot() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0,1,2,3,4);
		Plot plot = company.getPlot();
		assertEquals (1, plot.getX());
		assertEquals (2, plot.getY());
		assertEquals (3, plot.getWidth());
		assertEquals (4, plot.getDepth());
		
	}
	
	@Test
	public void testGetPropertiesCount() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals (0, company.getPropertiesCount());
		Property property1 = new Property();
		Property property2 = new Property("Property Name", "City Name", 100.00, "Me",5,5,2,2);
		Property property3 = new Property("Property Name", "City Name", 100.00, "Me",9,9,1,1);
		company.addProperty(property1);
		company.addProperty(property2);
		company.addProperty(property3);
		assertEquals (3, company.getPropertiesCount());
		
	}
	
	@Test
	public void testAddProperty1() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property1 = new Property();
		Property property2 = new Property();
		Property property3 = null;
		Property property4 = new Property("Property Name", "City Name", 100.00, "Me",5,5,1,1);
		Property property5 = new Property("Property Name", "City Name", 100.00, "Me",0,0,90,90);
		Property property6 = new Property("Property Name", "City Name", 100.00, "Me",7,7,1,1);
		Property property7 = new Property("Property Name", "City Name", 100.00, "Me",6,6,1,1);
		Property property8 = new Property("Property Name", "City Name", 100.00, "Me",8,8,1,1);
		Property property9 = new Property("Property Name", "City Name", 100.00, "Me",9,9,1,1);
		assertEquals (0, company.addProperty(property1));
		assertEquals (-4, company.addProperty(property2));
		assertEquals (-2, company.addProperty(property3));
		company.addProperty(property4);
		assertEquals (-3, company.addProperty(property5));
		company.addProperty(property6);
		company.addProperty(property7);
		company.addProperty(property8);
		assertEquals (-1, company.addProperty(property9));
		assertEquals (5, company.getPropertiesCount());
		
	}
	
	@Test
	public void testAddProperty2() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals (0, company.addProperty("","",0.0,""));
		assertEquals (-4, company.addProperty("Property Name", "City Name", 100.00, "Me"));
		assertEquals (-2, company.addProperty(null));

	}
	
	@Test
	public void testAddProperty3() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		assertEquals (0, company.addProperty("Property Name", "City Name", 100.00, "Me",0,0,1,1));
		assertEquals (-4, company.addProperty("Property Name", "City Name", 100.00, "Me",0,0,1,1));
		assertEquals (-2, company.addProperty(null));
		company.addProperty("Property Name", "City Name", 100.00, "Me",5,5,1,1);
		assertEquals (-3, company.addProperty("Property Name", "City Name", 100.00, "Me",0,0,90,90));
		company.addProperty("Property Name", "City Name", 100.00, "Me",7,7,1,1);
		company.addProperty("Property Name", "City Name", 100.00, "Me",6,6,1,1);
		company.addProperty("Property Name", "City Name", 100.00, "Me",8,8,1,1);
		assertEquals (-1, company.addProperty("Property Name", "City Name", 100.00, "Me",9,9,1,1));
		assertEquals (5, company.getPropertiesCount());
		
	}
	
	@Test
	public void testGetTotalRent() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property1 = new Property("Property Name", "City Name", 100.00, "Me",7,7,1,1);
		Property property2 = new Property("Property Name", "City Name", 100.00, "Me",6,6,1,1);
		Property property3 = new Property("Property Name", "City Name", 100.00, "Me",8,8,1,1);
		Property property4 = new Property("Property Name", "City Name", 100.00, "Me",9,9,1,1);
		Property property5 = new Property();
		company.addProperty(property1);
		company.addProperty(property2);
		company.addProperty(property3);
		company.addProperty(property4);
		company.addProperty(property5);
		assertEquals (400.0, company.getTotalRent());

	}
	
	@Test
	public void testGetHighestRentPropperty() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property1 = new Property("Property Name", "City Name", 100.00, "Me",7,7,1,1);
		Property property2 = new Property("Property Name", "City Name", 300.00, "Me",6,6,1,1);
		Property property3 = new Property("Property Name", "City Name", 20000.00, "Me",8,8,1,1);
		Property property4 = new Property("Property Name", "City Name", 2000.00, "Me",9,9,1,1);
		Property property5 = new Property();
		company.addProperty(property1);
		company.addProperty(property2);
		company.addProperty(property3);
		company.addProperty(property4);
		company.addProperty(property5);
		assertEquals (property3, company.getHighestRentPropperty());

	}
	
	@Test
	public void testRemoveLastProperty() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property1 = new Property("Property Name", "City Name", 100.00, "Me",7,7,1,1);
		Property property2 = new Property("Property Name", "City Name", 300.00, "Me",6,6,1,1);
		Property property3 = new Property("Property Name", "City Name", 20000.00, "Me",8,8,1,1);
		Property property4 = new Property("Property Name", "City Name", 2000.00, "Me",9,9,1,1);
		Property property5 = new Property();
		company.addProperty(property1);
		company.addProperty(property2);
		company.addProperty(property3);
		company.addProperty(property4);
		company.addProperty(property5);
		assertEquals (5, company.getPropertiesCount());
		company.removeLastProperty();
		assertEquals (4, company.getPropertiesCount());

	}
	
	@Test
	public void testIsPropertiesFull() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property1 = new Property("Property Name", "City Name", 100.00, "Me",7,7,1,1);
		Property property2 = new Property("Property Name", "City Name", 300.00, "Me",6,6,1,1);
		Property property3 = new Property("Property Name", "City Name", 20000.00, "Me",8,8,1,1);
		Property property4 = new Property("Property Name", "City Name", 2000.00, "Me",9,9,1,1);
		Property property5 = new Property();
		company.addProperty(property1);
		company.addProperty(property2);
		company.addProperty(property3);
		company.addProperty(property4);
		company.addProperty(property5);
		assertTrue (company.isPropertiesFull());
		
	}
	
	@Test
	public void testIsManagementFeeValid() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 100.0);
		ManagementCompany company2 = new ManagementCompany("Management Company", "1234567", 0.0);
		ManagementCompany company3 = new ManagementCompany("Management Company", "1234567", 150.0);
		ManagementCompany company4 = new ManagementCompany("Management Company", "1234567", 50.0);
		assertTrue (company.isManagementFeeValid());
		assertTrue (company2.isManagementFeeValid());
		assertFalse (company3.isManagementFeeValid());
		assertTrue (company4.isManagementFeeValid());
	}
	
	@Test
	public void testToString() {
		
		ManagementCompany company = new ManagementCompany("Management Company", "1234567", 50.0);
		Property property = new Property ("Property Name", "Lee", 2000.0, "Rockville");
		assertEquals(company.addProperty(property), 0);
		String expectedString = "List of the properties for Management Company, taxID: 1234567\n"
				+ "______________________________________________________\n"
				+ "Property Name,Lee,Rockville,2000.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 1000.0";
		System.out.println(expectedString);
		System.out.println(company.toString());
		assertEquals(expectedString, company.toString());
		
		
	}
	
}
