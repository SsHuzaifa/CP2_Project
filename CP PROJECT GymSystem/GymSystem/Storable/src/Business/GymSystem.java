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

public class GymSystem implements Storable {

    static GymSystem loadData(String gymdatatxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private int nextEmpId = 1;
    private int nextMemId = 1;

    public Employee addEmployee(String fn, String ln, String ad,
                                String ph, double sal, boolean trainer) {
        Employee e = new Employee(nextEmpId++, fn, ln, ad, ph, (int) sal, trainer);
        employees.add(e);
        return e;
    }

    public Member addMember(String fn, String ln, String ad, String dob,
                            String ph, String gender, String type,
                            String extra1, String extra2) {
        Member m = new Member(nextMemId++, fn, ln, ad, dob, ph, gender, type, extra1, extra2);
        members.add(m);
        return m;
    }

    public Employee findEmployee(int id) {
        for (Employee e : employees) if (e.getId() == id) return e;
        return null;
    }

    public Member findMember(int id) {
        for (Member m : members) if (m.getId() == id) return m;
        return null;
    }

    public void assignMemberToTrainer(int memberId, int trainerId) {
        Member m = findMember(memberId);
        Employee t = findEmployee(trainerId);
        if (m != null && t != null && t.isTrainer()) {
            for (Employee e : employees) if (e.isTrainer()) e.removeMember((Member) (java.lang.reflect.Member) m);
            t.addMember((Member) (java.lang.reflect.Member) m);
        }
    }

    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        for (Employee e : employees) sb.append("EMP:").append(e.serialize()).append("\n");
        for (Member m : members) sb.append("MEM:").append(m.serialize()).append("\n");
        return sb.toString();
    }

    @Override
    public void deserialize(String data) {
        String[] lines = data.split("\n");
        for (String line : lines) {
            if (line.startsWith("EMP:")) {
                Employee e = new Employee(0,"","","","",0,false);
                e.deserialize(line.substring(4));
                employees.add(e);
            } else if (line.startsWith("MEM:")) {
                Member m = new Member(0,"","","","","","","","","");
                m.deserialize(line.substring(4));
                members.add(m);
            }
        }
    }

    void updateMember(int mid, String ad, String ph) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void updateEmployee(int eid, String ad, String ph) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void removeMemberFromTrainer(int mid, int eid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteEmployee(int eid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteMember(int mid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<Member> getMembersOfTrainer(int eid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void saveData(String gymdatatxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
