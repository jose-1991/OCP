package examtopicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students{
    String course, name, city;

    public Students(String name,String course, String city){
        this.name= name;
        this.course=course;
        this.city=city;
    }

    @Override
    public String toString() {
        return course +
                ":" + name +
                ":" + city;

    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
public class Question158 {
    public static void main(String[] args) {
        List<Students> stds = Arrays.asList(
                new Students("Jessy","Java ME", "Chicago"),
                new Students("Helen","Java EE", "Houston"),
                new Students("Mark","Java ME", "Chicago")
        );

        stds.stream()
                .collect(Collectors.groupingBy(Students::getCourse))
                .forEach((src, res)-> System.out.println(src+":"+res));
    }
}
