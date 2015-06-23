package Pack;

import java.util.ArrayList;

public class ContactDao {
    public ArrayList<Contact> contactList ;

    public void addContact(Contact contactToAdd){
        contactList.add(contactToAdd);
        System.out.println(" " + contactToAdd.getFirstName() + " added to contactList");


    }
    public void deleteContact(Contact  contactToRemove){
        System.out.println(contactToRemove.getFirstName()+" removed");
        contactList.remove(contactToRemove);


    }
    public void addFriendship(Contact cont1,Contact cont2) {
        cont1.friendList.add(cont2);
        cont2.friendList.add(cont1);
    }
    public void removeFriendship(Contact cont1,Contact cont2){
        cont1.friendList.remove(cont2);
        cont2.friendList.remove(cont1);
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }
}
