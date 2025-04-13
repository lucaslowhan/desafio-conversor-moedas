package dev.lucaslowhan.conversor.main;

import dev.lucaslowhan.conversor.domain.FileGenerator;
import dev.lucaslowhan.conversor.menu.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.option = 9;
        while (menu.option!=0) {
            menu.startMenu();
        }

    }
}
