package hw2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Quadratic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x1,x2,higher,lower;
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		String form = keyboard.next();
		DecimalFormat df = new DecimalFormat(form);
		if(a==0){
			System.out.print("a=0");
			return;
		}
		x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		higher = (x1>x2)?x1:x2;
		lower = (x1>x2)?x2:x1;
		if(a>0){
			System.out.println(df.format(higher));
			System.out.print(df.format(lower));
		}else{
			System.out.println(df.format(lower));
			System.out.print(df.format(higher));
		}
	}

}
