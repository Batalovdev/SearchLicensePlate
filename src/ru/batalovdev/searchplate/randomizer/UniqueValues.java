package ru.batalovdev.searchplate.randomizer;

import java.util.HashSet;
import java.util.Set;

public class UniqueValues {

    private Set<String> m_letter_combination,m_digit_combination;
    private final String m_source_letters="ETYOPAHKXCBM";
    private final String m_source_digits = "1234567890";
    private final int m_source_length=3;
    private static UniqueValues uniqueVals = null;

    public Set<String> getM_letter_combination() {
        return m_letter_combination;
    }

    public Set<String> getM_digit_combination() {
        return m_digit_combination;
    }
    private UniqueValues(){
        this.m_letter_combination=new HashSet<>();
        this.m_digit_combination=new HashSet<>();

        generateCombinations("",this.m_source_letters,this.m_source_length,
                this.m_letter_combination);
        generateCombinations("",this.m_source_digits,this.m_source_length,
                this.m_digit_combination);
    }

    public static UniqueValues getInstace(){
        if(uniqueVals == null){
            uniqueVals = new UniqueValues();
        }
        return uniqueVals;
    }
    private static void generateCombinations(String prefix, String input, int len,
                                             Set<String> combinations){
        if(prefix.length()==len){
            combinations.add(prefix);
            return;
        }

        for(int i=0;i<input.length();i++){
            generateCombinations(prefix+input.charAt(i),input,len,combinations);
        }

    }
}
