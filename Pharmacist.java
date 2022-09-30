/*
 كلاس خاص بالصيدلي فيها اسمه ورقمه واسم الفرع الذي يعمل به و رقم الفرع
                   ودواله لتعديل كلاَ من : اسمه, رقمه, اسم الفرع, رقم الفرع
 */

public class Pharmacist {

    //Variables
    private String PharmacistName; // اسم الصيدلي

    private int id; // رقم الصيدلي

    private double salary; //راتب الصيدلي
    private String branchName; //اسم الفرع

    private int branchNo; //رقم الفرع


    //Constructor

    public Pharmacist(int id, String pharmacistName, double salary, String branchName, int branchNo) {
        PharmacistName = pharmacistName;
        this.id = id;
        this.salary=salary;
        this.branchName = branchName;
        this.branchNo = branchNo;

    }

    public Pharmacist(int id, String pharmacistName, double salary) {
        PharmacistName = pharmacistName;
        this.id = id;
        this.salary=salary;
        branchName = "";
        branchNo = 0;
    }

    //Methods

    public String getPharmacistName() {
        return PharmacistName;
    }

    public void setPharmacistName(String pharmacistName) {
        PharmacistName = pharmacistName;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(int branchNo) {
        this.branchNo = branchNo;
    }
}
