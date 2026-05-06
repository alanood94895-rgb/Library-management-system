package Entities;

import java.util.ArrayList;
import java.util.List;

public class Member extends Address{
    String memberName;
    String memberID;
    Integer memberPhone;
    // Member member = new Member();
    List<LibraryItem> libraryItems = new ArrayList<>();

    public String getMemberName() {
        return memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public Integer getMemberPhone() {
        return memberPhone;
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberPhone(Integer memberPhone) {
        this.memberPhone = memberPhone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberID='" + memberID + '\'' +
                ", memberPhone=" + memberPhone +
                '}';
    }
    public void DisplayMemberDetails(){
        System.out.println("Member Name: " + getMemberName());
        System.out.println("Member ID: " + getMemberID());
        System.out.println("Member Phone number: " + getMemberPhone());
        System.out.println("Member Address: " + getStreet()+" " + getCity() +" " + getCountry());
    }
}