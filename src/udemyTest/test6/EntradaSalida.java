package udemyTest.test6;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person implements Serializable {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

}
public class EntradaSalida {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stud = new Student("John", 20, "Computer Science");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\stud.ser")));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\stud.ser")))
        {
            oos.writeObject(stud);

            Student s = (Student) ois.readObject();
            System.out.printf("%s, %d, %s", s.getName(), s.getAge(), s.getCourse());
        }
    }
}
