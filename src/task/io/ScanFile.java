package task.io;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

// TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
//  введенного текста создается файл
public class ScanFile {
    public static void main(String[] args) {
        System.out.println("Введите текст, и прожмите Enter:");
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        try {
            File file = new File("C:\\Java\\hey.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(st.getBytes());
            System.out.println("Файл создан, и записан!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
