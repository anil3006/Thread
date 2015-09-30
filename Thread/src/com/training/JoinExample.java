package com.training;
import java.io.*;
public class JoinExample {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		// TODO Auto-generated method stub
		Thread t =new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//super.run();
				
				try {
					System.in.read();
				}catch(IOException e) {
					e.printStackTrace();
				}
				System.out.println("Finish reading");
			}
			
		};
		t.start();
		System.out.println("alive:"+t.isAlive());
		try {
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		Thread t2= new Thread();
	//	t2.start();
		System.out.println("Main finished");
		}
		

}
