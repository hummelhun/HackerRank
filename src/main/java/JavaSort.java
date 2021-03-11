import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return this.getId()-o.getId();
    }
}


//Complete the code
public class JavaSort {
    public static void main(String[] args){

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));


        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed()
                                                .thenComparing(Student::getFname)
                                                .thenComparing(Student::getId));

        studentList.sort(Comparator.comparing(Student::getCgpa).reversed()
                                   .thenComparing(Student::getFname)
                                   .thenComparing(Student::getId));


        System.out.println(studentList.stream().filter(p->p.getCgpa()>3.7).map(p->p.getFname()).collect(Collectors.toList()));



        System.out.println(studentList.stream().filter(p->p.getCgpa()>3.7).map(p->p.getId()).collect(Collectors.toList()));
        System.out.println(studentList.stream().filter(p->p.getCgpa()>3.7).filter(p->p.getFname().startsWith("S")).map(p->p.getFname()).collect(Collectors.toList()));

        List<String> studentsL = studentList.stream()
                                            .filter(student -> student.getCgpa()>3.75)
                                            .filter(student -> student.getFname().startsWith("A"))
                                            .map(student -> student.getFname())
                                            .collect(Collectors.toList());



        System.out.println("_______________-");
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

