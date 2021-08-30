package com.bridgelab;
import java.util.Scanner;

public class SimulateStopwatchProgram {
	
        public static void main(String[] args) {
	        System.out.println("Press key to start stopwatch:-");

	        double start = System.currentTimeMillis();
	        startStopwatch();
	        double end = System.currentTimeMillis();
	        System.out.println("Time: "+(end-start)+" ms");
	    }
	    static void startStopwatch(){
	        Scanner sc = new Scanner(System.in);
	        char a= sc.next().charAt(0);
	        System.out.println("Press key to stop stopwatch :-");
	        char b= sc.next().charAt(0);
	    }
}








