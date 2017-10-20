import java.util.*;

public class StudentList {
	
	private Student[] list;
	
	public StudentList() {
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		String last, first;
		int grade;
		double gpa;
		System.out.print("How many students? ");
		numStudents = scnr.nextInt();
		System.out.println();
		list = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println();
			System.out.println("STUDENT " + i + "...");
			System.out.print("First Name: ");
			first = scnr.nextLine();
			System.out.print("Last Name: ");
			last = scnr.nextLine();
			System.out.print("Grade Level: ");
			grade = scnr.nextInt();
			System.out.print("GPA: ");
			gpa = scnr.nextDouble();
			list[i] = new Student(first, last, grade, gpa);
		}
		scnr.close();
	}
	
	public String toString() {
		String outString = "";
		for (Student stu : list) {
			outString += stu.toString() + "\n";
		}
		outString += "\n";
		return outString;
	}
	
	public void bubbleSort() {
		int size = list.length;
		String tempLast;
		String tempFirst;
		int tempGrade;
		double tempGPA;
		for(int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(list[j].getLastName().compareTo(list[j + 1].getLastName()) > 0) {
					tempLast = list[j].getLastName();
					tempFirst = list[j].getFirstName();
					tempGrade = list[j].getGradeLevel();
					tempGPA = list[j].getGPA();
					list[j].setLastName(list[j+1].getLastName());
					list[j].setFirstName(list[j+1].getFirstName());
					list[j].setGradeLevel(list[j+1].getGradeLevel());
					list[j].setGPA(list[j+1].getGPA());
					list[j+1].setLastName(tempLast);
					list[j+1].setFirstName(tempFirst);
					list[j+1].setGradeLevel(tempGrade);
					list[j+1].setGPA(tempGPA);
				}
			}
		}
	}

}