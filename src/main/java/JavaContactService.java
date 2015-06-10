import java.time.LocalDate;

/**
 * Created by AversiveDread on 10.06.2015.
 */
public class JavaContactService {

    public void createContact(String fName,String sName,LocalDate bDate){
        Contact newContact = new Contact();
        newContact.firstName =fName;
        newContact.lastName =sName;
        newContact.birthDate = bDate;
        System.out.println(newContact.firstName+newContact.lastName+newContact.birthDate+" created");
    }
    public void addHobby(String titl,String descr){
        Hobby newHobby = new Hobby();
        newHobby.title = titl;
        newHobby.description = descr;
        System.out.println(newHobby.title+newHobby.description+ " added");


    }
}

