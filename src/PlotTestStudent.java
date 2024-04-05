import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/*
 * Class: CMSC203 CRN 30339
 * Instructor:Professor Grinberg
 * Description: This class represents GFA test cases for a Plot object.
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alivia Lee
*/

public class PlotTestStudent {

	@Test
	public void testNoArgPlot() {
		
		Plot plot = new Plot();
		assertEquals (0, plot.getX());
		assertEquals (0, plot.getY());
		assertEquals (1, plot.getWidth());
		assertEquals (1, plot.getDepth());
		
	}
	
	@Test
	public void testGivenValPlot() {
		
		Plot plot = new Plot(1,2,3,4);
		assertEquals (1, plot.getX());
		assertEquals (2, plot.getY());
		assertEquals (3, plot.getWidth());
		assertEquals (4, plot.getDepth());
		
	}
	
	@Test
	public void testCopyPlot() {
		
		Plot plot = new Plot(1,2,3,4);
		Plot copy = new Plot(plot);
		assertEquals (plot.getX(), copy.getX());
		assertEquals (plot.getY(), copy.getY());
		assertEquals (plot.getWidth(), copy.getWidth());
		assertEquals (plot.getDepth(),copy.getDepth());
		
	}
	
	@Test
	public void testGetX() {
		
		Plot plot = new Plot(1,2,3,4);
		assertEquals (1, plot.getX());
		
	}
	
	@Test
	public void testSetX() {
		
		Plot plot = new Plot();
		plot.setX(7);
		assertEquals (7, plot.getX());
		
	}
	
	@Test
	public void testGetY() {
		
		Plot plot = new Plot(1,2,3,4);
		assertEquals (2, plot.getY());
		
	}
	
	@Test
	public void testSetY() {
		
		Plot plot = new Plot();
		plot.setY(7);
		assertEquals (7, plot.getY());
		
	}
	
	@Test
	public void testGetWidth() {
		
		Plot plot = new Plot(1,2,3,4);
		assertEquals (3, plot.getWidth());
		
	}
	
	@Test
	public void testSetWidth() {
		
		Plot plot = new Plot();
		plot.setWidth(7);
		assertEquals (7, plot.getWidth());
		
	}
	
	@Test
	public void testGetDepth() {
		
		Plot plot = new Plot(1,2,3,4);
		assertEquals (4, plot.getDepth());
		
	}
	
	@Test
	public void testSetDepth() {
		
		Plot plot = new Plot();
		plot.setDepth(7);
		assertEquals (7, plot.getDepth());
		
	}
	
	@Test
	public void testOverlaps() {
		
		Plot plot1 = new Plot(0,0,3,3);//overlaps plot2 shares edge plot3
		Plot plot2 = new Plot(1,0,3,3);//overlaps plot1, shares edge plot3
		Plot plot3 = new Plot(0,3,2,2);//does not overlap plot 2 or plot1
		
		assertTrue(plot1.overlaps(plot2));
		assertTrue(plot2.overlaps(plot1));
		assertFalse(plot1.overlaps(plot3));
		assertFalse(plot2.overlaps(plot3));
		
	}
	
	@Test
	public void testEncompasses() {
		
		Plot plot1 = new Plot(0,0,3,3);//Encompasses plot2 not plot3
		Plot plot2 = new Plot(0,0,1,1);//is encompassed by plot1
		Plot plot3 = new Plot(0,3,2,2);//not encompassed by any plot
		
		assertTrue(plot1.encompasses(plot2));
		assertFalse(plot2.encompasses(plot1));
		assertFalse(plot1.encompasses(plot3));
		assertFalse(plot2.encompasses(plot3));
		
	}
	
	@Test
	public void testToString() {
		
		Plot plot = new Plot(1,2,9,3);
		assertEquals("1,2,9,3",plot.toString());	
	}
	
	
}
