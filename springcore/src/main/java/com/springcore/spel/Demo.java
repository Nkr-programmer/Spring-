package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	public static int g=55;
	
	
	@Value("#{0-3+2}")
	private int x;
	@Value("#{5-3+2}")
	private int y;
	
	////for static methods
//	@Value("#{T(java.lang.Math).sqrt({T(com.springcore.spel.Demo).g})}")
	@Value("#{T(java.lang.Math).sqrt(25)}")// both will work
	private double z;
	////for static variables
	@Value("#{T(com.springcore.spel.Demo).g}")
	private double pi;
	////for creating objects
	@Value("#{new String('mik')}")// both will work
//	@Value("#{new java.lang.String('mik')}")
	private String t;
	////for boolean
	@Value("#{8>3}")
//	@Value("#{true}")// both will work
	private boolean isactive;
	
	
	
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", t=" + t + ", isactive=" + isactive + "]";
	}


	
}
