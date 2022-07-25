package org.javaadvanced;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C66ExecutorService {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        int cpuCount = Runtime.getRuntime().availableProcessors();
        ExecutorService es2 = Executors.newFixedThreadPool(cpuCount);

        ExecutorService es3 = Executors.newSingleThreadExecutor();
    }
}
