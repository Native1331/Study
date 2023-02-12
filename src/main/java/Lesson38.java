import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


    public class Lesson38 {
        public static void main(String[] args) {
          //  String separator = File.separator;
          //  String path = separator+"Users"+ separator+ "Natalya.Kadysheva"+ separator + "Desktop" + separator + "новый";
            File file = new File("asd");
            //Если файл в проекте, тогда оставляем только File file = new File(имя файла);

            try (Scanner scanner = new Scanner(file)) {
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

