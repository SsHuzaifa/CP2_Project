/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author huzaifasuhail
 */
public abstract class Person implements Storable {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String phone;

    public Person(int id, String fn, String ln, String ad, String ph) {
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.address = ad;
        this.phone = ph;
    }

    public int getId() { return id; }

    public void setAddress(String a) { address = a; }
    public void setPhone(String p) { phone = p; }

    @Override
    public String serialize() {
        return id + "," + firstName + "," + lastName + "," + address + "," + phone;
    }

    @Override
    public void deserialize(String data) {
        String[] parts = data.split(",");
        if (parts.length >= 5) {
            id = Integer.parseInt(parts[0]);
            firstName = parts[1];
            lastName = parts[2];
            address = parts[3];
            phone = parts[4];
        }
    }
}
