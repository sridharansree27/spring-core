package com.app.mod;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Sum implements Solve {

	private float a,b;

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
	
	public float sum() {
		return a+b;
	}

    public Sum() {
    	super();
		this.a = 99;
		this.b = 9;
	}

//	public Sum(float a, float b) {
//		super();
//		this.a = a;
//		this.b = b;
//	}

	@Override
	public String toString() {
		return "Sum=[" + sum() + "]";
	}
}