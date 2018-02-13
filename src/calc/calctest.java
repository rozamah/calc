package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import javax.swing.JOptionPane;
import org.junit.*;
class calctest {
	model model1 = new model();
	view1 view2 = new view1();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		model1.addmethod(2.0,8.0);
		assertEquals(model1.getx(),10.0,0.0);
		
		model1.submethod(-3.0, 7.0);
		assertEquals(model1.getx(),-10.0,0.0);
		
		model1.sqrtmethod(-9.0);
		assertEquals(model1.getx(),-1.0,0.0);

		
		model1.multmethod(8,2);
		assertEquals(model1.getx(),16.0,0.0);
		
		model1.divmethod(9.0, 0.0);
		assertEquals(model1.getx(),-1.0,0.0);
	}

}
