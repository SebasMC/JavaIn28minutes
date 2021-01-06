package com.java.in28minutes.filesOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");
        //Files.list(currentDirectory).forEach(System.out::println);
        //Files.walk(currentDirectory,5)
        //        .filter(path -> String.valueOf(path).contains(".xml"))
        //        .forEach(System.out::println);

        //Bipredicado
        Files.find(currentDirectory, 5, (path,attributes) -> String.valueOf(path).contains(".xml")).forEach(System.out::println);

        Files.find(currentDirectory, 5, (path,attributes) -> attributes.isDirectory()).forEach(System.out::println);
        System.out.println( "¡Hola pap\u00e1!\nYa puedo escribir bien.\n\u00d1a\u00f1a\u00f1a\u00f1a \u0303" );

    }
}
