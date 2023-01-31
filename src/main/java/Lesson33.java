import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args) {
        /////////////////Java 5///////////
        List animals = new ArrayList();
        Animal ourAnimal=new Animal();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");
        animals.add(ourAnimal);

        String animal =(String) animals.get(1);
        System.out.println(animal);

        ////////////С появлением Generics///////////
        List<String> animals2=new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");//1
        animals2.add("frog");
        String animal2=animals2.get(1);

        ///////////////С появлением Java7///////////
        List<String> animals3=new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");//1
        animals3.add("frog");
        //animals3.add(ourAnimal);
        String animal3=animals3.get(1);



    }
}
