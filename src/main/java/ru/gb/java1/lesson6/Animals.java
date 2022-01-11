package ru.gb.java1.lesson6;

public abstract class Animals {
//    private static int objCount=0;
    private String name;

    public Animals(String name) {
        this.name = name;
//        objCount=objCount+1;
    }
    public Animals(){

//        objCount=objCount+1;
    }

    public void run(int dis) {
        System.out.println(getName()+" пробежал " + dis + " метров.");
    }

    public void swim(int dis) {
        System.out.println(getName()+" проплыл " + dis + " метров");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public static int getObjCount() {

        return objCount;
    }
*/
}
