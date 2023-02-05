
class Animal1{
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
class OtherAnimal extends Animal{
    public void eat() {
        System.out.println("Other animal is eating...");
    }
}
interface AbleToEat{
    public void eat();
}
public class Lesson35 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating...");
                AbleToEat ableToEat = new AbleToEat() {
                    @Override
                    public void eat() {
                        System.out.println("Someone is eating...");
                    }
                };
                ableToEat.eat();
        /*class OtherAnimal extends Animal{
    public void eat() {
        System.out.println("Other animal is eating...");
        }
}

OtherAnimal otherAnimal=new OtherAnimal();
otherAnimal.eat();
    }
}*/
            }
        };
    }
}
