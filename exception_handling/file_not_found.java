import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class file_not_found {
public static void main(String[] args) {
    try{
        File file = new File("C://file.txt");
        FileReader fr = new FileReader(file);
    }
    catch(FileNotFoundException e){
        System.out.println("File does not exist");
    }
}    
}