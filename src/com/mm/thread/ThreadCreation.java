package com.mm.thread;

public class ThreadCreation extends Thread {
	public void run() {
		System.out.println("Thread Started...........");
	}
	
	public static void main(String[] args) {
			ThreadCreation creation = new ThreadCreation();
			new Thread(creation).start();
	}

}
