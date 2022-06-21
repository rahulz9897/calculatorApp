
//31.	Create a class MathOperation with two data member X and Y to store the operand and
//third data member R to store result of operation.
//Create method members
//●	init - to input X and Y from user
//●	add - to add X and Y and store in R
//●	multiply - to multiply X and Y and store in R
//●	power - to calculate X Y and store in R
//●	display- to display Result R

import java.util.Scanner;

public class Mathoperation {
	
	private int X,Y,R;
	
	public void init(int X,int Y)
	{
		this.X=X;
		this.Y=Y;
	}
	public void add()
	{
		R = X + Y;
	}
	public void multiply()
	{
		R = X * Y;
	}
	public void power()
	{
		R = 1;
		while(Y!=0)
		{
			R*=X;
			--Y;
		}
	}
	public void display()
	{
		System.out.println("Result "+R);
	}

	public static void main(String[] args) {
		int n=0;
		Mathoperation m1 = new Mathoperation();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter X and Y");
		int x = s.nextInt();
		int y = s.nextInt();
		m1.init(x, y);
		do{
			System.out.println("Enter Your Choice\n1.Addition 2.Multiplication 3.Power 0.Exit");
			n = s.nextInt();
			switch(n)
			{
			case 0:
				n=0;
				break;
			case 1:
				m1.add();
				m1.display();
				break;
			case 2:
				m1.multiply();
				m1.display();
				break;
			case 3:
				m1.power();
				m1.display();
				break;
				
			default:
				System.out.println("Invalid Input");
			}
		}while(n!=0);
		
	}
}

//Output:-
//Enter X and Y
//5
//4
//Enter Your Choice
//1.Addition 2.Multiplication 3.Power 0.Exit
//1
//Result 9
//Enter Your Choice
//1.Addition 2.Multiplication 3.Power 0.Exit
//2
//Result 20
//Enter Your Choice
//1.Addition 2.Multiplication 3.Power 0.Exit
//3
//Result 625
//Enter Your Choice
//1.Addition 2.Multiplication 3.Power 0.Exit
//0
