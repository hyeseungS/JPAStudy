package shoppingjpa;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue // AUTO -> SEQUENCE
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

    //Getter, Setter
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
