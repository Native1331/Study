package Lesson47;

public enum Animal {
    Dog("Собака"), Cat("Кошка"), Frog("Лягушка");
    //new Dog("собака)
    private String translation;

     Animal(String translation){
        this.translation = translation;
    }
    public String getTranslation(){
         return translation;
    }
    public String toString(){
         return "Перевод на русский язык" +" " +translation;
    }
}
