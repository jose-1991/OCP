package examtopicTest;

public class Question34<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Question34<String> type = new Question34<>();
        Question34 type1 = new Question34();
        type.setT("Java");
        type1.setT(100);
        System.out.println(type.getT()+" "+type1.getT());
    }
}
