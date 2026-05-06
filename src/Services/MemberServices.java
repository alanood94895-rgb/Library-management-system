package Services;

import Entities.LibraryItem;
import Entities.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberServices {
    List<LibraryItem> libraryItems = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Member member = new Member();
    List<Member> members = new ArrayList<>();

    public Member RegisterNewMember(){
        System.out.println(" ** Registering new Member **");
        System.out.println("Please Enter Member ID");
        String newMemberId = scanner.nextLine();
        member.setMemberID(newMemberId);

        System.out.println("Please Enter Member Name");
        String newMemberName = scanner.nextLine();
        member.setMemberName(newMemberName);

        System.out.println("Please Enter Member Phone Number");
        Integer newMemberPhone = Integer.valueOf(scanner.nextLine());
        member.setMemberPhone(newMemberPhone);

        System.out.println("Please Enter Member Address");
        System.out.println("Street:");
        String  street = scanner.nextLine();
        member.setStreet(street);

        System.out.println("City:");
        String  city = scanner.nextLine();
        member.setCity(city);

        System.out.println("Country:");
        String  country = scanner.nextLine();
        member.setCountry(country);

        System.out.println("Postal Code:");
        Integer  postal = Integer.valueOf(scanner.nextLine());
        member.setPostalCode(postal);


        return null;
    }

    public List<Member> addNewMember(){
        Boolean continueFlag = true;
        while (continueFlag) {
            members.add(RegisterNewMember());
            System.out.println("Enter q to exit, press ENTER to continue for more students");
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return members;
    }

    public boolean FindMemberByID(){
        System.out.println("Please enter the member Id you want to find");
        String searchedMemberID = scanner.nextLine();

        for (int i =0; i< members.size();i++){
            String target = String.valueOf(members.get(i));

            if (target.equalsIgnoreCase(searchedMemberID)){
                member.DisplayMemberDetails();
                return true;
            }
        }
        return false;

    }
}