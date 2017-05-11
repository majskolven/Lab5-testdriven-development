package lab5new;

public class Frame {
	private int throw1;
	private int throw2;
	private boolean strike;
	private boolean spare;
	
	public Frame()
	{
		this.setThrow1(0);
		this.setThrow2(0);
		this.strike = false;
	}
	
	public Frame(int throw1, int throw2)
	{
		this.setThrow1(throw1);
		this.setThrow2(throw2);
		if (throw1 == 10)
			this.strike = true;
		else
		{
			this.strike = false;
			if (throw1 + throw2 == 10)
				this.spare = true;
			else
				this.spare = false;
		}
	}

	public int getThrow1() {
		return throw1;
	}

	public void setThrow1(int throw1) {
		this.throw1 = throw1;
		
		if (throw1 == 10)
			this.strike = true;
		else
			this.strike = false;
	}

	public int getThrow2() {
		return throw2;
	}

	public void setThrow2(int throw2) {
		this.throw2 = throw2;
		
		if (this.throw1 + throw2 == 10)
			this.spare = true;
		else
			this.spare = false;
	}
	
	public int getScore(){
		return this.throw1 + this.throw2;
	}

	public boolean isStrike() {
		return this.strike;
	}
	
	public boolean isSpare() {
		return this.spare;
	}
}
