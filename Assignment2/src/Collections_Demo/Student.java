package Collections_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

	private int id;
	private int age;
	private String name;
	private String dateOfJoining;		
	
	public Student(int id, String name, int age, String dateOfJoining) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.dateOfJoining = dateOfJoining;
	}
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDateOfJoining() {
            return dateOfJoining;
        }
        
        public static void main(String[] args) {
            Student student1 = new Student(1, "Deepak", 25, "1999-01-01");
            Student student2 = new Student(2, "Sonali", 22, "2002-12-15");
            Student student3 = new Student(3, "Bhoomi", 21, "1998-02-10");
            Student student4 = new Student(4, "Yash", 26, "1995-02-10");

            List<Student> studentList = new ArrayList<>();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            
            Collections.sort(studentList, new NameComparator());

            System.out.println("Student Details:");
            for (Student student : studentList) {
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Date of Joining: " + student.getDateOfJoining());
                System.out.println("-----------------------------");
            }
        }

}
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
