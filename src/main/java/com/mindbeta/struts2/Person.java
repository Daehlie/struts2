package com.mindbeta.struts2;

/**
 * Struts2 Model for a Person
 * @author Kirk Harr
 */
public class Person
{
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age)
    {
        this.age = age;
    }


    public String toString()
    {
        return "First Name: " + getFirstName() + "\n" + " Last Name:  " + getLastName() + "\n" +
                " Email:      " + getEmail() + "\n" + " Age:      " + getAge() ;
    }
}