package com.java.in28minutes.ThreadBasicsRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        //Ejecuta un hilo a la vez
       // ExecutorService executorService = Executors.newSingleThreadExecutor();

        //Multithreadins
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.print("\nTask3 kicked off");
        for(int i = 301; i <= 399; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 Done");

        //Importante poner este comando para apagar el executor service
        executorService.shutdown();
    }
}
