package apiStream;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamInfinitoGenerate {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger();

        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return contador.incrementAndGet();
        })
                .limit(7)
                .forEach(System.out::println);

        System.out.println(contador);
    }
}
