
package Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Mimmer
 */
public class fileManager {

    public static void main(String[] args) {

        String fileName = "borgerliste.txt";

        File file = new File(fileName);
        PrintWriter pw = null;
        String[] borgere = {"Hans Hansen:", "Line Petersen:", "Allan Nymark:"};

        try {
            FileWriter fw = new FileWriter(fileName, false);
            pw = new PrintWriter(fw);

            for (int i = 0; i < borgere.length; i++) {
                fw.append(borgere[i]);

            }
            System.out.println("File created succesfully.");
            fw.close();

        } catch (IOException ex) {
            System.out.println("Input/Output exception caught.");
        }

    }

}
