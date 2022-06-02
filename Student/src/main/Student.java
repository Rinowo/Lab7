package main;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int dateOfBirth;
    private double avgGrade;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, int dateOfBirth, double avgGrade) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.avgGrade = avgGrade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id: '" + id + '\'' +
                ", Name: '" + name + '\'' +
                ", Date Of Birth: " + dateOfBirth +
                ", Average Grade: " + avgGrade +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return Objects.equals(id, other.id);
    }
}
