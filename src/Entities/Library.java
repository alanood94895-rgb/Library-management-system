package Entities;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library extends Address {
    String libraryCode;
    String libraryName;
    List<Member> members = new ArrayList<>();
    List<LibraryItem> libraryItems = new ArrayList<>();


    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getLibraryCode() {
        return libraryCode;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public void setLibraryItems(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryCode='" + libraryCode + '\'' +
                ", libraryName='" + libraryName + '\'' +
                '}';
    }
}
