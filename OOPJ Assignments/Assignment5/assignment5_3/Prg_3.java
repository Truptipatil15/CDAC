package org.java.assignment5_3;

public class Prg_3 {

	public static void main(String[] args) {
	Animal a=new Animal("Rex");
	a.eat();
	a.sleep();
	
	//a.bark(); //bark method is in subclass and subclass do not inherited in superclass.
	
	Dog d=new Dog("Rex");
	d.eat();
	d.sleep();
	d.bark();

	}

}
