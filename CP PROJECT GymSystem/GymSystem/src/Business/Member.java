/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author huzaifasuhail   765
 */
public class Member extends Person {
    private String dob;
    private String gender;
    private String type;
    private String extra1;
    private String extra2;

    public Member(int id, String fn, String ln, String ad,
                  String dob, String ph, String gender,
                  String type, String extra1, String extra2) {
        super(id, fn, ln, ad, ph);
        this.dob = dob;
        this.gender = gender;
        this.type = type;
        this.extra1 = extra1;
        this.extra2 = extra2;
    }

    @Override
    public String serialize() {
        return super.serialize() + "," + dob + "," + gender + "," + type + "," + extra1 + "," + extra2;
    }

    @Override
    public void deserialize(String data) {
        super.deserialize(data);
        String[] parts = data.split(",");
        if (parts.length >= 10) {
            dob = parts[5];
            gender = parts[6];
            type = parts[7];
            extra1 = parts[8];
            extra2 = parts[9];
        }
    }
}
