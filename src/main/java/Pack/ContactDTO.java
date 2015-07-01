package Pack;

import org.springframework.stereotype.Component;

@Component
    public class ContactDTO {
        String firstName;
        String lastName;
        String birthDay;


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setBirthday(String birthday) {
            this.birthDay = birthday;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getBirthday() {
            return birthDay;
        }
    }
