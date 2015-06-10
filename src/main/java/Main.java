import java.time.LocalDate;

/**
 * Created by AversiveDread on 10.06.2015.
 */
public class Main {
    public static void main(String[] args) {

        JavaContactService jcs = new JavaContactService();

        jcs.createContact("Vasia", "Pupkin", LocalDate.of(2000, 12, 12));
        jcs.addHobby("Boks","With Klichko");


    }
}
