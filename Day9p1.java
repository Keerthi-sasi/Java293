
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Day9p1 {

    public static void main(String[] args) {
        File file = new File("Keerthi.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            FileWriter writer = new FileWriter("Keerthi.txt");
            writer.write("Welcome");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());

        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File not found");
        }

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not exists");
        }
    }
}
