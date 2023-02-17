package Lesson47;

public class Test3 {
    //Полезные методы в перечислении
    public static void main(String[] args) {
  //      Season season=Season.AUTUMN;
  //      Animal animal=Animal.Cat;
  //      System.out.println(season.name());//возвращает имя текущей константы, как задекларирован в самом энаме
   //     System.out.println(animal.name());

        Animal frog = Animal.valueOf("Frog"); //из строки получить энам
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());//получить индекс энама
    }
}
