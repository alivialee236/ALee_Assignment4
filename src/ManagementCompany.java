/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Description: Creates the plots and properties for the management 
 * company. Performs functions to see if properties can be added, and
 * also determines the total rent and highest rent property. Prints 
 * out the information of the management company in a string.
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alivia Lee
*/

public class ManagementCompany {

	//Fields
	private String name, //management company name
				   taxID; //management company tax ID
	private double mgmFee;//management company fee %
	public final int MAX_PROPERTY = 5; //max number of properties
	public final int MGMT_WIDTH = 10;//width of the management company's plot
	public final int MGMT_DEPTH = 10;//depth of the management company's plot
	private Property[] properties = new Property[MAX_PROPERTY];//Array to store properties
	private Plot plot; //Plot of the management company
	private int numOfProperties = 0; //the current number of properties owned by the management company
					
	//Constructors
	
	/**
	 * No-arg Constructor ManagementCompany sets all fields
	 * 	to default information
	 */
	public ManagementCompany() {
		
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0.0;
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	
	/**
	 Constructor ManagementCompany sets given values
	 @param name sets the management's name
	 @param taxID sets the taxID of the management
	 @param mgmFee sets the management fee of the management
	 */
	public ManagementCompany(String name, String taxID, double mgmFee) {
		
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	
	/**
	 Constructor Property sets given values
	 @param name sets the management's name
	 @param taxID sets the taxID of the management
	 @param mgmFee sets the management fee of the management
	 @param x sets the x coordinate of the plot
	 @param y sets the y coordinate of the plot
	 @param width sets the width of the plot extending from (x,y)
	 @param depth sets the depth of the plot extending from (x,y)
	 	
	 */
	public ManagementCompany(String name, String taxID, double mgmFee, 
							 int x, int y, int width, int depth) {
		
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	
	/**
	 Copy constructor ManagementCompany copies the management company values from given management company
	 @param otherCompany is the given management company to copy
	 */
	public ManagementCompany(ManagementCompany otherCompany) {
		
		name = otherCompany.getName();
		taxID = otherCompany.getTaxID();
		mgmFee = otherCompany.getMgmFeePer();
		plot = new Plot(otherCompany.getPlot());
		properties = new Property[MAX_PROPERTY];
		numOfProperties = otherCompany.getPropertiesCount();
		
		for (int i = 0; i < otherCompany.numOfProperties; i++) {
			
			properties[i] = new Property(otherCompany.properties[i]);
			
		}
		
	}
	
	
	//Methods
	
	/**
	 Method getName
	 @return name
	 */
	public String getName() {
		
		return name;
		
	}
	
	/**
	 Method getTaxID
	 @return taxID
	 */
	public String getTaxID() {
		
		return taxID;
		
	}
	
	/**
	 Method getMgmFeePer
	 @return mgmFee
	 */
	public double getMgmFeePer() {
		
		return mgmFee;
		
	}
	
	/**
	 Method getProperties
	 @return properties
	 */
	public Property[] getProperties() {
		
		return properties;
		
	}
	
	/**
	 Method getPlot
	 @return plot
	 */
	public Plot getPlot() {
		
		return plot;
		
	}
	
	/**
	 Method getPropertiesCount
	 @return numOfProperties
	 */
	public int getPropertiesCount() {
		
		return numOfProperties;
		
	}
	
	/**
	 Method addProperty
	 Checks for if the property array is full, null, 
	 the plot is not encompassed or if the plot overlaps another
	 @param property goes through if-else statements to decide
	  whether to add a property or not
	 @return an integer of -1, -2, -3, or -4
	 */
	public int addProperty(Property property) {
		
		if (numOfProperties >= MAX_PROPERTY) {
			
			return -1;
			
		}else if (property == null) {
			
			return -2;
			
		}else if (!plot.encompasses(property.getPlot())) {
			
			return -3;
			
		}else {
			
			for (int i = 0; i < numOfProperties; i++) {
				
				if(properties[i].getPlot().overlaps(property.getPlot())) {
					
					return -4;
					
				}
				
			}
			
			properties[numOfProperties] = property;
			numOfProperties += 1;
			return (numOfProperties - 1);
			
		}
	}
	
	/**
	 Method addProperty
	 overloaded function
	 Checks for if the property array is full, null, 
	 the plot is not encompassed or if the plot overlaps another
	 through the given values
	 @param propertyName sets the property's name
	 @param city sets the property's city
	 @param rentAmount sets the rent amount of the property
	 @param owner sets the owner of the property
	 @return an integer of -1, -2, -3, or -4
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		
		
		Property property = new Property(name, city, rent, owner);
		return addProperty(property);
		
	}
	
	/**
	 Method addProperty
	 overloaded function
	 Checks for if the property array is full, null, 
	 the plot is not encompassed or if the plot overlaps another
	 through the given values
	 @param propertyName sets the property's name
	 @param city sets the property's city
	 @param rentAmount sets the rent amount of the property
	 @param owner sets the owner of the property
	 @param x sets the x coordinate
	 @param y sets the y coordinate
	 @param width sets the width of the plot extending from (x,y)
	 @param depth sets the depth of the plot extending from (x,y)
	 @return an integer of -1, -2, -3, or -4
	 */
	public int addProperty(String name, String city, double rent, String owner,
						   int x, int y, int width, int depth) {
		
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		return addProperty(property);
		
	}
	
	/**
	 Method getTotalRent
	 Goes through each property and collects the rent and add them together
	 @return a double of the total rent
	 */
	public double getTotalRent() {
		
		double totalRent = 0.0;
		for (int i = 0; i < numOfProperties; i++) {
			
			totalRent += properties[i].getRentAmount();
			
		}
		
		return totalRent;
		
	}
	
	/**
	 Method getHighestRentPropperty
	 Goes through each property and finds the highest rent property
	 @return a double of the highest rent
	 */
	public Property getHighestRentPropperty() {
		
		if (numOfProperties == 0) {
			
			return new Property("","",0.0,"");
			
		}
		
		Property highestRentProperty = properties[0];
		for (int i = 0; i < numOfProperties; i++) {
			
			if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
				
				highestRentProperty = properties[i];
				
			}
			
		}
		
		return highestRentProperty;
	}
	
	/**
	 Method removeLastProperty
	 Removes the last property in the array properties
	 */
	public void removeLastProperty() {
		
		if (numOfProperties > 0) {
			
			properties[numOfProperties - 1] = null;
			numOfProperties -= 1;
			
		}
		
	}
	
	/**
	 Method isPropertiesFull
	 Checks if the number of properties exceeds five
	 @return true or false
	 */
	public boolean isPropertiesFull() {
		
		return (numOfProperties >= MAX_PROPERTY);
		
	}
	
	/**
	 Method isManagementFeeValid
	 Checks if the management fee is between 0-100 included
	 @return true or false
	 */
	public boolean isManagementFeeValid() {
		
		return (mgmFee >= 0 && mgmFee <= 100);
		
	}
	
	@Override
	/**
	 Method toString
	 @return a String with list of properties and all the values
	 */
	public String toString() {
		
		StringBuilder propertyList = new StringBuilder();
		for (int i = 0; i < numOfProperties; i++) {
			
			propertyList.append(properties[i].toString()).append("\n");
			
		}
		
		return ("List of the properties for " + name + ", taxID: " + taxID + "\n" +
				"______________________________________________________\n" +
				propertyList + "______________________________________________________\n" +
				"\n total management Fee: " + (getTotalRent() * mgmFee / 100.0));
		
	}
	
	
}
