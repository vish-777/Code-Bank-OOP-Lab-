package com.course.buildings;
import java.util.Scanner;
public class Building
{
	protected int sqf;
	protected int sto;
	Building(int a,int b)
	{
		sqf=a;
		sto=b;
	}
	public int retsqf()
	{return sqf;}
	public int retsto()
	{return sto;}
}

