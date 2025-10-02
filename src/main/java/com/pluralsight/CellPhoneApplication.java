package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Created CellPhone object and scanner
    CellPhone phone = new CellPhone();
    Scanner scanner = new Scanner(System.in);

    // Prompting users for values to set members to and giving them back
    System.out.print("What is the serial number? ");
    phone.setSerialNumber(scanner.nextInt());
    System.out.println("Your serial number: " + phone.getSerialNumber());

    System.out.print("What model is the phone? ");
    scanner.nextLine();
    phone.setModel(scanner.nextLine());
    System.out.println("Your model: " + phone.getModel());

    System.out.print("Who is the carrier? ");
    phone.setCarrier(scanner.nextLine());
    System.out.println("Your carrier: " + phone.getCarrier());

    System.out.print("What is the phone number? ");
    phone.setPhoneNumber(scanner.nextLine());
    System.out.println("Your phone number: " + phone.getPhoneNumber());

    System.out.print("Who is the owner of the phone? ");
    phone.setOwner(scanner.nextLine());
    System.out.println("The owner: " + phone.getOwner());
    }
}
