package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void resultEqualToLove()
	{
		TennisGame tennisGame = new TennisGame();
		Assert.assertEquals(tennisGame.getScore(),"love-all");
	}
	@Test
	public void resultEqualToFifteenLove()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.addPointServeur();
		Assert.assertEquals(tennisGame.getScore(),"fifteen-love");
	}
	
	@Test
	public void resultEqualToLoveFifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.addPointOther();
		Assert.assertEquals(tennisGame.getScore(),"love-fifteen");
	}

	@Test
	public void resultEqualToFifteenFifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.addPointOther();
		tennisGame.addPointServeur();
		Assert.assertEquals(tennisGame.getScore(),"fifteen-fifteen");
	}
}
