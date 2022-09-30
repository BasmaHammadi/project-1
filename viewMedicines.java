import java.util.Scanner;

public class viewMedicines {
    //Variables
    ControlMedicine c;
    Scanner in;

    //Constructor
    public viewMedicines() {
        c = new ControlMedicine();
        in = new Scanner(System.in);
    }

    //Methods
    public void start() {
        while (true) {
            System.out.print("1-Add New medicine.\n2-View All medicines.\n3-Search For medicine.\n5-Modify medication data.\n5-Delete medicine.\n6-Exit.\nChoice:");
            //a
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> add();
                case 2 -> view();
                case 3 -> find();
                case 4 -> update();
                case 5 -> delete();
                case 6 -> System.out.println("Good Bye");
                default -> {
                    System.out.println("Input error!\nPlease try again.");
                    //a
                    System.exit(0);
                }
            }
        }
    }

    //___________________________________________________________________________
    public void add() {
        int id = 0;
        int[] expiryDate = new int[2], productionDate = new int[2];
        double price = 0.0;
        String medicinesName, company = null;
        System.out.print("ID:" + (id + 1));
        id++;
        System.out.print("\nName:");
        medicinesName = in.next();
        //a
        System.out.print("Production Date:\nMonth:");
        productionDate[0] = in.nextInt();
        System.out.print("Year:");
        productionDate[1] = in.nextInt();
        if (productionDate[0] > 0 && productionDate[1] > 0) {
            //b
            System.out.print("Expiry Date:\nMonth:");
            expiryDate[0] = in.nextInt();
            System.out.print("Year:");
            expiryDate[1] = in.nextInt();
            if (expiryDate[0] > 0 && expiryDate[1] > 0) {
                //c
                System.out.print("Price:");
                price = in.nextDouble();
                if (price > 0.0) {
                    System.out.print("Company:");
                    company = in.next();

                } else
                    System.out.println("Input error! Enter the price correctly.");
                //c
            } else
                System.out.println("Input error! Enter the expiry date correctly.");
            //b
        } else
            System.out.println("Input error! Enter the production date correctly.");
        //a
        boolean added = c.addNewMedicine(id, medicinesName, price, expiryDate, productionDate, company);
        if (added)
            System.out.println("Added successfully");
        else
            System.out.println("Can not added!");
    }
    //______________________________________________________________________________________________________________

    public void view() {
        Medicines[] all = c.viewAllMedicines();
        System.out.println("ID\t\tMedicines Name\t\tPrice \t\tExpiry Date \t\tProduction Date\t\tCompany");
        for (Medicines medicines : all) {
            if (medicines != null) {
                System.out.println(medicines.getId() + "\t\t" + medicines.getMedicinesName() + "\t\t" + medicines.getPrice() + "\t\t" + medicines.getExpiryDate() + "\t\t" + medicines.getProductionDate() + "\t\t" + medicines.getCompany());
            }
        }
    }
    //______________________________________________________________________________________________________________

    public void find() {
        System.out.println("Enter medicine name: ");
        String nameFind = in.next();
        Medicines s = c.searchForMedicine(nameFind);
        if (s != null)
            System.out.println(s.getId() + "\t\t" + s.getMedicinesName() + "\t\t" + s.getPrice() + "\t\t" + s.getProductionDate() + "\t\t" + s.getExpiryDate() + "\t\t" + s.getCompany());
        else
            System.out.println("No medicine with this name.");
    }


//______________________________________________________________________________________________________________

    public void update() {
        System.out.println("Enter medicine name: ");
        String nameFind = in.next();
        Medicines s = c.searchForMedicine(nameFind);
        if (s != null)
        {
            System.out.println("Enter the thing you want to modify:\n1-Medicines Name\n2-Price \n3-Expiry Date \n4-Production Date\n5-Company");
            //a
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the new Medicines Name: ");
                    s.setMedicinesName(in.next());
                    break;
                case 2:
                    System.out.println("Enter the new Price: ");
                    s.setPrice(in.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the new Expiry Date: ");
                    int []arr= new int[2];
                    for (int i = 0; i < 2; i++) {
                        arr[i]=in.nextInt();
                    }
                    s.setExpiryDate(arr);
                    break;
                case 4:
                    System.out.println("Enter the new Production Date: ");
                    int []arr2= new int[2];
                    for (int i = 0; i < 2; i++) {
                        arr2[i]=in.nextInt();
                    }
                    s.setProductionDate(arr2);
                case 5:
                    System.out.println("Enter the new Company: ");
                    s.setCompany(in.next());
                    break;
                default:
                    System.out.println("Input error! Please try again.");
                    //a
            }
            System.out.println("Modified Successfully.");
        }
        else
            System.out.println("No medicine with this name.");

    }
//______________________________________________________________________________________________________________
    public void delete(){
        System.out.println("Enter medicine name: ");
        String nameDelete = in.next();
        boolean s = c.deleteMedicine(nameDelete);
        if (s)
            System.out.println("deleted Successfully.");
        else
            System.out.println("No medicine with this name.");


    }
}

