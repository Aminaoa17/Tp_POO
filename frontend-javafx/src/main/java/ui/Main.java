package ui;

import upac.tp.java.backend.services.impl.StudentServiceImpl;

public class Main {

    public static void main(String[] args) {
        StudentServiceImpl a = new StudentServiceImpl();
        a.test("Douala", "Manga Bell");
    }
}
