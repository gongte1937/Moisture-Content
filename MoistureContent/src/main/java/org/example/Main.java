package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        // input the data
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the tare mass: ");
        float Mc = input.nextInt();
        System.out.print("Enter the tare and material wet Mass: ");
        float Mcms = input.nextInt();
        System.out.print("Enter the tare and material dry Mass: ");
        float Mcds = input.nextInt();

        //close the input
        input.close();



        // create a new object and calculate
        MoistureContent a = new MoistureContent(Mc, Mcms, Mcds);
        System.out.print("Result: \n");
        System.out.println("Material Wet Mass: "+ a.materialWetMass());
        System.out.println("Material Dry Mass: "+ a.materialDryMass());
        System.out.println("Water Content:"+ a.waterContent() + "%");
    }

}