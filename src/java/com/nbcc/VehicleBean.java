/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author joe
 */
@Named(value = "vehicleBean")
@Dependent
public class VehicleBean {

    /**
     * Creates a new instance of VehicleBean
     */
    
    private int id;
    private String make;
    private String model;
    private int year;

    //<editor-fold defaultstate="collapsed" desc="Props">
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
//</editor-fold>
    public VehicleBean() {
    }
     public VehicleBean(int id, String make, String model,int year) {
         this.id = id;
         this.make = make;
         this.model = model;
         this.year = year;
    }
     public List<VehicleBean> getInventory(){
     List<VehicleBean>inventory = new ArrayList();
     inventory.add(new VehicleBean(inventory.size() +1,))
     }
}
