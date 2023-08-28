package com.chat;

public class StudentWithTimer extends Learner {
    private final Learner learner;

    public StudentWithTimer(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        long start = System.currentTimeMillis();
        learner.learn();
        System.out.printf("Время учёбы: %s ms", System.currentTimeMillis() - start);
    }
}
