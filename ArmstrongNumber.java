package imam.practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int takeInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		return number;
	}
	public static void armstrongNumber(int number) {
		int power=0;
		int temp=number;
		while(temp>0) {
			power++;
			temp/=10;
		}
		int temp1=number;
		int val=0;
		while(temp1>0) {
			int rem=temp1%10;
			val=val+(int)Math.pow(rem,power);
			temp1/=10;
		}
		if(number==val) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=takeInput();
		armstrongNumber(number);
	}

}
