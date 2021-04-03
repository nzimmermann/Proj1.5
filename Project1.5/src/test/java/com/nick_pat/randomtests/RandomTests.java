package com.nick_pat.randomtests;

import org.junit.jupiter.api.Test;

public class RandomTests {

    @Test
    public void testingThreads(){
        Thread a = new Thread(() -> System.out.println("Hello"));

        a.start();

    }


}
