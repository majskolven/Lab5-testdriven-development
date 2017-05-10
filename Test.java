package lab5new;

import static org.junit.Assert.*;

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
		assertEquals(6,testFrame.getScore();
	}
}
