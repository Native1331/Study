package Lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject1 {
    public static void main(String[] args) {
        PersonAll[] people = {new PersonAll(1, "Bob"), new PersonAll(2, "Mike"),
                new PersonAll(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

    /* вар1.        oos.writeInt(people.length);

            for (PersonAll person : people) {
                oos.writeObject(person);
            }*/

            oos.writeObject(people);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
