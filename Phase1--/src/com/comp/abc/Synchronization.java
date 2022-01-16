package com.comp.abc;

public class Synchronization {

	public static void main(String[] args) {
		Drive d = new Drive();
        Road r = new Road(d);
        r.setName("Poorva");
		r.start();
		
	}

}
		class Drive 
		{
		synchronized public static void getDrive()                     
			{
		   System.out.println(" name :"+Thread.currentThread().getName());  
           System.out.println(" state :"+ Thread.currentThread().getName());  
		  }
			
		}
		class Road extends Thread
		{
			Drive car;
            Road(Drive cars)
			{
				this.car = cars;
			}

			@Override
			public void run()
			{
				Drive.getDrive();
			}
		}
		class airways extends Thread
		{
		  Drive plane;
		  airways(Drive planes)
		    {
		        this.plane = planes;
		    }
		  
		  
		}
		
				
				
		


