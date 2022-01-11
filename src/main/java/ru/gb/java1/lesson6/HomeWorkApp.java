package ru.gb.java1.lesson6;


public class HomeWorkApp {
    public static int x = 5; //Количество котов и собак

    public static void main(String[] args) {
        Dogs dog1=new Dogs("Жучка");
        dog1.run(300);
        dog1.swim(7);
        Cats cat1=new Cats("Васька");
        cat1.run(500);
        cat1.swim(3);
//          Сложности с окончаниями слов мужского и женского рода нужно по кличке определять пол животины
        Animals[] dog = new Animals[x];
        dog = makeAnimals(x);
        dog[0].swim(15);
        dog[1].run(450);
        dog[2].run(650);
        dog[4].swim(8);

        Animals[] cat = new Animals[x];
        cat = makeAnimals(x);
        cat[0].run(220);
        cat[1].swim(5);
        cat[2].run(180);

        System.out.println("Всего создано животных " + (Dogs.getDogsCount()+Cats.getCatsCount()));
        System.out.println("Создано "+Cats.getCatsCount()+" котов");
        System.out.println("Создано "+Dogs.getDogsCount()+" собак");
    }
//          Думал как из одного метода возвращать 2 разных массива так и непридумал
//          Сделал только для того чтобы руками котопсов не создовать

    public static Animals[] makeAnimals(int count) {
        if (Dogs.getDogsCount() <= x) {
            Dogs[] temp = new Dogs[count];
            for (int i = 0; i < count; i++) {
                temp[i] = new Dogs();
            }
            return temp;
        } else {
            Cats[] temp = new Cats[count];
            for (int i = 0; i < count; i++) {
                temp[i] = new Cats();
            }
            return temp;
        }

    }
}
