package vorbereitung_checkpoint.person;

public abstract class Person {

    private String name;

    private String eMail;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String vorstellung() {
        return "Hallo, ich bin " + name;
    }
}
