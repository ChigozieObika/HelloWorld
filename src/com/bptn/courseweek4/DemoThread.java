package com.bptn.courseweek4;

class Team4 extends Thread {

	String name;

	public Team4( String name ) {
		super();
		this.name = name;
	}


	@Override
	public void run() {

		System.out.println( "Running: " + this.name + " " + this.getState() );

		try {
			for ( int i = 10; i > 0; i-- ) {
				System.out.println( i + " squared = " + i*i + " " + this.name );
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println( "Exiting: " + this.name );
		
	}

}

public class DemoThread {

	public static void main(String[] args) throws InterruptedException {


		Team4 t1 = new Team4( "T-1" );
		t1.run(); 

		Team4 t2 = new Team4( "T-2" );
		t2.run(); 
		
//		t2.join();
//		t2.start();
		
		
	}

}
