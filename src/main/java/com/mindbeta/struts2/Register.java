package com.mindbeta.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Acts as a controller to handle actions
 * related to registering a user.
 * @author Kirk Harr
 *
 */
public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;

    /**
     * Struts method for completing the registration of a person.
     * @return The string which represents either the success or failure of the registration.
     * @throws Exception An error during the registration process.
     */
    public String execute() throws Exception {

        //call Service class to store personBean's state in database
        int i=RegisterDAO.save(this);
        if(i > 0) {
            return SUCCESS;
        }
        return ERROR;

    }

    /**
     * Completes input validation for each form field.
     */
    public void validate(){

        if ( personBean.getFirstName().length() == 0 ){

            addFieldError( "personBean.firstName", "First name is required." );

        }


        if ( personBean.getEmail().length() == 0 ){

            addFieldError( "personBean.email", "Email is required." );

        }

        if ( personBean.getAge() < 18 ){

            addFieldError( "personBean.age", "Age is required and must be 18 or older" );

        }


    }

    /**
     * Retrieves the Java bean containing the Person object.
     * @return The Person object.
     */
    public Person getPersonBean() {

        return personBean;

    }

    /**
     * Sets the Person object to be contained in the java bean.
     * @param person The Person object.
     */
    public void setPersonBean(Person person) {

        personBean = person;

    }

}
