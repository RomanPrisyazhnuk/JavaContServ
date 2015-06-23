package Pack;
import Main.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by AversiveDread on 10.06.2015.
 */
public class Contact {
    String firstName=null;
    String lastName=null;
    String  birthDate=null;
    public  ArrayList <Contact> friendList ;
    public  ArrayList <Hobby> hobbyList ;
    public  ArrayList <Message> MessageList ;



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public ArrayList<Contact> getFriendList() {
        return friendList;
    } public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setFriendList(ArrayList<Contact> altFriendList) {
        this.friendList = altFriendList;
    }

    public ArrayList<Message> getMessageList() {
        return MessageList;
    }

    public void setMessageList(ArrayList<Message> messageList) {
        MessageList = messageList;
    }

    public ArrayList<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(ArrayList<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }
}
