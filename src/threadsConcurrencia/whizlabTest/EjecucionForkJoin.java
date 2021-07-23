package threadsConcurrencia.whizlabTest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class EjecucionForkJoin {
    public static void main(String[] args){
        int[] a = new int[15000];
        for (int x=0;x<15000;x++){
            a[x] = 1;
        }

        Sum s = new Sum(a,0,a.length);
        System.out.println(Sum.sumArray(a));
    }
}

class Sum extends RecursiveTask<Long>{

    static final int MAX = 5000;

    int low;
    int high;
    int[] array;

    Sum(int[] arr, int lo, int hi){
        array = arr;
        low=lo;
        high=hi;
    }


    @Override
    protected Long compute() {
        if (high-low <=MAX){
            long sum = 0;
            for (int i =low;i<high;++i)
            sum+=array[i];
            return sum;
        }else{
            int mid = low + (high-low)/2;
            Sum left = new Sum(array,low,mid);
            Sum right = new Sum(array,mid,high);
            left.fork();
            long rightAns = right.compute();
            long leftAns = left.join();
            return leftAns+rightAns;
        }

    }
    static long sumArray(int[] array){
        ForkJoinPool fpool = new ForkJoinPool();
        long sum = fpool.invoke(new Sum(array,0,array.length));

        return sum;

    }
}