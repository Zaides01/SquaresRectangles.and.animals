package com.company;

public class Main {

    public static void main(String[] args) {

//SQUARES AND RECTANGLES
        Retangle r1 = new Retangle();
        System.out.println(r1);
        Retangle r2 = new Retangle(2, -2, 3, 5);
        System.out.println(r2);

        Square s1 = new Square();
        System.out.println(s1);
        Square s2 = new Square(3,4,10);
        System.out.println(s2);

        System.out.println(s2.lengthDiag());
        System.out.println(r2.lengthDiag());

 //ANIMALS
        Animal a = new Animal();
        Bird b = new Bird();
        Sparrow s = new Sparrow();
        Eagle e = new Eagle();
        Fish f = new Fish();
        Carp c = new Carp();
        Pike p = new Pike();

        Animal animals [] = new Animal[10];//{a, b, s, e, f, c, p};
        for (int i = 0; i < animals.length; i++) {
            int rand = (int)(Math.random()*7);
            switch (rand){
                case 0: animals[i] = new Animal(); break;
                case 1: animals[i] = new Bird(); break;
                case 2: animals[i] = new Carp(); break;
                case 3: animals[i] = new Eagle(); break;
                case 4: animals[i] = new Fish(); break;
                case 5: animals[i] = new Pike(); break;
                case 6: animals[i] = new Sparrow(); break;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].className());
        }
        
    }
}
