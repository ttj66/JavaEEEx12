/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
/**
 *
 * @author joe
 */
@Named(value="registrationBean")
@ManagedBean
public class RegistrationBean implements Serializable {
    
    public RegistrationBean(){}

    public String getSalutation() {
        return salutation;
    }

    //<editor-fold defaultstate="collapsed" desc="Props">
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
//</editor-fold>
    private String salutation;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    
}
