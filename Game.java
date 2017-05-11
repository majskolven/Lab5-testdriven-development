package lab5new;

import java.util.ArrayList;

public class Game {
	public ArrayList<Frame> frameList;
	
	public Game()
	{
		this.frameList = new ArrayList<Frame>();
		
		for(int i = 0; i < 10; i++)
		{
			this.frameList.add(new Frame());
		}
	}
	
	public Game(ArrayList<Frame> frameList)
	{
		this.frameList = frameList;
	}
	
	public int getTotalScore()
	{
		int score = 0;
		
		for(int i = 0; i < this.frameList.size(); i++)
		{
			if(this.frameList.get(i).isStrike())
				score += this.frameList.get(i).getScore() + this.frameList.get(i+1).getScore();
			else
				if(this.frameList.get(i).isSpare())
					score += this.frameList.get(i).getScore() + this.frameList.get(i+1).getThrow1();
				else
					score += this.frameList.get(i).getScore();
		}
		return score;
	}
}
