package Lesson47;

public class Test {
    private static final int Dog=0;
    private static final int Cat=1;
    private static final int Frog=2;


    public static void main(String[] args) {
        int animal = 100;

        switch (animal) {
            case Dog:
                System.out.println("It s a dog");
                break;
            case Cat:
                System.out.println("It s a cat");
                break;
            case Frog:
                System.out.println("It s a frog");
                break;
            default:
                System.out.println("Its not an animal");
        }
    }
}
