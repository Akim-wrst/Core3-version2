package task.io;

import java.io.*;
import java.util.Scanner;

// TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
//  считывает первое слово из файла
public class ScanFileInput {
    public static void main(String[] args) {
        System.out.println("Введите текст, и прожмите Enter:");
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        File file = new File("C:\\Java\\FileInput.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(st.getBytes());
            System.out.println("Файл создан, и записан!");
            Scanner sc = new Scanner(new File("C:\\Java\\FileInput.txt"));
            String s = sc.next();
            System.out.println(s);
        } catch (IOException io) {
            System.out.println(io);
        }
    }
}
