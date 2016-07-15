package uk.ac.ebi.subs.data.component;

public class Contact {
    String emailAddress;

    public Contact(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
