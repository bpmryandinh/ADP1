import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {
            String line = scan.nextLine();

            System.out.println(line);
        }


        scan.close();
    }
    
}
