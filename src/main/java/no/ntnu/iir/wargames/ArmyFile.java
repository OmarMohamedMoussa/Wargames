package no.ntnu.iir.wargames;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.Buffer;
import java.nio.file.Path;

public class ArmyFile {
    public static void main(String[] args) throws URISyntaxException, IOException {
        File file = new File("warSquad.txt");

        if (!file.isFile()){
            file.createNewFile();
        }

        System.out.println(file.isFile());
        fileReader("warSquad");
    }

    public static void fileReader(String armyName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader( armyName + ".txt"))){
            String line;
            while ((line= reader.readLine()) !=null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw e;
        }

    }

}
