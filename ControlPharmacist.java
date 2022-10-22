
import java.util.ArrayList;

public class ControlPharmacist {
    //Variables
    private final ArrayList<Pharmacist> allPharmacist  = new ArrayList<>();

    //Constructor

    //----------------------------------------------------
//Methods
    public void addNewPharmacist(int id, String pharmacistName,  double salary, String branchName, int branchNo) {
        Pharmacist s = new Pharmacist(id,  pharmacistName,  salary,  branchName,  branchNo);
        allPharmacist.add(s);}
    //----------------------------------------------------

    public ArrayList<Pharmacist> viewAllPharmacist() { return allPharmacist; }
    //----------------------------------------------------

    public Pharmacist searchForPharmacist(String PharmacistName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allPharmacist.size())
        {
            if (allPharmacist.get(i)!=null)
            {
                if (allPharmacist.get(i).getPharmacistName().equals(PharmacistName))
                    found = true;
                else
                    i++;
            }
            else
                i++;
        }
        if (i < allPharmacist.size())
            return allPharmacist.get(i);
        else
            return null;
    }
    //----------------------------------------------------

    private int searchForPharmacistIndex(String PharmacistName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allPharmacist.size())
        {
            if (allPharmacist.get(i)!=null)
            {
                if (allPharmacist.get(i).getPharmacistName().equals(PharmacistName))
                    found = true;
                else
                    i++;
            }
            else
                i++;
        }
        if (i < allPharmacist.size())
            return i;
        else
            return -1;
    }
    //----------------------------------------------------

    public boolean deletePharmacist(String deleteName) {
        int index = searchForPharmacistIndex(deleteName);
        if (index != -1) {
            allPharmacist.remove(index);
            return true;
        } else return false;

    }

//----------------------------------------------------
}
