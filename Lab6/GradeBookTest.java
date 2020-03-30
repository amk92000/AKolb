import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(80);
		
		g2.addScore(65);
		g2.addScore(89);
		g2.addScore(90);	
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testGradeBook() {
		//fail("Not yet implemented");
			}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("50.0 , 75.0 , 80.0"));
		assertTrue(g2.toString().equals("65.0 , 89.0 , 90.0"));
		//fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(205 , g1.sum() , 0.001);
		assertEquals(244 , g2.sum() , 0.001);
		//fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(50 , g1.minimum() , 0.01);
		assertEquals(60 , g2.minimum() , 0.01);
		//fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		assertEquals(130 , g1.finalScore() , 0.1);
		assertEquals(155 , g2.finalScore() , 0.1);
		//fail("Not yet implemented");

	
	}

}
