
public class ControlMedicine {
    //Variables
    private final Medicines[] allMedicines;
    private int noMedicines;

    //Constructor
    public ControlMedicine() {

        int size = 100;
        allMedicines = new Medicines[size];
        noMedicines = 0;
    }

    //----------------------------------------------------
    //Methods
    public boolean addNewMedicine(int id, String medicinesName, double price, int[] expiryDate, int[] productionDate, String company) {
        if (noMedicines < allMedicines.length) {
            Medicines s = new Medicines(id, medicinesName, price, expiryDate, productionDate, company);
            allMedicines[noMedicines] = s;
            noMedicines++;
            return true;
        } else
            return false;
    }
    //----------------------------------------------------

    public Medicines[] viewAllMedicines() {
        return allMedicines;
    }
    //----------------------------------------------------

    public Medicines searchForMedicine(String MedicinesName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allMedicines.length) {

            if (allMedicines[i].getMedicinesName().equals(MedicinesName))
                found = true;
            else
                i++;
        }
        if (i < allMedicines.length)
            return allMedicines[i];
        else
            return null;
    }
    //----------------------------------------------------

    public int searchForMedicineIndex(String MedicinesName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allMedicines.length) {
            if (allMedicines[i].getMedicinesName().equals(MedicinesName))
                found = true;
            else
                i++;
        }
        if (i < allMedicines.length)
            return i;
        else
            return -1;
    }
    //----------------------------------------------------

    public boolean deleteMedicine(String deleteName) {
        int index = searchForMedicineIndex(deleteName);
        if (index != -1) {
            allMedicines[index] = null;
            return true;
        } else return false;

    }

//----------------------------------------------------
}