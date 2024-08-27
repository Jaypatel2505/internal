package com.oops;
/*
 * Constructor : It's a special member function, Which is initialized automatically
 * - Same name as class name
 * - It has no return type
 * - It's automatically invoked whenever the object is created
 * 
 * Type of Constructor:
 * 1. Default Constructor(Without parameter)
 * 2. Parameterized Constructor(With Parameter)
 * 3. Copy Constructor(Object as a parameter) / Clone a object
 * 
 */
class VolumeOfBox{
	double lenght, width, height;
	
	// Default Constructor
	public VolumeOfBox() {
		System.out.println("In Default Constructor");
		lenght = 1;
		width = 2;
		height = 3;
	}
	
	//Parameterized Constructor
	public VolumeOfBox(double l, double w, double h) {
		System.out.println("In Parameterized Constructor");
		lenght = l;
		width = w;
		height = h;
	}
	
	// Copy Constructor || Clone a Object
	public VolumeOfBox(VolumeOfBox vob) {
		System.out.println("In Copy Constructor");
		lenght = vob.lenght;
		width = vob.width;
		height = vob.height;
	}
	
	// Show box volume
	public void volume() {
		System.out.println("Volume of box is : "+(lenght*width*height));
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		VolumeOfBox dc = new VolumeOfBox();
		dc.volume();
		
		VolumeOfBox pc = new VolumeOfBox(10, 20, 30);
		pc.volume();
		
		VolumeOfBox cc = new VolumeOfBox(dc);
		cc.volume();
	}
}
