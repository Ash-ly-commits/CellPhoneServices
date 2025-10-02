package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Created CellPhone objects and set them up
    CellPhone phone1 = new CellPhone();
    CellPhone phone2 = new CellPhone();
    setUp(phone1);
    setUp(phone2);

    // Displaying object's members and dialing each other
    display(phone1);
    display(phone2);
    phone1.dial(phone2.getPhoneNumber());
    phone2.dial(phone1.getPhoneNumber());
    }

    // Prompting users for values to set members to
    public static void setUp(CellPhone p){
        System.out.print("What is the serial number? ");
        p.setSerialNumber(scanner.nextInt());
        System.out.print("What model is the phone? ");
        scanner.nextLine();
        p.setModel(scanner.nextLine());
        System.out.print("Who is the carrier? ");
        p.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number? ");
        p.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone? ");
        p.setOwner(scanner.nextLine());
    }

    //Displays object's members through accessor methods
    public static void display(CellPhone p){
    System.out.println("\nSerial number: " + p.getSerialNumber() +
            "\nModel: " + p.getModel() +
            "\nCarrier: " + p.getCarrier() +
            "\nPhone number: " + p.getPhoneNumber() +
            "\nOwner: " + p.getOwner() + "\n");
    }
}
