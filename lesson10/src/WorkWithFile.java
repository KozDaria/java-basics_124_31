import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class WorkWithFile {
    static File file = new File("out\\production\\lesson10\\file1.txt");
    static File file2 = new File("out\\production\\lesson10\\file2.txt");
    static File file3 = new File("out\\production\\lesson10\\file3.txt");

    public static List<String> readFileMethod(File file) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
        list.removeIf(String::isEmpty);
        return list;
    }

    public static void writeFileMethod(File file, String addingString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.newLine();
            writer.write(addingString);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }

    public static void writeFileMethodClean(File file, String addingString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.newLine();
            writer.write(addingString);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }

    public static void concatFiles(File file1, File file2, File file3) {
        List<String> list1 = readFileMethod(file1);
        List<String> list2 = readFileMethod(file2);

        for (String line : list1) {
            writeFileMethod(file3, line);
        }
        for (String line : list2) {
            writeFileMethod(file3, line);
        }
    }

    private static void changerString(File file) {
        List<String> list;
        List<String> listReplaced = new ArrayList<>();
        list = readFileMethod(file);
        for (String line : list) {
            listReplaced.add(line.replaceAll("[^A-Za-zА-Яа-я0-9]", Matcher.quoteReplacement("$")));
        }
        writeFileMethodClean(file3, listReplaced.get(0));
        for (String line : listReplaced) {
            writeFileMethod(file3, line);
        }
    }

    public static void main(String[] args) {
        System.out.println(readFileMethod(file));
        writeFileMethod(file, "Attention!");
        System.out.println(readFileMethod(file));
        concatFiles(file, file2, file3);
        System.out.println(readFileMethod(file3));
        changerString(file3);
    }
}
