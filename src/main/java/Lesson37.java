import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"Users"+ separator+ "Natalya.Kadysheva"+ separator + "Desktop" + separator + "новый";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String [] numbers=line.split(" ");
        // Если точка String [] numbers=line.split("//. ");
        System.out.println(Arrays.toString(numbers));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}

