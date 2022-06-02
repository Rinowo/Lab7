package test;

import main.Menu;
import main.StudenstList;
import main.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudenstList studentlist = new StudenstList();
        int choose;

        do {
            Menu.mainMenu();
            choose = sc.nextInt();
            sc.nextLine();
            // if else
            if(choose == 1) {
                System.out.print("Insert Student ID: "); String id = sc.nextLine();
                System.out.print("Insert Student Name: "); String name = sc.nextLine();
                System.out.print("Insert Student DoB: "); int dateOfBirth = sc.nextInt();
                System.out.print("Insert Student Avg Grade: "); double avgGrade = sc.nextDouble();
                Student s = new Student(id, name, dateOfBirth, avgGrade);
                studentlist.addStudent(s);

            }
            else if (choose == 2){
                studentlist.printStudentList();
            }
            else if (choose == 3){
                System.out.println("Student List: " + studentlist.checkListEmptyOrNot());
            }
            else if (choose == 4){
                System.out.println("Number of student: " + studentlist.countStudentInTheList());
            }
            else if (choose == 5){
                studentlist.deleteAllStudent();
                System.out.println("Delete all students");
            }
            else if (choose == 6){
                System.out.println("Insert Student ID: "); String id = sc.nextLine();
                Student s = new Student(id);
                System.out.println("Check student in the list: " + studentlist.findStudentWithID(s));
            }
            else if (choose == 7){
                System.out.println("Insert Student ID: "); String id = sc.nextLine();
                Student s = new Student(id);
                System.out.println("Delete Student in the list" + studentlist.deleteStudentWithID(s));
            }
            else if (choose == 8){
                System.out.println("Insert Student Name: "); String name = sc.nextLine();
                System.out.println();
                studentlist.findStudentWithName(name);
            }
            else if (choose == 9){
                studentlist.sortStudentHighToLowGrade();
                studentlist.printStudentList();
            }
            else if (choose == 10){
                System.out.println("Insert Student ID: "); String id = sc.nextLine();
                Student s = new Student(id);
                studentlist.deleteByID((s));
            }

            // Switch case
//            switch (choose) {
//                case 1:
//                    studentlist.insertStudents();
//                    break;
//                case 2:
//                    studentlist.printStudentList();
//                    break;
//                case 3:
//                    System.out.println("Student List: " + studentlist.checkListEmptyOrNot());
//                    break;
//                case 4:
//                    System.out.println("Number of student: " + studentlist.countStudentInTheList());
//                    break;
//                case 5:
//                    studentlist.deleteAllStudent();
//                    System.out.println("Delete all students");
//                    break;
//                case 6:
//                    System.out.println("Insert Student ID: "); String id = sc.nextLine();
//                    Student s = new Student(id);
//                    System.out.println("Check student in the list: " + studentlist.findStudentWithID(s));
//                    break;
//                case 7:
//                    System.out.println("Insert Student ID: "); String id = sc.nextLine();
//                    Student s = new Student(id);
//                    System.out.println("Delete Student in the list" + studentlist.deleteStudentWithID(s));
//                    break;
//                case 8:
//                    System.out.println("Insert Student Name: "); String name = sc.nextLine();
//                    System.out.println("");
//                    studentlist.findStudentWithName(name);
//                    break;
//                case 9:
//                    studentlist.sortStudentHighToLowGrade();
//                    studentlist.printStudentList();
//                    break;
//            }
        }while (choose != 0);
    }
}
