package Triangle;

import java.util.*;

public class Triangles {
	// Instance members
	private int side1, side2, side3;

	public Triangles() {
		// TODO Auto-generated constructor stub
	}

	// getter setter
	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	// return true if traingle is equilateral
	boolean isEquilateral(int side1, int side2, int side3) {
		boolean yes = true;
		boolean no = false;
		if ((side1 == side2) && (side2 == side3)) {
			return yes;
		} else {
			return no;
		}
	}

	// return true if traingle is isScalene
	boolean isScalene(int side1, int side2, int side3) {
		boolean yes = true;
		boolean no = false;
		if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
			return yes;
		} else {
			return no;
		}
	}

	// return true if traingle is isIsoceles
	boolean isIsosceles(int side1, int side2, int side3) {
		boolean yes = true;
		boolean no = false;
		if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
			return yes;
		} else {
			return no;
		}
	}

	// return true if traingle is Right angle
	boolean isRight(int side1, int side2, int side3) {
		boolean yes = true;
		boolean no = false;
		if ((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2)) {
			return yes;
		}
		if ((Math.pow(side2, 2) + Math.pow(side3, 2)) == Math.pow(side1, 2)) {
			return yes;
		}
		if ((Math.pow(side1, 2) + Math.pow(side3, 2)) == Math.pow(side2, 2)) {
			return yes;
		} else {
			return no;
		}
	}

}
