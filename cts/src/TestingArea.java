import java.util.*;
public class TestingArea {
	float s;
	void area(float x) {
		System.out.println("The Area of Square"+(x*x));
	}
	void area(float x,float y) {
		System.out.println("The Area of rectangle"+(x*y));
	}
	void area(float x,float y,float z) {
		System.out.println("The Perimeter of Triangle"+(x+y+z));
	}
	void area(float x,float y,float z,float a) {
		s=(x+y+z+a)/2;
		System.out.println("The Area of quadr"+Math.sqrt((s-x)*(s-y)*(s-z)*(s-a)));
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestingArea x= new TestingArea();
	x.area(4);
	x.area(5,7);
	x.area(5,9,8);
	x.area(4,5,6,7);
	}

}
