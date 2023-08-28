package com.chat;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.IntStream;

public class Student extends Learner {
    @Override
    public void learn() {
        System.out.println("Текущее системное время: " + LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
    }

    public void learn(String task, int arg) {
        //code
    }
}
