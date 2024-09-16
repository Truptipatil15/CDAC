package com.java.assignment5;

public class InstanceCounter {
	 
	private static int count=0;
	
	static {
		count=0;
	}
	
	public InstanceCounter(){
		count++;
	}
	
	public static int getInstanceCount() {
		return count;
	}
	
	public String toString() {
		return "InstanceCounter object: " + count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceCounter ic=new InstanceCounter();
		System.out.println(ic);
		
		InstanceCounter ic2 = new InstanceCounter();
        System.out.println(ic2);

        InstanceCounter ic3 = new InstanceCounter();
        System.out.println(ic3);
        System.out.println("...................................");
        System.out.println("Total Instance Created: "+InstanceCounter.getInstanceCount());
	}

}
