package javamockExams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Questions {
 public static <T extends Comparable> int count(T[] array, T elem){
     int count = 0;
     for (T e: array){
         if (e.compareTo(elem)>0){
             ++count;
         }
     }return count;
 }

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        int n = Questions.count(a,3);
        System.out.println(n);

        ExecutorService es1 = Executors.newScheduledThreadPool(2);
    }
}
