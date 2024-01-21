package task.io;

import java.io.*;

// TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
//  строкой
public class FileException {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Java\\hi.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("This is the content to write into create file".getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
