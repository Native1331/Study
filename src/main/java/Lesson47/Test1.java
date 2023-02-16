package Lesson47;


import static Lesson47.Animal.Cat;

public class Test1 {
    public static void main(String[] args) {


        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER:
                System.out.println("Its warm outside");
                break;
            case WINTER:
                System.out.println("Its cold outside");
                break;
        }

    }
}
