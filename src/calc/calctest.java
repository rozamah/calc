package calc;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import javax.swing.JOptionPane;
import org.junit.*;
public class calctest {
	model model1 = new model();
	view1 view2 = new view1();
	

	@Test
	public void test() {
		//fail("Not yet implemented");
		model1.addmethod(2.0,8.0);
		assertEquals(model1.getx(),10.0,0.0);}
		public void test1() {
		model1.submethod(-3.0, 7.0);
		assertEquals(model1.getx(),-10.0,0.0);}
		public void test2() {
		model1.sqrtmethod(-9.0);
		assertEquals(model1.getx(),-1.0,0.0);}
public void test3() {
		
		model1.multmethod(8,2);
		assertEquals(model1.getx(),16.0,0.0);}
		public void test4() {
		model1.divmethod(9.0, 0.0);
		assertEquals(model1.getx(),-1.0,0.0);
	}

}
