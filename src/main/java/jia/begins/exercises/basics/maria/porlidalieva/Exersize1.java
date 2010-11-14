package jia.exercises.javabasicsbeta2.maria.porlidalieva;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: mariap
 * Date: Nov 9, 2010
 * Time: 9:43:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Exersize1 {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter information for JACME Inc\n");
        System.out.print("Enter your name: ");
                        System.out.println();
                  System.out.println();
        String name = in.next();

        System.out.print("Enter your last name: ");

        String lastName = in.next();

        System.out.print("Enter your position: ");

        String position = in.next();

        System.out.print("Enter your age: ");

        String age = in.next();

        System.out.print("Enter your salary: ");

        String salary = in.next();

        FileWriter fileWriter = null;
        try {
        fileWriter = new FileWriter("/Users/mariap/Desktop/employees.txt", true);
        } catch (IOException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        PrintWriter pw = new PrintWriter(fileWriter);
        pw.write(name+"\t\t");
        pw.write(lastName+"\t\t");
        pw.write(position+"\t\t");
        pw.write(age+"\t\t");
        pw.write(salary+"\t\t");
        pw.write("\n");
        pw.flush();
        pw.close();
     }


}
