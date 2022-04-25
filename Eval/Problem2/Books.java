package Eval.Problem2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Main{
    public static void main(String[] args) {
    }
}
 class Author{
    String authorName;
    String authorDescription;
}

public class Books {
    int bookId;
    String name;
    String description;
    Author author;
}

class DataBase{
    Map<Integer,Books> books=new HashMap<>();

    public boolean registerBooks(Books book){
        if(books.containsKey(book.bookId)){
            return false;
        }
        books.put(book.bookId,book);
        return true;
    }

    public void  showAllBooks(){
        System.out.println(books);
    }

    public Books searchBook(Books book){
          return books.get(book.bookId);
    }
}

 abstract class User{
    String userId;
    String name;
    LocalDateTime validity;
}
abstract class Person{
    String name;
    String aadharNumber;
}
class LibraryMember extends Person{
    LocalDateTime cardValidity;
    MembershipStatus status=MembershipStatus.NOTExist;
    int booksBorrowed=0;


}

enum MembershipStatus{
    EXPIRED,EXIST,NOTExist;
}

 class Membership{
    Map<String,LibraryMember> Allusers=new HashMap<>();

    public void createMembership(LibraryMember member){
        member.status=MembershipStatus.EXIST;
        Allusers.put(member.aadharNumber, member);
        System.out.println("You are registered with the system");
    }

    public void extendMembership(LibraryMember member){
        if(Allusers.containsKey(member.aadharNumber)){
            member.status=MembershipStatus.EXIST;

            member.cardValidity.plusYears(1);
            System.out.println("Membership Increased for a year");
        }
    }


 }

class ReadBook{
    LibraryMember libraryMember;

    public void readBook(){
        
    }
}
