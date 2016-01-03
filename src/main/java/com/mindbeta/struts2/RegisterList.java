package com.mindbeta.struts2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * List all registered users from PostgreSQL.
 * @author Kirk Harr
 */
public class RegisterList {
    ArrayList<Person> list = new ArrayList<Person>();

    /**
     * The list of Person objects that have already been registered.
     * @return The list of Person objects that are already registered.
     */
    public ArrayList<Person> getList(){
        return list;
    }

    /**
     * Update The list of Person objects that have already been registered.
     * @param list The list of Person objects that have already been registered.
     */
    public void setList(ArrayList<Person> list){
        this.list = list;
    }

    /**
     * Lists the registered Person objects from the data layer in PostgreSQL.
     * @return Status code of the list process, "success" on a successful database connection.
     */
    public String execute(){
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://172.17.0.4/struts2?user=postgres";
            Connection con= DriverManager.getConnection(url);
            PreparedStatement ps = con.prepareStatement("select * from register");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Person person = new Person();
                String firstName;
                String lastName;
                String[] fullName = rs.getString(1).split("\\s+");
                firstName = fullName[0];
                lastName = fullName[1];
                person.setFirstName(firstName);
                person.setLastName(lastName);
                int age = rs.getInt(2);
                person.setAge(age);
                String email = rs.getString(3);
                person.setEmail(email);
                list.add(person);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }


}
