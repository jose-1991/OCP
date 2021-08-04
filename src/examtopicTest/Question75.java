package examtopicTest;


import java.util.Arrays;

class CheckClass {
    public static int checkValue(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}

public class Question75 {
    public static void main(String[] args) {
        String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
        Arrays.sort(strArray,CheckClass::checkValue);
        for (String s : strArray) {
            System.out.print (s + " ");
        }
    }
}
