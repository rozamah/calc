package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

public class controller {

private static model m;
private static view1 v;

public controller(view1 v , model m){
	this.m=m;
	this.v=v;
	
	this.v.addbuttonl((ActionListener)new addl());
	this.v.sub1buttonl((ActionListener)new subl());
	this.v.multbuttonl((ActionListener)new mull());
	this.v.divbuttonl((ActionListener)new divl());
	this.v.modbuttonl((ActionListener)new modl());
	this.v.sqrtbuttonl((ActionListener)new sqrtl());
}
class addl implements ActionListener{
	
double ff=0.0 ,ss=0.0 ;
	public void actionPerformed(ActionEvent e) {
//		System.out.println("hi1");
 ff =v.getfirstnumber() ;
		 ss = v.getsecondnumber();
			model.addmethod(ff,ss);
			view1.setResult(m.getx());
		//	System.out.println("hi2");
		}}
class subl implements ActionListener{
	double ff=0.0 ,ss=0.0;
	public void actionPerformed(ActionEvent e) {	
		ff =v.getfirstnumber() ;
		 ss = v.getsecondnumber();
			model.submethod(ff,ss);
			v.setResult(m.getx());

		}}

class mull implements ActionListener{
	double ff=0.0 ,ss=0.0;
	public void actionPerformed(ActionEvent e) {
		ff =v.getfirstnumber() ;
		 ss = v.getsecondnumber();
			model.multmethod(ff,ss);	
			v.setResult(m.getx());

		}}
class divl implements ActionListener{
	double ff=0.0 ,ss=0.0;
	public void actionPerformed(ActionEvent e) {
		ff =v.getfirstnumber() ;
		 ss = v.getsecondnumber();
			m.divmethod(ff,ss);
			v.setResult(m.getx());
		
		}}
class modl implements ActionListener{
	double ff=0.0,ss=0.0;
     
	public void actionPerformed(ActionEvent e) {
		ff =v.getfirstnumber() ;
		 ss = v.getsecondnumber();
			m.modmethod(ff,ss);
			v.setResult(m.getx());

		}}

class sqrtl implements ActionListener{
	double ff=0.0,ss=0.0;
	public void actionPerformed(ActionEvent e) {
		 ff =v.getfirstnumber() ;
		 ss = v.getsecondnumber();
			m.sqrtmethod(ff);
			v.setResult(m.getx());

		}}
	
	
	
	public static void main(String[] args) {
		view1 v = new view1();
		 v.setVisible(true);
		model m = new model();
	controller c = new controller( v , m);
	}
}