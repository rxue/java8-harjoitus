package rx.practice.ocpkasi.javacompiler.trywithresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DemoSimpleTryWithResource {
    public static void main(String[] args) {
        try(InputStream in = new FileInputStream("test")) {
            System.out.println("test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
