import java.nio.file.Files;
import java.nio.file.Paths;
    
public class Simple {
    public static void main(String[] args) throws Exception {
        System.out.println("\n Безопасный просмотр файлов txt \n Введите путь к файлу без кавычек");
        String p = new java.util.Scanner(System.in).nextLine();
        System.out.println("\n");
        System.out.println(new String(Files.readAllBytes(Paths.get(p))));
    }
}