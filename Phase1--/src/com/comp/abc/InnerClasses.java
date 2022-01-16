package com.comp.abc;

public class InnerClasses {

	public static void main(String[] args) {
		new Out().new In().in();
		
	}

}
class Out{
  long someVar;
	int val;
	class In{
		int val;
		void in() {
			int val = 10;
			System.out.println("someVar : " + someVar);//Accessible here
			System.out.println("Inside Inner's in...");
			
			
			
		}
	}
	
	void met() {
		In in = new In();
		in.in();
	}
}


