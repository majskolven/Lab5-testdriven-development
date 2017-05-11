package lab5new;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class Test {

	@org.junit.Test
	public void testFrame() {
		Frame testFrame = new Frame(2,4);
		assertEquals(2,testFrame.getThrow1());
		assertEquals(4,testFrame.getThrow2());
	}
	
	@org.junit.Test
	public void testFrameScore() {
		Frame testFrame = new Frame(2,4);
		assertEquals(6,testFrame.getScore());
	}
	
	@org.junit.Test
	public void testGame() {
		Game testGame = new Game();
		assertEquals(10,testGame.frameList.size());
	}
	
	@org.junit.Test
	public void testGameScore() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(1,5));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(7,2));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(4,4));
		testFrameList.add(new Frame(5,3));
		testFrameList.add(new Frame(3,3));
		testFrameList.add(new Frame(4,5));
		testFrameList.add(new Frame(8,1));
		testFrameList.add(new Frame(2,6));
		Game testGame = new Game(testFrameList);
		assertEquals(81,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testStrike() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(7,2));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(4,4));
		testFrameList.add(new Frame(5,3));
		testFrameList.add(new Frame(3,3));
		testFrameList.add(new Frame(4,5));
		testFrameList.add(new Frame(8,1));
		testFrameList.add(new Frame(2,6));
		Game testGame = new Game(testFrameList);
		assertEquals(94,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testSpare() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(1,9));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(7,2));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(4,4));
		testFrameList.add(new Frame(5,3));
		testFrameList.add(new Frame(3,3));
		testFrameList.add(new Frame(4,5));
		testFrameList.add(new Frame(8,1));
		testFrameList.add(new Frame(2,6));
		Game testGame = new Game(testFrameList);
		assertEquals(88,testGame.getTotalScore());
	}
}
