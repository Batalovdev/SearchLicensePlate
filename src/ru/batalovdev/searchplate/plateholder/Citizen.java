package ru.batalovdev.searchplate.plateholder;
import ru.batalovdev.searchplate.plateholder.attributes.Plate;

public class Citizen {
    private String m_FIO;
    private Plate m_license_plate;

    public Citizen(String name){
        this.m_FIO=name;
        m_license_plate=Plate.getInstace();
    }
    public void setPlate(String plate){
        this.m_license_plate.setM_license_plate(plate);
    }

    @Override
    public String toString(){
        return this.m_FIO+" "+m_license_plate.getM_license_plate();
    }
}
