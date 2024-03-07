package com.moulaMariem;

import com.moulaMariem.Implementations.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String a[]) {
        ApplicationContext rootctx
                = new ClassPathXmlApplicationContext(
                "springContext.xml");
//************************************************************************************//
        //we are injecting ToyotaBean reference into the IEngine reference in Vehicle class constructor-arg,
        // where IEngine is an interface and needs an implementing class reference for bean injection.
        Vehicle obj1
                = (Vehicle) rootctx
                .getBean("InjectwithConstructor");
//InjectwithConstructor bean makes use of element constructor-arg, with attributes name and ref. ‘Name’ attribute correlates with the constructor argument name given in the Vehicle class definition.
// And ‘ref’ attribute points to the bean reference which can be used for injecting.
// <constructor-arg name="engine" ref="ToyotaBean">
//    </constructor-arg>
//***************************************************************************************//
        Vehicle obj2 = (Vehicle) rootctx
                .getBean("InjectwithSetter");
//InjectwithSetter makes use of property element to provide the ‘name’ of the property and the ‘value’ for the property.
// In place of value attribute ‘ref’ can be used to denote a reference to a bean.
//<property name="engine" ref="ToyotaBean">
//        </property>
//*********************************************************************************************//
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }
}
