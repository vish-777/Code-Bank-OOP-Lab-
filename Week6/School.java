package com.course.buildings;
public class School extends Building
{
	private int noc;
	private int gl;
	public School(int a,int b,int c,int d)
	{
		super(a,b);
		noc=c;
		gl=d;
	}
	public int retnoc()
	{return noc;}
	public int retgl()
	{return gl;}	
}
