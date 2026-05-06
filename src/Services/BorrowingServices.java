package Services;

import Entities.LibraryItem;

import java.util.Scanner;

public class BorrowingServices {
    LibraryItem libraryItem = new LibraryItem();
    LibraryItemServices libraryItemServices = new LibraryItemServices();
    MemberServices memberServices = new MemberServices();
    Scanner scanner = new Scanner(System.in);

    public void BorrowItem(){
        System.out.println("Please enter your ID");
        String borrowerID = scanner.nextLine();
        if (memberServices.FindMemberByID() == true){
            System.out.println(borrowerID + " is MEMBER");
            System.out.println("Please enter the item ID you want to borrow");
            String itemToBorrow = scanner.nextLine();
            if (libraryItemServices.FindItemById() == true){
                System.out.println(itemToBorrow+" "+ "is available");
                libraryItem.setStatus("Borrowed");
                System.out.println("Borrowed Done");
            }else {
                System.out.println("SORRY, Item is not available");
            }

        }else {
            System.out.println( borrowerID +" "+ "Is NOT MEMBER");
        }
    }

    public void ReturnItem(){
        System.out.println("Please enter your ID");
        String borrowerID = scanner.nextLine();
        if (memberServices.FindMemberByID() == true){
            System.out.println(borrowerID + " is MEMBER");
            System.out.println("Please enter the item ID you want to Return");
            String itemToReturn = scanner.nextLine();
            if (libraryItemServices.FindItemById() == true){
                System.out.println(itemToReturn+" "+ "is available");
                libraryItem.setStatus("NOT Borrowed");
                System.out.println("Return Done");
            }else {
                System.out.println("SORRY, Item is not available");
            }

        }else {
            System.out.println( borrowerID +" "+ "Is NOT MEMBER");
        }
    }
}