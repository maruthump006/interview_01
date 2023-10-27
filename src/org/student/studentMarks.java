package org.student;

import java.util.Scanner;

public class studentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Student Id
		System.out.println("Enter the STUDENT ID : ");
		int StudentId = sc.nextInt();
		sc.nextLine();
		// Student Name
		System.out.println("ENTER THE STUDENT NAME :");
		String StudentName = sc.nextLine();
		// MARK 1
		System.out.println("ENTER THE MARK 1 :");
		int Mark_1 = sc.nextInt();
		// MARK 2
		System.out.println("ENTER THE MARK 2 :");
		int Mark_2 = sc.nextInt();
		// MARK 1
		System.out.println("ENTER THE MARK 3 :");
		int Mark_3 = sc.nextInt();
		// MARK 1
		System.out.println("ENTER THE MARK 4 :");
		int Mark_4 = sc.nextInt();
		// MARK 2
		System.out.println("ENTER THE MARK 5 :");
		int Mark_5 = sc.nextInt();
		//Calculate average in marks
		int total = Mark_1+Mark_2+Mark_3+Mark_4+Mark_5;
		double Average = (double) total/5; 
		//Store in the variables
		String studentDetails ="STUDENT ID :" +StudentId+ "\nSTUDENT NAME :"+StudentName;
		String result ="TOTAL MARKS : "+total+"\nAVERAGE : "+Average;
		
		//output the store values
		System.out.println(studentDetails);
		System.out.println(result);
		//close scanner
		sc.close();

	}

}
