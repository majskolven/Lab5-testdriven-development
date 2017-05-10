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
}
