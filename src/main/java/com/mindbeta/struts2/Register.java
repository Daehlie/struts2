package com.mindbeta.struts2;

/**
 * Created by daehlie on 11/10/15.
 */
import com.opensymphony.xwork2.ActionSupport;

/**
 * Acts as a controller to handle actions
 * related to registering a user.
 * @author Kirk harr
 *
 */
public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;


    public String execute() throws Exception {

        //call Service class to store personBean's state in database
        int i=RegisterDAO.save(this);
        if(i > 0) {
            return SUCCESS;
        }
        return ERROR;

    }

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


    public Person getPersonBean() {

        return personBean;

    }

    public void setPersonBean(Person person) {

        personBean = person;

    }

}
