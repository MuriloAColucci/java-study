import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Murilo\\Desktop\\test.txt";
        String textContent = """
                I like pizza!
                It's really good!
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        } catch (IOException e){
            System.out.println("Could not write file");
        }

    }
}
