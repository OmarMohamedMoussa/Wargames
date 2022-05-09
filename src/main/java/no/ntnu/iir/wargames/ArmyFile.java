package no.ntnu.iir.wargames;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.Buffer;
import java.nio.file.Path;
import java.util.List;

public class ArmyFile {
    public static void main(String[] args) throws URISyntaxException, IOException {
        fileReader("suicide squad");
    }

    //eg må splitte noke her
    public static void fileReader(String armyName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader( armyName + ".csv"))){
            String line;
            while ((line= reader.readLine()) !=null) {
                String[] unitAsSplitString = line.split(",");
                if (unitAsSplitString.length > 1){
                    System.out.println(unitAsSplitString[1]);
                } else {
                    System.out.println("The armys name is : " + unitAsSplitString[0]);
                }
            }

        } catch (IOException e) {
            throw e;
        }

    }

    public static void fileWriter(Army army) throws IOException {
        List<Unit> units = army.getAllUnits();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(army.getArmyName()+ ".csv"))){
            writer.write(army.getArmyName());
            writer.newLine();
            for (Unit unit : units){
                String lineToBeWritten = unit.getClass().getSimpleName()+ "," + unit.getName() + "," + unit.getHealth();
                writer.write(lineToBeWritten);
                writer.newLine();
            }


            } catch (IOException e) {
            throw e;
        }
    }

    private void test() throws IOException {
        File file = new File("suicide squad.csv");

        if (!file.isFile()){
            file.createNewFile();
        }

        System.out.println(file.isFile());

        fileReader("warSquad");
    }

    private static void testFileWritting() throws IOException {
        Army army = new Army("suicide squad");
        army.add(new CavalryUnit("Steinar",20,8,2));
        army.add(new CommanderUnit("Omar",30,4,3));
        army.add(new InfantryUnit("Lars", 39));
        army.add(new RangedUnit("Eduard",20));

        fileWriter(army);
    }

}
