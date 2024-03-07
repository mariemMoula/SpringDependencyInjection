package com.moulaMariem.Implementations;

import com.moulaMariem.Interfaces.IEngine;

public class Vehicle {
    IEngine engine;
    Tyres tyre;
//The bean must include getter and setter methods for the properties.
    public Tyres getTyre()
    {
        return tyre;
    }

    public void setTyre(Tyres tyre)
    {
        System.out.println("tyre instantiated via setter");
        this.tyre = tyre;
    }

    public Vehicle(IEngine engine, Tyres tyre)
    {
        //The bean class must declare a matching constructor with arguments.
        // Otherwise, BeanCreationException will be thrown.
        System.out.println("instantiated via constructor");
        this.engine = engine;
        this.tyre = tyre;
        //We make use of element constructor-arg, with attributes name and ref. ‘Name’ attribute correlates with the constructor argument name given in the Vehicle class definition.
// And ‘ref’ attribute points to the bean reference which can be used for injecting.
//in the xml file: <constructor-arg name="engine" ref="ToyotaBean">
//    </constructor-arg>
//
//    <constructor-arg name="tyre" ref="tyre2Bean">
//</constructor-arg>
    }

    public Vehicle() {}
    public IEngine getEngine()
    {

        return engine;
    }
    public void setEngine(IEngine engine)
    {
        System.out.println("instantiated via setter");
        this.engine = engine;
    }

    @Override
    public String toString()
    {
        return engine + " " + tyre;
    }


}
