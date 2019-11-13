package com.agile.test;

public class BowlingGame {

	public boolean checkIfStrike(String shotType) {

		boolean result = false;
		if (shotType.equals("strike"))
		{
			result = true;
		}
		return result;

	}
	
	
	
	
	
	public boolean checkIfSpare(String shotType) {

		boolean result = false;
		if (shotType.equals("spare"))
		{
			result = true;
		}
		return result;

	}
	
	public String checkShotType(int FistThrow,int secondThrow) {

		String shotType=null;
		if (FistThrow == 10) {
			shotType = "strike";
		}

		else if((FistThrow+secondThrow )==10){

			shotType = "spare";
		}
		return shotType;

	}
	
	
	public int checkBonus(int FistThrow,int secondThrow,int frame){		
		
		int bonus=0;
		if (frame == 1){
			
		if	(checkShotType(FistThrow,secondThrow).equals("strike")) {
			 bonus = 2;
		}
			
		if	(checkShotType(FistThrow,secondThrow).equals("spare")) {
			 bonus = 1;	
		
			
		}
		
		return bonus;
	}
	
	
	public int score(){
		
		return 0;
		
	}
	
	

}
