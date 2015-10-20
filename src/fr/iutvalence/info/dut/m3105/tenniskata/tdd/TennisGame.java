package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private int pointServeur;
	private int pointOther;
	
	public TennisGame()
	{
		this.pointServeur = 0;
		this.pointOther = 0;
		
	}
	public void addPointServeur() 
	{
		pointServeur++;
	}
	
	public void addPointOther() 
	{
		pointOther++;
	}
	
	public String getScore() 
	{
		if(pointServeur == 0 && pointOther == 0)
			return "love-all";
		
		else if(pointServeur == 1 && pointOther == 0)
			return "fifteen-love";
		
		else if(pointServeur == 0 && pointOther == 1)
			return "love-fifteen";
		
		else if(pointServeur == 1 && pointOther == 1)
			return "fifteen-fifteen";
		
		else return "";
	}	
}
