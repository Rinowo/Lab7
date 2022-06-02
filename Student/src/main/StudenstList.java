package main;

import java.util.*;

public class StudenstList {
    private ArrayList<Student>list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

//    public void insertStudents() {
//        System.out.print("Insert Student ID: "); String id = sc.nextLine();
//        System.out.print("Insert Student Name: "); String name = sc.nextLine();
//        System.out.print("Insert Student DoB: "); int dateOfBirth = sc.nextInt();
//        System.out.print("Insert Student Avg Grade: "); double avgGrade = sc.nextDouble();
//        Student s = new Student(id, name, dateOfBirth, avgGrade);
//        this.addStudent(s);
//    }

    public StudenstList() {
        list.add(new Student("ms1", "Ng Tùng Anh", 1999, 5.0));
        list.add(new Student("ms2", "Ng Hồng Nhung", 2000, 9.5));
        list.add(new Student("ms3", "Ng Phương Anh", 1999, 8.3));
        list.add(new Student("ms4", "Ng Tuấn Anh", 1998, 6.5));
        list.add(new Student("ms5", "Ng Hoàng Quyên", 2000, 4.5));
        list.add(new Student("ms6", "Ng Hoàng Nam", 2000, 8.5));
        list.add(new Student("ms7", "Ng Linh Chi", 2000, 6.5));
        list.add(new Student("ms8", "Ng Hồng Chi", 2000, 5.6));
        list.add(new Student("ms9", "Ng A", 2000, 3.6));
        list.add(new Student("ms10", "Ng B", 2000, 2.6));
        list.add(new Student("ms11", "Ng C", 2000, 1.6));
        list.add(new Student("ms12", "Ng D", 2000, 6.7));
        list.add(new Student("ms13", "Ng E", 2000, 7.8));
        list.add(new Student("ms14", "Ng F", 2000, 8.9));
        list.add(new Student("ms15", "Ng G", 2000, 4.0));
        list.add(new Student("ms16", "Ng H", 2000, 5.6));
        list.add(new Student("ms17", "Ng J", 2000, 3.6));
        list.add(new Student("ms18", "Ng K", 2000, 9.6));
        list.add(new Student("ms19", "Ng L", 2000, 2.6));
        list.add(new Student("ms20", "Ng M", 2000, 1.2));
    }

    public void addStudent(Student s) {
        this.list.add(s);
    }

    //foreach
    public void printStudentList() {
        for (Student student :
                list) {
            System.out.println(student);
        }
    }

    //for
//    public void printFor() {
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }

    //iterator
//    public void printIterator() {
//        Iterator<Student> studentIterator = list.iterator();
//        while (studentIterator.hasNext()){
//            Student student = studentIterator.next();
//            System.out.println(student);
//        }
//    }

    public boolean checkListEmptyOrNot() {
       return this.list.isEmpty();
    }

    public int countStudentInTheList() {
        return this.list.size();
    }

    public void deleteAllStudent() {
        this.list.removeAll(list);
    }

    public boolean deleteByID(Student s) {
        return this.list.remove(s);
    }

    public boolean findStudentWithID(Student s) {
        return this.list.contains(s);
    }

    public boolean deleteStudentWithID(Student s) {
        return this.list.remove(s);
    }

    public void findStudentWithName(String name) {
        for (Student student:
             list) {
            if (student.getName().indexOf(name) >= 0) {
                System.out.println(student);
            }
        }
    }

    public void sortStudentHighToLowGrade() {
        Collections.sort(this.list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAvgGrade() > o2.getAvgGrade()) {
                    return -1;
                }
                else if (o1.getAvgGrade() < o2.getAvgGrade()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
}
