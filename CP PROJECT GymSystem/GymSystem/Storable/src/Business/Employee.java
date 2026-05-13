/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author huzaifasuhail
 */
import java.util.ArrayList;

public class Employee extends Person {
    private double salary;
    private boolean isTrainer;
    private ArrayList<Member> members;

    public Employee(int id, String fn, String ln, String ad,
                    String ph, double sal, boolean trainer) {
        super(id, fn, ln, ad, ph);
        this.salary = sal;
        this.isTrainer = trainer;
        this.members = new ArrayList<Member>(); // always initialized
    }

    public boolean isTrainer() {
        return isTrainer;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void addMember(Member m) {
        if (isTrainer && !members.contains(m)) {
            members.add(m);
        }
    }

    public void removeMember(Member m) {
        if (isTrainer) {
            members.remove(m);
        }
    }

    @Override
    public String serialize() {
        return super.serialize() + "," + salary + "," + isTrainer;
    }

    @Override
    public void deserialize(String data) {
        super.deserialize(data);
        String[] parts = data.split(",");
        if (parts.length >= 7) {
            salary = Double.parseDouble(parts[5]);
            isTrainer = Boolean.parseBoolean(parts[6]);
        }
    }
}