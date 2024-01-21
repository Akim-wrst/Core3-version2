package task.io;

import java.util.ArrayList;

// TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
//  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.

class StudException extends Exception {
    StudException(String s) {
        super(s);
    }
}

public class StudentException {
    public static void addStudent(ArrayList<String> list, String student) {
        try {
            for (String st : list) {
                if (st.equals(student)) {
                    throw new StudException("Такой студент уже есть");
                }
            }
            list.add(student);
            System.out.println(list);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StudentException.addStudent(list, "Akim");
        StudentException.addStudent(list, "Akim");
    }
}
