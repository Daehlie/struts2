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

    /**
     * Retrieves the first name of the person.
     * @return The first name of the person.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the first name of the person.
     * @param firstName The first name of the person.
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the person.
     * @return The last name of the person.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the last name of the person.
     * @param lastName  The last name of the person.
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Sets the email of the person.
     * @return The email address of the person.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Retrieves the email of the person.
     * @param email The email address of the person.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Retrieves the age of the person.
     * @return The age of the person.
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Sets the age of the person.
     * @param age The age of the person.
     */
    public void setAge( int age)
    {
        this.age = age;
    }

    /**
     * A string representation of the person.
     * @return String representation for the person.
     */
    public String toString()
    {
        return "First Name: " + getFirstName() + "\n" + " Last Name:  " + getLastName() + "\n" +
                " Email:      " + getEmail() + "\n" + " Age:      " + getAge() ;
    }
}