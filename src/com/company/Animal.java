package com.company;

public class Animal {
    public String className() {
        return "Animal";
    }
}

class Bird extends Animal{
    public String className() {
        return "Bird";
    }
}

class Sparrow extends Bird{
    public String className() {
        return "Sparrow";
    }
}

class Eagle extends Bird{
    public String className() {
        return "Eagle";
    }
}

class Fish extends Animal{
    public String className() {
        return "Fish";
    }
}

class Pike extends Fish{
    public String className(){
        return "Pike";
    }
}

class Carp extends Fish{
    public String className(){
        return "Carp";
    }
}




