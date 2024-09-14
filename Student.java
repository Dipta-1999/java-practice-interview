import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student implements Comparable<Student>
{
    public static int ArrayList;
    int age;
    String name;
    Student(int age, String name)
    {
        this.age= age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }   
    public String toString()
    {
        return "Student : age = "+age+" name = "+name;
        
    } 
}
class AgeSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Comparator<Student> com = (Student i, Student j) -> (i.age > j.age)?1:-1;
        List<Student> studs = new ArrayList<>();
        //studs.add(new Student(sc.nextInt(), sc.next()));
        System.out.println("let's start");
        while (true) {
            System.out.print("Type age:");
            int age=sc.nextInt();
            System.out.print("Type name:");
            String name=sc.next();
            if(age==0 || name.equalsIgnoreCase("quit"))
            {
                break;
            }
            studs.add(new Student(age, name));
        }
        System.out.println("Before Sort");
        for(Student st : studs)
            System.out.println(st);

        System.out.println("After Sort");
        Collections.sort(studs);
        for(Student st : studs)
            System.out.println(st);

    }
}
