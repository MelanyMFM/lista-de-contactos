package javaapplication23;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
public class JavaApplication23 {

    public static void main(String[] args) {
        ventana ventana1 = new ventana();
        ventana1.setVisible(true);
        File file = new File("friendsContact.txt");
        try {
        if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ioe) {
        System.out.println(ioe);
        }
    }
    
}
