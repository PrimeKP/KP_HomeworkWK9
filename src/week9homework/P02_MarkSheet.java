package week9homework;

import java.text.DecimalFormat;
import java.util.Scanner;

//2. Re write the student mark sheet programme using if else and while loop.
public class P02_MarkSheet {
    public static void main(String[] args) {
        P02_MarkSheet obj = new P02_MarkSheet();
        obj.markSheet();

    }

    public static void markSheet() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scn.nextLine();
        System.out.print("Enter student roll no: ");
        int Rollno = scn.nextInt();
        System.out.println("Enter Your Math's marks :");
        int Maths = scn.nextInt();
        while (Maths < 0 || Maths > 100) {
            System.out.println("Invalid Maths marks ");
            System.out.print("\nPlease enter correct marks : ");
            Maths = scn.nextInt();
        }
        System.out.println("Enter Your Science's marks :");
        int Science = scn.nextInt();
        while (Science < 0 || Science > 100) {
            System.out.println("Invalid Science Marks");
            System.out.print("\nPlease enter correct marks : ");
            Science = scn.nextInt();

        }
        System.out.println("Enter Your English's marks :");
        int English = scn.nextInt();
        while (English < 0 || English > 100) {
            System.out.println("Invalid English Marks");
            System.out.print("\nPlease enter correct marks : ");
            English = scn.nextInt();
        }
        System.out.println("-----------------------------------");
        System.out.println("|            Mark Sheet           |");
        // System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
        System.out.println("| Name   : " + String.format("%1$-15s", name) + "        |");
        System.out.println("| Roll No: " + String.format("%1$-7s", Rollno) + "                |");
        System.out.println("|---------------------------------|");
        System.out.println("|        Subject :   Marks        |");
        System.out.println("|---------------------------------|");
        System.out.println("| Math      : " + new DecimalFormat("000").format(Maths) + "                 |");
        System.out.println("| Science   : " + new DecimalFormat("000").format(Science) + "                 |");
        System.out.println("| English   : " + new DecimalFormat("000").format(English) + "                 |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");


        int Total = Maths + Science + English;
        System.out.println("| Total     :  " + new DecimalFormat("000").format(Total) + "                |");
        System.out.println("|---------------------------------|");
        double percentage = ((Total * 100) / 300);
        System.out.println("| Percentage:  " + percentage + " %             |");

        if (Maths <= 34 || English <= 34 || Science <= 34) {
            System.out.println("| Result:  " + "Fail" + "                   |");
            System.out.println("| Grade :  " + "No Grade" + "               |");
            System.out.println("|---------------------------------|");

        } else if (percentage >= 80.0 && Maths >= 35 && Science >= 35 && English >= 35) {
            System.out.println("| Result:  " + "Pass" + "                   |");
            System.out.println("| Grade:  " + "A+" + "                      |");
            System.out.println("|---------------------------------|");
        }
        if (percentage >= 60.0 && percentage < 80.0 && Maths >= 35 && Science >= 35 && English >= 35) {
            System.out.println("| Result:  " + "Pass" + "                   |");
            System.out.println("| Grade:  " + "A" + "                       |");
            System.out.println("|---------------------------------|");
        }
        if (percentage >= 50.0 && percentage < 60.0 && Maths >= 35 && Science >= 35 && English >= 35) {
            System.out.println("| Result:  " + "Pass" + "                   |");
            System.out.println("| Grade:  " + "B" + "                       |");
            System.out.println("|---------------------------------|");
        }
        if (percentage >= 35.0 && percentage < 50.0 && Maths >= 35 && Science >= 35 && English >= 35) {
            System.out.println("| Result:  " + "Pass" + "                   |");
            System.out.println("| Grade:  " + "C" + "                       |");
            System.out.println("|---------------------------------|");
        }
        scn.close();
    }
}
