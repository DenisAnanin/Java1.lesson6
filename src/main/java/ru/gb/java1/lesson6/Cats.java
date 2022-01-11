package ru.gb.java1.lesson6;

public class Cats extends Animals {
    private static int catsCount = 0;
    private static final String defaultName = "Кот";
    private final int maxRun = 200;

    public Cats() {
        catsCount = ++catsCount;
        this.setName(defaultName + catsCount);

    }

    public Cats(String name) {

        super(name);
        catsCount = ++catsCount;
    }

    @Override
    public void run(int dis) {
        if (dis > maxRun) {
            dis = dis - maxRun;
            System.out.println(getName() + " пробежал " + maxRun + " метров" + " устал и несможет пробежать еще " + dis + " метров.");
        } else {
            super.run(dis);
        }

    }

    @Override
    public void swim(int dis) {
        System.out.println("Коты не умеют плавать " + getName() + " не смог проплыть " + dis + " метров и утонул.");
    }

    public static int getCatsCount() {
        return catsCount;
    }

}
