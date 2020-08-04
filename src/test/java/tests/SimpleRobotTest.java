package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import robo.AlphaRobot;
import robo.CoordinateRangeException;

public class SimpleRobotTest {
	static AlphaRobot robot ;
	static int percentage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		robot = new AlphaRobot("Robik","alpha");
		percentage = 0;
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testName() {
		 robot.setName(null);
		 assertNotEquals("Name test failed\nREASON: null name not allowed!", null, robot.getName());
	     if(robot.getName()!=null){
	    	 percentage+=10;
	    	 }
	}
	
	@Test
	public void testModel() {
		robot.setModel(null);
		assertNotEquals("Model test failed\nREASON: null model not allowed!", null, robot.getModel());
		if( robot.getModel() != null ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testSetXNegativeTCLessValue() {
		try {
			robot.setX(-100);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(robot.getX() >= 0, true);
		if( robot.getX() >= 0 ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testSetXNegativeTCMoreValue() {
  		try {
  			robot.setX(1000);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(robot.getX() <= 100, true);
		if( robot.getX() <= 100 ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testSetYNegativeTCLessValue() {
		try {
			robot.setY(-100);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(robot.getY() >= 0, true);
		if( robot.getY() >= 0 ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testSetYNegativeTCMoreValue() {
  		try {
  			robot.setY(1000);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(robot.getY() <= 100, true);
		if( robot.getY() <= 100 ) {
			percentage+=10;
		}
	}

	
	@Test
	public void testMoveUpPositiveTC() {
		try {
			robot.setY(0);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveUp();
		assertEquals(move, true);
		if( move ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testMoveUpNegativeTC() {
		try {
			robot.setY(100);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveUp();
		assertEquals(move, false);
		if( move ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testMoveDownPositiveTC() {
		try {
			robot.setY(100);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveDown();
		assertEquals(move, true);
		if( move ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testMoveDownNegativeTC() {
		try {
			robot.setY(0);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveDown();
		assertEquals(move, false);
		if( move ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testMoveLeftPositiveTC() {
		try {
			robot.setX(100);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveLeft();
		assertEquals(move, true);
		if( move ) {
			percentage+=10;
		}
	}

	@Test
	public void testMoveLeftNegativeTC() {
		try {
			robot.setX(0);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveLeft();
		assertEquals(move, false);
		if( move ) {
			percentage+=10;
		}
	}
   
	@Test
	public void testMoveRightPositiveTC() {
		try {
			robot.setX(0);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveRight();
		assertEquals(move, true);
		if( move ) {
			percentage+=10;
		}
	}
	
	@Test
	public void testMoveRightNegativeTC() {
		try {
			robot.setX(100);
		} catch (CoordinateRangeException e) {
			System.out.println(e.getMessage());
		}
		boolean move = robot.moveRight();
		assertEquals(move, false);
		if( move ) {
			percentage+=10;
		}
	}
}
