package com.company;

public class Main {

    public static void main(String[] args) {

        Syhopytni_viyska zsu_land = new Syhopytni_viyska(250000,"Kyiv", "За Україну! За її волю!");
        Povitryani_syly zsu_air = new Povitryani_syly(52000, "Vinnytsya", "За Україну! За її волю!");
        Morski_syly zsu_sea = new Morski_syly(15000, "Odesa", "За Україну! За її волю!");

        System.out.println("Гасло ЗСУ: " + zsu_air.haslo);
        System.out.println();
        System.out.println("Чисельність Сухопутних військ: " + zsu_land.chyselnist);
        System.out.println("Штаб: " + zsu_land.shtab);
        System.out.println();
        System.out.println("Чисельність Повітряних сил: " + zsu_air.chyselnist);
        System.out.println("Штаб: " + zsu_air.shtab);
        System.out.println();
        System.out.println("Чисельність Морських сил: " + zsu_sea.chyselnist);
        System.out.println("Штаб: " + zsu_sea.shtab);

    }
}
