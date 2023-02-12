import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"Users"+ separator+ "Natalya.Kadysheva"+ separator + "Desktop" + separator + "новый";
        File file = new File(path);
        //Если файл в проекте, тогда оставляем только File file = new File(имя файла);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String [] numbersString=line.split(" ");
        // Если точка String [] numbers=line.split("//. ");
        int[] numbers = new int[3];
        int counter = 0;
        for (String number: numbersString){
            numbers [counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
      /*  while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }*/

        scanner.close();
    }
}

