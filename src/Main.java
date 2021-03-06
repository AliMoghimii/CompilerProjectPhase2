import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("src\\TestCases.txt");
        FileReader f1 = new FileReader(file);
        DecafScanner scanner = new DecafScanner(f1);

        parser decafParser = new parser(scanner);

        try {

            decafParser.parse();
            System.out.println("OK");
        }
        catch (Exception e){
            System.out.println("Syntax Error");
        }

    }
}
