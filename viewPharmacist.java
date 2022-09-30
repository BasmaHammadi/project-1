import java.util.Scanner;

public class viewPharmacist {
    //Variables
    ControlPharmacist c;
    Scanner in;

    //Constructor
    public viewPharmacist() {
        c = new ControlPharmacist();
        in = new Scanner(System.in);
    }

    //Methods
    public void start() {
        while (true) {
            System.out.print("1-Add New Pharmacist.\n2-View All Pharmacist.\n3-Search For Pharmacist.\n4-Modify Pharmacist data.\n5-Delete.\n6-Exit.\nChoice:");
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
        int id = 0, branchNo=0;
        double salary ;
        String PharmacistName, branchName=null ;
        System.out.print("ID:" + (id + 1));
        id++;
        System.out.print("\nName:");
        PharmacistName = in.next();
        //a
        System.out.print("Salary:");
        salary = in.nextDouble();
        if (salary > 0) {
            //b
            System.out.print("Branch Name:");
            branchName = in.next();
            System.out.print("Branch Number:");
            branchNo = in.nextInt();
            if (branchNo<=0)
                    System.out.println("Input error! Enter the Branch Number correctly.");
                //c
            } else
                System.out.println("Input error! Enter the salary correctly.");
            //b
        boolean added = c.addNewPharmacist(id, PharmacistName, salary, branchName, branchNo);
        if (added)
            System.out.println("Added successfully");
        else
            System.out.println("Can not added!");
    }
    //______________________________________________________________________________________________________________

    public void view() {
        Pharmacist[] all = c.viewAllPharmacist();
        System.out.println("id\t\tPharmacist Name\t\tSalary\t\tBranch Name\t\tBranch Number");
        for (Pharmacist pharmacist : all) {
            if (pharmacist != null) {
                System.out.println(pharmacist.getId() + "\t\t" + pharmacist.getPharmacistName()+ "\t\t" + pharmacist.getSalary()+ "\t\t" + pharmacist.getBranchName() + "\t\t" + pharmacist.getBranchNo());
            }
        }
    }
    //______________________________________________________________________________________________________________

    public void find() {
        System.out.println("Enter pharmacist name: ");
        String nameFind = in.next();
        Pharmacist s = c.searchForPharmacist(nameFind);
        if (s != null)
            System.out.println(s.getId() + "\t\t" + s.getPharmacistName()+ "\t\t" + s.getSalary()+ "\t\t" + s.getBranchName() + "\t\t" + s.getBranchNo());
        else
            System.out.println("No pharmacist with this name.");
    }


//______________________________________________________________________________________________________________

    public void update() {
        System.out.println("Enter pharmacist name: ");
        String nameFind = in.next();
        Pharmacist s = c.searchForPharmacist(nameFind);
        if (s != null)
        {
            System.out.println("Enter the thing you want to modify:\n1-pharmacist Name\n2-Salary \n3-Branch Name \n4-Branch Number");
            //a
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the new Pharmacist Name: ");
                    s.setPharmacistName(in.next());
                    break;
                case 2:
                    System.out.println("Enter the new Salary: ");
                    s.setSalary(in.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the new Branch Name: ");
                    s.setBranchName(in.next());
                    break;
                case 4:
                    System.out.println("Enter the new Branch Number: ");
                    s.setBranchNo(in.nextInt());

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
        System.out.println("Enter Pharmacist name: ");
        String nameDelete = in.next();
        boolean s = c.deletePharmacist(nameDelete);
        if (s)
            System.out.println("deleted Successfully.");
        else
            System.out.println("No Pharmacist with this name.");


    }
}
