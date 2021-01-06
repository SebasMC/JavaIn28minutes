package com.java.in28minutes.ThreadBasicsRunner;

class Task1 extends Thread{
    public void run(){
        System.out.println("\nTask1 Started");
        for(int i = 101; i <= 199; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable{
   @Override
    public void run(){
        System.out.println("\nTask2 Started");
        for(int i = 201; i <= 299; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}

public class ThreadBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\nTask1 kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(1);

        task1.start();

        System.out.print("\nTask2 kicked off");
        Task2 task2 = new Task2();
        Thread threadTask2 = new Thread(task2);
        threadTask2.setPriority(10);
        threadTask2.start();

        //wait for task1 to complete
        task1.join();

        System.out.print("\nTask3 kicked off");
        for(int i = 301; i <= 399; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 Done");
    }
}
