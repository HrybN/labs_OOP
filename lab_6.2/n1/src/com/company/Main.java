package com.company;

public class Main {

    public static void main(String[] args) {

        One bmw = new One();
        bmw.mileage = 40000;
        bmw.speed = 230;
        bmw.weight = 2000;

        Two opel = new Two();
        opel.height = 140;
        opel.length = 350;
        opel.width = 170;

        Three audi = new Three();
        audi.horsepower = 250;
        audi.liter_per100km = 7;
        audi.passenger = 5;

        String BMW, OPEL, AUDI;

        BMW = "Пробіг BMW: " + bmw.mileage + " км, швидкість: " + bmw.speed + " км/год, вага: " + bmw.weight + " кг.";
        OPEL = "Висота OPEL: " + opel.height + " см, довжина: " + opel.length + " см, ширина: " + opel.width + " см.";
        AUDI = "Кінські сили AUDI: " + audi.horsepower + " кс, розхід пального на 100 км: " + audi.liter_per100km + " л, вмістимість: " + audi.passenger + " людей.";

        System.out.print(BMW + "\n" + OPEL + "\n" + AUDI);
    }
}
