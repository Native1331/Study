package Lesson47;


import static Lesson47.Animal.Cat;

public class Test1 {
    public static void main(String[] args) {
 //       Animal animal= Animal.Cat;
   //     System.out.println(animal);

  //      Season season = Season.SUMMER;

     /*   switch (season) {
            case SUMMER:
                System.out.println("Its warm outside");
                break;
            case WINTER:
                System.out.println("Its cold outside");
                break;
        }*/
 //       System.out.println(season.getClass());
        Season season=Season.WINTER;
        System.out.println(season.getTemperature());
    }
}
