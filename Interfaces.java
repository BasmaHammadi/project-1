import javax.swing.*;
import java.awt.*;

public class Interfaces {
    public static void main(String[] args) {
        //النافذة الرئيسية تحتوي على اسم الصيدلي و كلمة المرور الخاصة به
        JFrame frame=new JFrame("Pharmacy");
        frame.setSize(1000,700);
        frame.setLocation(250,90);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //تغيير نوع الخط وحجمه
        Font newFont = new Font("Times New Roman", Font.BOLD, 20);

        //القسم الخاص باسم الصيدلي
        JTextField textPharmacist = new JTextField();
        textPharmacist.setBounds(500, 200, 250, 30);
        JLabel labelName = new JLabel("Enter your name");
        labelName.setBounds(300, 200, 200, 30);
        labelName.setFont(newFont);
        textPharmacist.setBackground(new Color(0xB8E2F1));
        frame.add(labelName);
        frame.add(textPharmacist);

        //القسم الخاص بكلمة المرور
        frame.setLayout(null);
        JPasswordField passwordPharmacist = new JPasswordField();
        passwordPharmacist.setBounds(500, 300,250,30);
        JLabel labelPass = new JLabel("Enter your password");
        labelPass.setBounds(300, 300, 200, 30);
        labelPass.setFont(newFont);
        passwordPharmacist.setBackground(new Color(0xB8E2F1));
        frame.add(passwordPharmacist);
        frame.add(labelPass);
        frame.setVisible(true);
//_____________________________________________________________________________________________
//
//        //واجهة الأدوية
//        JFrame frame2=new JFrame("Medicines");
//        frame2.setSize(1000,700);
//        frame2.setLocation(250,90);
//        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame2.setVisible(true);
//_____________________________________________________________________________________________



    }
}
