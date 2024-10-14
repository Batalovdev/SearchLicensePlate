package ru.batalovdev.searchplate.randomizer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlateRandomizer {

    private static PlateRandomizer randomizer = null;

    private Set<String> m_plates_source;
    public Set<String> getM_plates_source() {
        return m_plates_source;
    }

    private final int region =197;
    private PlateRandomizer(){
        this.m_plates_source=new HashSet<>();
        UniqueValues uniqueVals = UniqueValues.getInstace();
        System.out.println(uniqueVals.getM_letter_combination().size());
        System.out.println(uniqueVals.getM_digit_combination().size());
        makePlates(uniqueVals.getM_letter_combination(),uniqueVals.getM_digit_combination());
    }

    public static PlateRandomizer getInstance(){
        if(randomizer==null){
            randomizer=new PlateRandomizer();
        }
        return randomizer;
    }

    private void makePlates(Set<String> letters,Set<String> digits){
        Iterator<String> l_it;
        Iterator<String> d_it;
        l_it=letters.iterator();
        d_it= digits.iterator();


        while(l_it.hasNext() && d_it.hasNext()){
            String plate_values = l_it.next().charAt(0)+d_it.next()+l_it.next().substring(1)+"197";
            this.m_plates_source.add(plate_values);
        }



    }
}


