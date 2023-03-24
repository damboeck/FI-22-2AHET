package at.ac.htlstp.damb.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DateiUebung1 {

    public static void main(String[] args) throws IOException {
        File unterverz = new File("data");
        if (!unterverz.exists()) unterverz.mkdirs();

        File file = new File("data/test.txt");
        if (!file.exists()) file.createNewFile();

        if (file.exists()) System.out.println("Datei existiert");
        else               System.out.println("Datei nicht vorhanden!");

        List<String> data = Files.readAllLines(file.toPath());
        for (String line:data) {
            System.out.println(line);
        }

        ArrayList<String> data1 = (ArrayList<String>)data;
        data1.add(0,"Eine neue erste Zeile!");
        data1.add("neue letzte Zeile");

        File newfile = new File("data/test1.txt");
        Files.write(newfile.toPath(), data);
    }
}
