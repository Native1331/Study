package Lesson45;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject1 {
    public static void main(String[] args) {
           try{
               FileInputStream fis = new FileInputStream("people.bin");
               ObjectInputStream ois = new ObjectInputStream(fis);

               PersonAll[]people = (PersonAll[]) ois.readObject();

       /*вар1        int personCount = ois.readInt();
                PersonAll[] people = new PersonAll[personCount];
               for (int i = 0; i<personCount; i++){
                   people[i]=(PersonAll) ois.readObject();
               }*/

               System.out.println(Arrays.toString(people));

        //            ois.readObject();

                    ois.close();

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

}