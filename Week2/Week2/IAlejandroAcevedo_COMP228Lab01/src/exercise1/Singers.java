package exercise1;

import java.util.UUID;

public class Singers {
    // attributes
    private String id;
    private String name;
    private String address;
    private String dob; // dd-mm-yyyy
    private int albumsPublished;

    // constructors
    // no parameter constructor
    public Singers() {
        this.id = UUID.randomUUID().toString();
        this.name = "Placeholder Name";
        this.address = "Place Holder Address 123, Somewhere";
        this.dob = "01-12-1901";
        this.albumsPublished = 0;
    }

    public Singers(String id){
        this.id = id;
        this.name = "";
        this.address = "";
        this.dob = "";
        this.albumsPublished = 0;
    }

    // two parameter constructor
    public Singers(String name, String address) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = "";
        this.dob = "";
        this.albumsPublished = 0;
    }

    // three parameter constructor
    public Singers(String name, String address, String dob) {
        this.id = UUID.randomUUID().toString();;
        this.name = name;
        this.address = address;
        this.dob = "";
        this.albumsPublished = 0;
    }

    // four parameter constructor
    public Singers(String name, String address, String dob, int albumsPublished) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.albumsPublished = 0;
    }

    // all parameter constructor
    public Singers(String id, String name, String address, String dob, int albumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.albumsPublished = albumsPublished;
    }
    // getters
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getDob() {
        return this.dob;
    }
    public int getAlbumsPublished() {
        return this.albumsPublished;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDob(String dob) {
        // validate that the dob format is DD-MM-YYYY
        if(dob.matches("\\d{2}-\\d{2}-\\d{4}")) {
            this.dob = dob;
        } else {
            System.out.println("NOt valid date format. Please use DD-MM-YYYY");
        }
        this.dob = dob;
    }
    public void setAlbumsPublished(int albumsPublished) {
        // validate that the parameter is a positive number or zero
        if (albumsPublished >= 0) {
            this.albumsPublished = albumsPublished;
        }
    }
    // setter to all the values at once
    public void setAllValues(String id, String name, String address, String dob, int albumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.albumsPublished = albumsPublished;
    }

    // String representation of the object
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", dob='" + getDob() + "'" +
            ", albumsPublished='" + getAlbumsPublished() + "'" +
            "}";
    }
    
}
