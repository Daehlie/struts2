package com.mindbeta.struts2;

import java.sql.*;
import java.util.Properties;
/**
 * Store Register objects into the data layer in Postgresql.
 * @author Kirk Harr
 */
public class RegisterDAO {
    public static int save(Register r){
        int status = 0;
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://172.17.0.4/struts2?user=postgres";
            Connection con=DriverManager.getConnection(url);

            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?)");
            Person p = r.getPersonBean();
            ps.setString(1, p.getFirstName() + " " + p.getLastName());
            ps.setInt(2, p.getAge());
            ps.setString(3, p.getEmail());
            status=ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
