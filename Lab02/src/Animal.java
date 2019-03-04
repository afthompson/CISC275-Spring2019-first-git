//Andrew Thompson
//CISC275081 Lab 02
//Due 3/3/2019

public class Animal {
	int numLegs;
	String name;
	Animal(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}
	public int getLegs() {
		return numLegs;
	}
	public String toString() {
		return name+": "+numLegs+" legs";
	}
}
