package com.app.mod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Diff implements Solve {

	@Autowired
	private Sum sum;

	private float a,b;

	public Sum getSum() {
		return sum;
	}

	public void setSum(Sum sum) {
		this.sum = sum;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float diff() {
		return sum.getA()-sum.getB();
	}

//	public diff(float a, float b) {
//		super();
//		this.a = a;
//		this.b = b;
//	}

	@Override
	public String toString() {
		return "Diff=[" + diff() + "]";
	}
}
