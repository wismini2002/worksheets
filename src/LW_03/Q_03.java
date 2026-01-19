package LW_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Kumar","1234567890");

        Owner owner2 = new Owner();
        owner2.setOwnerName("Alice");
        owner2.setPhoneNo("1111111111");

        Bicycle bicycle1 = new Bicycle(owner1);
        System.out.println("Bicycle 1 Details.");
        System.out.println("Owner : "+bicycle1.getOwner().getOwnerName()+" , PhoneNo : "+bicycle1.getOwner().getPhoneNo());

        Bicycle bicycle2 = new Bicycle(owner2);
        System.out.println("Bicycle 2 Details.");
        System.out.println("Owner : "+bicycle2.getOwner().getOwnerName()+" , PhoneNo : "+bicycle2.getOwner().getPhoneNo());


        Bicycle bicycle3 = new Bicycle();
        bicycle3.setOwner(new Owner("Kamal","2222222222"));


        System.out.println("Bicycle 3 Details.");
        System.out.println("Owner : "+bicycle3.getOwner().getOwnerName()+" , PhoneNo : "+bicycle3.getOwner().getPhoneNo());




    }
}
