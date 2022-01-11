package ru.gb.java1.lesson6;

public class Dogs extends Animals {
    private static int dogsCount = 0;
    private static final String defaultName= "Собака";
    private final int maxRun = 500;
    private final int maxSwim = 10;

    public Dogs(){
        dogsCount=++dogsCount;
        this.setName(defaultName+dogsCount);

    }

    public Dogs(String name) {

        super(name);
        dogsCount=++dogsCount;
    }

    @Override
    public void run(int dis) {

        if (dis > maxRun) {
            dis = dis - maxRun;
            System.out.println(getName() + " пробежала " + maxRun + " метров" + " устала и несмогла пробежать еще " + dis + " метров");
        } else {
            super.run(dis);
        }

    }

    @Override
    public void swim(int dis) {
        if (dis > maxSwim) {
            System.out.println(getName() + " не смогла проплыть " + dis + " метров, она проплыла " + maxSwim + " метров и утонула.");
        } else {
            super.swim(dis);
        }
    }

    public static int getDogsCount() {
        return dogsCount;
    }
}
