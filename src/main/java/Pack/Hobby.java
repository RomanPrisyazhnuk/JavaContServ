package Pack;

import java.util.ArrayList;

public class Hobby {
    String title;
    String description;
    public static ArrayList<Contact> contactsWithHobbyList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Contact> getContactsWithHobbyList() {
        return contactsWithHobbyList;
    }

    public static void setContactsWithHobbyList(ArrayList<Contact> contactsWithHobbyList) {
        Hobby.contactsWithHobbyList = contactsWithHobbyList;
    }
}
