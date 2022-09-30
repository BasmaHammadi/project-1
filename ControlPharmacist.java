
public class ControlPharmacist {
    //Variables
    private final Pharmacist[] allPharmacist;
    private int noPharmacist;

    //Constructor
    public ControlPharmacist() {

        int size = 100;
        allPharmacist = new Pharmacist[size];
        noPharmacist = 0;
    }

    //----------------------------------------------------
//Methods
    public boolean addNewPharmacist(int id, String pharmacistName,  double salary, String branchName, int branchNo) {
        if (noPharmacist < allPharmacist.length) {
            Pharmacist s = new Pharmacist(id,  pharmacistName,  salary,  branchName,  branchNo);
            allPharmacist[noPharmacist] = s;
            noPharmacist++;
            return true;
        } else
            return false;
    }
    //----------------------------------------------------

    public Pharmacist[] viewAllPharmacist() {
        return allPharmacist;
    }
    //----------------------------------------------------

    public Pharmacist searchForPharmacist(String PharmacistName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allPharmacist.length) {

            if (allPharmacist[i].getPharmacistName().equals(PharmacistName))
                found = true;
            else
                i++;
        }
        if (i < allPharmacist.length)
            return allPharmacist[i];
        else
            return null;
    }
    //----------------------------------------------------

    public int searchForPharmacistIndex(String PharmacistName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allPharmacist.length) {
            if (allPharmacist[i].getPharmacistName().equals(PharmacistName))
                found = true;
            else
                i++;
        }
        if (i < allPharmacist.length)
            return i;
        else
            return -1;
    }
    //----------------------------------------------------

    public boolean deletePharmacist(String deleteName) {
        int index = searchForPharmacistIndex(deleteName);
        if (index != -1) {
            allPharmacist[index] = null;
            return true;
        } else return false;

    }

//----------------------------------------------------
}
