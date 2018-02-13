package calc;
import java.lang.Math;
public class model {
	static double result=0.0;
	static String msg=null;
		static void addmethod(double firstnumber,double secondnumber) {
			//System.out.println("hi3");
			result=firstnumber+secondnumber;
		}
		static void submethod(double firstnumber,double secondnumber) {
			result=firstnumber-secondnumber;
		}	
		static void multmethod(double firstnumber,double secondnumber) {
			result=firstnumber*secondnumber;
			
		}
		static void divmethod(double firstnumber,double secondnumber) {
			if(secondnumber!=0.0) {
			result=firstnumber/secondnumber;
			}
			if(secondnumber==0.0) {
				result=-1;
				System.out.println("can't div on zero");
			}
			}
	   static void sqrtmethod(double firstnumber) {
		   if (firstnumber <0) {
			   result=-1;
		   }
		   if (firstnumber >=0) {
				result=Math.sqrt(firstnumber);

		   }

				
			}
	   static void modmethod(double firstnumber,double secondnumber) {
				result=firstnumber%secondnumber;
				
			}
			
			
		
	
 public static double getx() {
	 return result;
 }

}