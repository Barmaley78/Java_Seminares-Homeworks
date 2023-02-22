/*Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, 
оно должно записаться в лог-файл.
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class zad5 {
    public static void main(String[] args) {
        String path = ".";
        String logFileName = "log.txt";
        String listFileName = "list.txt";
        try {
            writeToFile(dir(path), listFileName);
        } catch (Exception e) {
            // try {logErrors(logFileName);} catch(Exception log_e){System.out.println(log_e);}
            // System.out.println("При работе программы возникли ошибки.");
            // System.out.printf("Подробный был записан в файл в текущей папке %s", logFileName);

        }
        finally {
            // выполняемые в любом случае действия
        } 
        }

        // private static void logErrors(String l_name) throws IOException {
        //     Logger logger = Logger.getLogger("mkdir");
        //     FileHandler fh = new FileHandler(l_name);
        //     logger.addHandler(fh);
    
        //     SimpleFormatter sFormat = new SimpleFormatter();
        //     fh.setFormatter(sFormat);
    
        //     //logger.setLevel(Level.INFO);
        //     logger.log(Level.WARNING, "Тестовое логирование Warning-lvl");
        //     logger.info("Тестовое логирование INFO-lvl");

    public static void writeToFile(String[] fileStrings, String filePath) throws IOException{
        FileWriter filewriter = new FileWriter(filePath);
        for (String fileString : fileStrings){
            filewriter.write(fileString + "\n");
            filewriter.flush();
        }
        filewriter.close();
    }

    public static String[] dir(String path) {
        File f3 = new File(path); 
        return f3.list();
    }
}