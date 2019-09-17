package com.course.buildings;
public class House extends Building
{
	private int nob;
	private int baths;
	public House(int a,int b,int c,int d)
	{
		super(a,b);
		nob=c;
		baths=d;
	}
	public int retnob()
	{return nob;}
	public int retbaths()
	{return baths;}
}
