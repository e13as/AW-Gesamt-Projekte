package de.awacademy.assessment;

public class Address {

    // Eigenschaften
    private String name;
    private String company;
    private String line1;
    private String line2;
    private String country;


    public Address(){
            this.name = "";
            this.company = "";
            this.line1 = "";
            this.line2 = "";
            this.country = "";

    }

    //Getter
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCountry() {
        return country;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public void setCountry(String country) {
        this.country = country.toUpperCase();
    }

    public boolean isValid(String[] laenderNamen){
        for (String landsName: laenderNamen) {
            if (!(this.name.isEmpty() && this.line1.isEmpty() && this.line2.isEmpty())){
                if (this.country.equals(landsName)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (company.isEmpty()){
            return name + "\n" +
                    line1 + "\n" +
                    line2 + "\n" +
                    country;
        }else {
            return name + "\n"+
                    company + "\n" +
                    line1 + "\n" +
                    line2 + "\n" +
                    country;

        }
    }
}
