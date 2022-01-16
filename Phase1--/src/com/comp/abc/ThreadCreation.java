package com.comp.abc;

public class ThreadCreation extends Thread {

	public static void main(String[] args) {
		
		ThreadCreation tc = new ThreadCreation();
		tc.start();
	}
	public void run()
	{
		String str="THREAD";
		System.out.println("Run present in the threads: "+str);
	}

}
