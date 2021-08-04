package examtopicTest;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Vehiculo {
    int id;
    String name;

    public Vehiculo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Question116 {
    public static void main(String[] args) throws InterruptedException {
        List<Vehiculo> vehicle = Arrays.asList(
                new Vehiculo(2, "Car"),
                new Vehiculo(3, "Bike"),
                new Vehiculo(1, "Truck")
        );

        vehicle.stream()
                .sorted(Comparator.comparing(v -> v.getId()))
                .forEach(System.out::print);

        System.out.println("\n============= #118 ============");
        Instant loginTime = Instant.now();
        Thread.sleep(1000);

        Instant logoutTime = Instant.now();

        loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
        logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

        if (logoutTime.isAfter(loginTime))
            System.out.println("Logged out at: " + logoutTime);
        else
            System.out.println("Can't logout");

        System.out.println("\n============= #118 ============");

        List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
        Predicate<String> test1 = w -> {
            System.out.println("Checking...");
            return w.equals("do");
        };

        Predicate<String> test2 = (String w) -> w.length() > 3;
        words.stream()
                .filter(test2)
                .filter(test1)
                .count();

    }
}

