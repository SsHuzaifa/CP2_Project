/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author ABC
 */
public class PolySttaf extends Member {
        private String Position;
    private String department;

    public PolySttaf(String Position, String department, int id, String fn, String ln, String ad, String dob, String ph, String gender, String type, String extra1, String extra2) {
        super(id, fn, ln, ad, dob, ph, gender, type, extra1, extra2);
        this.Position = Position;
        this.department = department;
    }

    public String getPosition() {
        return Position;
    }

    public String getDepartment() {
        return department;
    }

        @Override
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }
    

}
