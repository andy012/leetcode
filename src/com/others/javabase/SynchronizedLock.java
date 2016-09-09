package com.others.javabase;

import java.math.BigDecimal;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by andy on 8/27/16.
 */
public class SynchronizedLock {
    public static void main(String[] args) {

        TestThread testThread=new SynchronizedLock.TestThread();
        testThread.start();
        //ExecutorService

    }
    static class  TestThread extends Thread{
        @Override
        public synchronized void run() {
            super.run();
            test();
        }
        public synchronized void test(){
            System.out.println("test");
        }
    }



}
