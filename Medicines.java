/*

كلاس للادوية يحتوي على اسم الدواء ورقم الدواء ةتاريخ الانتاج و تاريخ الانتهاء و اسم الشركة المصنعة

 */
public class Medicines {
        //Variables
        private int id; // رقم دواء
        private String medicinesName; //اسم الدواء
        private double price;  // سعر الدواء

        private int[] expiryDate = new int[2]; //تاريخ الاانتهاء
        private int[] productionDate = new int[2];// تاريخ الانتاج

        private String company; //اسم الشركة المصنعة

        //Constructor

        public Medicines(int id, String medicinesName, double price, int[] expiryDate, int[] productionDate, String company) {
                this.id = id;
                this.medicinesName = medicinesName;
                this.price = price;
                this.expiryDate = expiryDate;
                this.productionDate = productionDate;
                this.company = company;
        }


        //Methods
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
        public String getMedicinesName() {
        return medicinesName;
        }

        public void setMedicinesName(String medicinesName) {
        this.medicinesName = medicinesName;
        }

        public double getPrice() {
        return price;
        }

        public void setPrice(double price) {
        this.price = price;
        }

        public String getExpiryDate() {
             int x =expiryDate[0],y=expiryDate[1];
             return x+" / "+y;
        }

        public void setExpiryDate(int[] expiryDate) {
                this.expiryDate = expiryDate;
        }

        public String getProductionDate() {
                int x =productionDate[0], y=productionDate[1];
                return x+" / "+y;
        }

        public void setProductionDate(int[] productionDate) {
                this.productionDate = productionDate;
        }

        public String getCompany() {return company;}

        public void setCompany(String company) {this.company = company;}
}
