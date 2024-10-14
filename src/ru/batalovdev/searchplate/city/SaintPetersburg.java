package ru.batalovdev.searchplate.city;

import ru.batalovdev.searchplate.plateholder.Citizen;
import ru.batalovdev.searchplate.randomizer.PlateRandomizer;

import java.util.List;

public class SaintPetersburg {

    private List<Citizen> citizens;

    public SaintPetersburg()
    {
        PlateRandomizer rand_plates = PlateRandomizer.getInstance();
        int number=0;
        for(String plates:rand_plates.getM_plates_source()){
            number++;
            Citizen citizen = new Citizen("Person "+Integer.toString(number));
            citizen.setPlate(plates);
            System.out.println(citizen.toString());
        }
        System.out.printf("Total citizens:%d",number);
    }
}
