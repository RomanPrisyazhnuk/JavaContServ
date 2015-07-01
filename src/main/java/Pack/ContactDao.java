package Pack;

import java.util.ArrayList;

public class ContactDAO {
    public ArrayList<Contact> contactList ;

    public void addContact(Contact contactToAdd){
        contactList.add(contactToAdd);
        System.out.println(" " + contactToAdd.getFirstName() + " added to contactList");
    }

    public void addContact (ContactDTO contactDTO)
    {
        Contact contact = new Contact();
        contact.setFirstName(contactDTO.getFirstName());
        contact.setLastName(contactDTO.getLastName());
        contact.setBirthDate(contactDTO.getBirthday());
        contactList.add(contact);
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
