package com.agile.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1 {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void testcase2() {
		Myclass myclass=new Myclass();
		
		assertEquals("10 x 5 must be 50", 60, myclass.multiply(10, 5));
		
		
	}
	
	@Test
	public void testcase3() {
		Myclass myclass=new Myclass();
		
		assertEquals("10 x 5 must be 50", 50, myclass.multiply(10, 5));
		
		
	}

		
	@Test
	public void checkStrikeIsStrike() {
		BowlingGame bowlingGame=new BowlingGame();		
		assertEquals("checkStrike", "strike",bowlingGame.checkShotType("strike") );
		
		
	}
	
	
	
	
	
	@Test
	public void checkSpare() {
		BowlingGame bowlingGame=new BowlingGame();		
		assertEquals("checkSpare", "spare",bowlingGame.checkShotType("spare") );
		
		
	}
	
	
	
	
	

	
	@Test
	public void checkFirstFrameStrike() {
		BowlingGame bowlingGame=new BowlingGame();
		
		//for(int frameNumber=0; frameNumber<10 ;frameNumber++){
			
			//bowlingGame.checkBonus(10,0,0);
			
		assertEquals("checkbonus",2,bowlingGame.checkBonus(10,0,1) );
		//assertEquals("10 x 5 must be 50", 60, myclass.multiply(10, 5));
		//}
		
	}
	
	
	
	@Test
	public void checkFirstFrameSpare() {
		BowlingGame bowlingGame=new BowlingGame();
		
		//for(int frameNumber=0; frameNumber<10 ;frameNumber++){
			
			//bowlingGame.checkBonus(3, 6,1);
			
		assertEquals("checkbonus",1,bowlingGame.checkBonus(6,4,1) );
		//assertEquals("10 x 5 must be 50", 60, myclass.multiply(10, 5));
		//}
		
	}



}
