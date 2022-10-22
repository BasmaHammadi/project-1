
import java.util.ArrayList;

public class ControlMedicine {
    //Variables
    protected final ArrayList<Medicines> allMedicines = new ArrayList<>();
    //Constructor
    public ControlMedicine() {
    }

    //----------------------------------------------------
    //Methods
    public void addNewMedicine(int id,String medicinesName, double price, int[] expiryDate, int[] productionDate, String company, int qty) {
        Medicines s = new Medicines( id, medicinesName, price, expiryDate, productionDate, company,qty);
        allMedicines.add(s);
    }
    //----------------------------------------------------

    public ArrayList<Medicines> viewAllMedicines() {
        return allMedicines;
    }
    //----------------------------------------------------

    public Medicines searchForMedicine(String MedicinesName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allMedicines.size()) {
            if (allMedicines.get(i)!=null) {
                if (allMedicines.get(i).getMedicinesName().equals(MedicinesName))
                    found = true;
                else
                    i++;
            }
            else
                i++;
        }
        if (i < allMedicines.size())
            return allMedicines.get(i);
        else
            return null;
    }
    //----------------------------------------------------

    private int searchForMedicineIndex(String MedicinesName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allMedicines.size()) {
            if (allMedicines.get(i) != null) {
                if (allMedicines.get(i).getMedicinesName().equals(MedicinesName))
                    found = true;
                else
                    i++;
            } else
                i++;
        }
        if (i < allMedicines.size())
            return i;
        else
            return -1;
    }
    //----------------------------------------------------

    public boolean deleteMedicine(String deleteName) {
        int index = searchForMedicineIndex(deleteName);
        if (index != -1) {
            allMedicines.remove(index);
            return true;
        } else return false;

    }

//----------------------------------------------------
}