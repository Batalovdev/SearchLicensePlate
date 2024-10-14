package ru.batalovdev.searchplate.plateholder.attributes;

public class Plate {
    private String m_license_plate;

    public void setM_license_plate(String m_license_plate) {
        this.m_license_plate = m_license_plate;
    }
    public String getM_license_plate() {
        return m_license_plate;
    }

    private static Plate instance = null;

    private Plate(){}

    public static Plate getInstace(){
        if(instance == null){
            instance = new Plate();

        }
        return instance;
    }
}
