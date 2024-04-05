/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Description: Creates a plot with default information or 
 * given x,y-coordinates, width and depth. Performs
 * functions to compare two plots to determine if they overlay and/or are encompassed
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alivia Lee
*/


public class Plot {

	//Fields
	private int x,//x-coordinate starting from the left upper corner
				y,//y-coordinate starting from the left upper corner
				width,//width of the plot extending from (x,y)
				depth;//depth of the plot extending from (x,y)
	
	//Constructors
	
	/**
	 * No-arg Constructor Plot sets all fields
	 * 	to default information
	 */
	public Plot() {
		
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		
	}
	
	/**
	 Constructor Plot sets how large the plot will be from given values
	 @param x sets the x coordinate
	 @param y sets the y coordinate
	 @param width sets the width of the plot extending from (x,y)
	 @param depth sets the depth of the plot extending from (x,y)
	 	
	 */
	public Plot(int x, int y, int width, int depth) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
	}
	
	/**
	 Copy constructor Plot copies the plot values from given plot
	 @param otherPlot is the given plot to copy
	 */
	public Plot (Plot otherPlot) {
		
		x = otherPlot.getX();
		y = otherPlot.getY();
		width = otherPlot.getWidth();
		depth = otherPlot.getDepth();
		
	}
	
	//Methods 
	
	/**
	 Method getX
	 @return x
	 */
	public int getX() {
		
		return x;
		
	}
	
	/**
	 Method setX
	 @param x sets the x coordinate
	 */
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	/**
	 Method getY
	 @return y
	 */
	public int getY() {
		
		return y;
		
	}
	
	/**
	 Method setY
	 @param y sets the y coordinate
	 */
	public void setY(int y) {
		
		this.y= y;
		
	}
	
	/**
	 Method getWidth
	 @return width
	 */
	public int getWidth() {
		
		return width;
		
	}	
	
	/**
	 Method setWidth
	 @param width sets the width of the plot
	 */
	public void setWidth(int width) {
		
		this.width = width;
		
	}	

	/**
	 Method getDepth
	 @return depth
	 */
	public int getDepth() {
		
		return depth;
		
	}	
	
	/**
	 Method setDepth
	 @param depth sets the depth of the plot
	 */
	public void setDepth(int depth) {
		
		this.depth = depth;
		
	}
	
	/**
	 Method overlaps
	 Checks if two plots overlap each other
	 @param plot sets the plot value
	 @return true or false value
	 */
	public boolean overlaps(Plot plot) {
		
		if (x < plot.x + plot.width && x + width > plot.x &&
	               y < plot.y + plot.depth && y + depth > plot.y) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}
	
	/**
	 Method encompasses
	 Checks if a plot is encompassed by another 
	 @param plot sets the plot value
	 @return true or false value
	 */
	public boolean encompasses(Plot plot) {
		
		if (x <= plot.x && y <= plot.y && x + width >= plot.x + plot.width 
				&& y + depth >= plot.y + plot.depth) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}
	
	@Override
	/**
	 Method toString
	 @return a String with the x, y, width, depth values
	 */
	public String toString() {
		
		return (x + "," + y + "," + width + "," + depth);
		
	}
	
	
	
}
