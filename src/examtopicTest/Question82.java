package examtopicTest;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Question82 {
    public static void main(String[] args) {
        ZonedDateTime depart = ZonedDateTime.of
                (2015,1,15,3,0,0,0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of
                (2015,1,15,9,0,0,0,ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart,arrive);
        System.out.println("Travel time is: "+hrs+"hrs");

        System.out.println("============= #83 ============");
        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log");
        Path path2 = Paths.get("/server/sys/");
        Path res2 = path1.resolve("/readme/");
        System.out.print(res1);
        System.out.println(res2);

        System.out.println("============= #86 ============");

        Path p1 = Paths.get("/software/././sys/readme.txt");
        Path p2 = p1.normalize();
        Path p3 = p2.relativize(p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.print(p1.getNameCount());
        System.out.print(":" + p2.getNameCount());
        System.out.print(":" + p3.getNameCount());

    }
}
