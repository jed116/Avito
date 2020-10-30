package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FlatManager flatManager = new FlatManager(100_000.0, 1);
        flatManager.save(new Flat(0,7,5,5_000_000.0,"Центральный АО",   new ArrayList<String>(Arrays.asList("Площадь революции", "Охотный ряд", "Театральная"))));
        flatManager.save(new Flat(0,5,5,5_500_000.0,"Центральный АО",   new ArrayList<String>(Arrays.asList("Пушкинская", "Тверская", "Чеховская"))));
        flatManager.save(new Flat(0,3,4,4_000_000.0,"Центральный АО",   new ArrayList<String>(Arrays.asList("Александровский сад", "Арбатская", "Боровицкая", "Библиотека им. Ленина"))));
        flatManager.save(new Flat(0,6,3,2_900_000.0,"Южный АО",         new ArrayList<String>(Arrays.asList("Ленинский проспект", "Площадь гагарина"))));
        flatManager.save(new Flat(0,8,3,3_100_000.0,"Юго-восточный АО", new ArrayList<String>(Arrays.asList("Пролетарская", "Крестьянская застава"))));
        flatManager.save(new Flat(0,4,4,4_000_000.0,"Юго-западный АО",  new ArrayList<String>(Arrays.asList("Серпуховская", "Добрынинская"))));

        ArrayList<Flat> result1_AnySouth_ForGreedySoutherners   = flatManager.search( 0, 0.0,3_000_000.0, 0, 0, new ArrayList<>(Arrays.asList("юг", "юж")), new ArrayList<>(Arrays.asList()) );
        ArrayList<Flat> result2_USSRMetro_ForTrueСommunists     = flatManager.search( 0, 0.0,0.0,         0, 0, new ArrayList<>(Arrays.asList()),           new ArrayList<>(Arrays.asList("ленин", "революц", "пролетар")));
        ArrayList<Flat> result3_ComfortCenter_ForVIPMajors      = flatManager.search( 5, 0.0,0.0,         0, 5, new ArrayList<>(Arrays.asList("центр")),    new ArrayList<>(Arrays.asList()) );

    }
}
