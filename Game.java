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
		
		for(int i = 0; i < this.frameList.size() - 1; i++)
		{
			if(this.frameList.get(i).isStrike())
				if(this.frameList.get(i+1).isStrike())
					if(i != this.frameList.size() - 2)
						score += this.frameList.get(i).getScore() + this.frameList.get(i+1).getScore() + this.frameList.get(i+2).getThrow1();
					else
						score += this.frameList.get(i).getScore() + this.frameList.get(i+1).getScore();
				else
					score += this.frameList.get(i).getScore() + this.frameList.get(i+1).getScore();
			else
				if(this.frameList.get(i).isSpare())
					score += this.frameList.get(i).getScore() + this.frameList.get(i+1).getThrow1();
				else
					score += this.frameList.get(i).getScore();
		}
		
		score += this.frameList.get(this.frameList.size() - 1).getScore() + this.frameList.get(this.frameList.size() - 1).getBonusThrow();
		return score;
	}
}
