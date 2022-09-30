/*
يدخل المستخدم الاسم وكلمة السر ان وجد ما سبق في قاعدة البيانات سيتم ادخاله الى الواجهه التالية
مالم ستظهر رسالة ان الاسم او كلمة المرور خاطئ وسيتم طلب ادخاله من جديد
عند الدخول الى النافذة التالية سيتم عرض واجهه بيع الادوية و الفوترةفي
     نفس النافذة يوجد لدينا قائمة فيها ادارة الموظفين (الصيدلي) يتم فيها اضافة ,حذف وتعديل  بيانات الموظفين
  والاستعلام عن الموظفين
           والخيار الاخر لادارة الادوية يتم فيهااضافة ,حذف وتعديل  بيانات الخاصة بالادوية والاستعلام عن دواء معين
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 for Pharmacist or 2 for medicine: ");
        int choice =in.nextInt();
        switch (choice) {
            case 1 -> {
                viewPharmacist v1 = new viewPharmacist();
                v1.start();
            }
            case 2 -> {
                viewMedicines v2 = new viewMedicines();
                v2.start();
            }
        }

    }

}
