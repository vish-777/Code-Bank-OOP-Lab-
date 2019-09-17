import java.util.Scanner;
import com.course.buildings.Building;
import com.course.buildings.House;
import com.course.buildings.School;
class buildingtest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		House h;
		School s;
		System.out.print("Enter house details:\nEnter number of bedrooms:");
		int c=in.nextInt();
		System.out.print("Enter number of baths:");
		int d=in.nextInt();
		System.out.print("Enter square footage:");
		int a=in.nextInt();
		System.out.print("Enter number of stories:");
		int b=in.nextInt();
		h=new House(a,b,c,d);
		System.out.print("\nEnter school details:\nEnter number of classrooms:");
		c=in.nextInt();
		System.out.print("Enter grade level:");
		d=in.nextInt();
		System.out.print("Enter square footage:");
		a=in.nextInt();
		System.out.print("Enter number of stories:");
		b=in.nextInt();
		s=new School(a,b,c,d);
		System.out.println("\nHouse Details:\nNumber of bedrooms: "+h.retnob()+"\nNumber of baths: "+h.retbaths()+"\nSquare Footage: "+h.retsqf()+"\nNumber of stories: "+h.retsto()+"\n\nSchool Details:\nNumber of classrooms: "+s.retnoc()+"\nGrade level: "+s.retgl()+"\nSquare Footage: "+s.retsqf()+"\nNumber of stories: "+s.retsto());
	}
}
