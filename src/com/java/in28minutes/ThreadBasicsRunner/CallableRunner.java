package com.java.in28minutes.ThreadBasicsRunner;

import java.util.concurrent.*;

class CallableTask implements Callable {
    private final String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("in28minutes"));

        System.out.println("\nnew Callable Executed");
        System.out.println(welcomeFuture.get());
        System.out.println("\nnew Callable Completed");
        executorService.shutdown();
    }
}
