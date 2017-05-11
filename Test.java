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
	
	@org.junit.Test
	public void testStrikeSpare() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(4,6));
		testFrameList.add(new Frame(7,2));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(4,4));
		testFrameList.add(new Frame(5,3));
		testFrameList.add(new Frame(3,3));
		testFrameList.add(new Frame(4,5));
		testFrameList.add(new Frame(8,1));
		testFrameList.add(new Frame(2,6));
		Game testGame = new Game(testFrameList);
		assertEquals(103,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testMultipleStrikes() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(7,2));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(4,4));
		testFrameList.add(new Frame(5,3));
		testFrameList.add(new Frame(3,3));
		testFrameList.add(new Frame(4,5));
		testFrameList.add(new Frame(8,1));
		testFrameList.add(new Frame(2,6));
		Game testGame = new Game(testFrameList);
		assertEquals(112,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testMultipleSpares() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(8,2));
		testFrameList.add(new Frame(5,5));
		testFrameList.add(new Frame(7,2));
		testFrameList.add(new Frame(3,6));
		testFrameList.add(new Frame(4,4));
		testFrameList.add(new Frame(5,3));
		testFrameList.add(new Frame(3,3));
		testFrameList.add(new Frame(4,5));
		testFrameList.add(new Frame(8,1));
		testFrameList.add(new Frame(2,6));
		Game testGame = new Game(testFrameList);
		assertEquals(98,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testLastFrameSpare() {
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
		testFrameList.add(new Frame(2,8,7));
		Game testGame = new Game(testFrameList);
		assertEquals(90,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testLastFrameStrike() {
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
		testFrameList.add(new Frame(10,7,2));
		Game testGame = new Game(testFrameList);
		assertEquals(92,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testLastFrameSpareIntoStrike() {
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
		testFrameList.add(new Frame(2,8,10));
		Game testGame = new Game(testFrameList);
		assertEquals(93,testGame.getTotalScore());
	}
	
	@org.junit.Test
	public void testPerfectGame() {
		ArrayList<Frame> testFrameList = new ArrayList<Frame>();
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,0));
		testFrameList.add(new Frame(10,10,10));
		Game testGame = new Game(testFrameList);
		assertEquals(300,testGame.getTotalScore());
	}
}
