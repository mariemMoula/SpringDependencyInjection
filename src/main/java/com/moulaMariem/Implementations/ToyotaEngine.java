package com.moulaMariem.Implementations;

import com.moulaMariem.Interfaces.IEngine;
// Class ToyotaEngine implements the interface and its reference is provided in the bean-configuration file mapped
// to one of Vehicle class’s properties.
public class ToyotaEngine implements IEngine {
    String company;
    double cost;
    //The bean must include getter and setter methods for the properties.
    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        cost = this.cost;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    @Override
    public String importOrigin()
    {
        return "Japan";
    }

    @Override
    public double cost()
    {
        return cost;
    }
    //We make use of property element to provide the ‘name’ of the property
    // and the ‘value’ for the propert
    //from the xml file : <property name="company" value="Toyota">
    //        </property>
    //
    //        <property name="cost" value="300000.00">
    //        </property>
    @Override
    public String toString()
    {
        return "This is Engine object from: "
                + company;
    }
}
