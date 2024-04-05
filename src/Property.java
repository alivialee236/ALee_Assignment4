/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Description: Creates a property with default information or
 * given a name, city, owner, and rent amount
 * x,y-coordinates, width and depth.
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alivia Lee
*/

public class Property {

	//Fields 
	private String propertyName, //name of property
				   city, //city the property is located in
				   owner; //owner of the property
	private double rentAmount; //the rent cost of the property
	private Plot plot; //The plot the property is in
	
	//Constructors
	
	/**
	 * No-arg Constructor Property sets all fields
	 * 	to default information
	 */
	public Property() {
		
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0.0;
		this.plot = new Plot();
		
	}
	
	/**
	 Constructor Property sets how large the plot will be from given values
	 @param propertyName sets the property's name
	 @param city sets the property's city
	 @param rentAmount sets the rent amount of the property
	 @param owner sets the owner of the property
	 	
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
		
	}
	
	/**
	 Constructor Property sets how large the plot will be from given values
	 @param propertyName sets the property's name
	 @param city sets the property's city
	 @param rentAmount sets the rent amount of the property
	 @param owner sets the owner of the property
	 @param x sets the x coordinate of the plot
	 @param y sets the y coordinate of the plot
	 @param width sets the width of the plot extending from (x,y)
	 @param depth sets the depth of the plot extending from (x,y)
	 	
	 */
	public Property(String propertyName, String city, double rentAmount, String owner,
					int x, int y, int width, int depth) {
		
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
		
	}
	
	/**
	 Copy constructor Property copies the plot values from given plot
	 @param otherProperty is the given property to copy
	 */
	public Property(Property otherProperty) {
		
		propertyName = otherProperty.getPropertyName();
		city = otherProperty.getCity();
		rentAmount = otherProperty.getRentAmount();
		owner = otherProperty.getOwner();
		plot = new Plot(otherProperty.getPlot());
		
		
	}
	
	
	//Methods
	
	/**
	 Method getPropertyName
	 @return propertyName
	 */
	public String getPropertyName() {
		
		return propertyName;
		
	}
	
	/**
	 Method getCity
	 @return city
	 */
	public String getCity() {
		
		return city;
		
	}
	
	/**
	 Method getOwner
	 @return owner
	 */
	public String getOwner() {
		
		return owner;
		
	}
	
	/**
	 Method getRentAmount
	 @return rentAmount
	 */
	public double getRentAmount() {
		
		return rentAmount;
		
	}

	/**
	 Method getPlot
	 @return plot
	 */
	public Plot getPlot() {
		
		return plot;
		
	}

	@Override
	/**
	 Method toString
	 @return a String with the property name, city, owner, and rent amount
	 */
	public String toString() {
		
		return (propertyName + "," + city + "," + owner + "," + rentAmount);
		
	}
	
	
	
}
