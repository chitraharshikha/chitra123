package com.data;

public class EmployeeInfo extends Company{
             @Override
            public void id() {
             System.out.println("1234");
            }
             @Override
            public void id(int id) {
           System.out.println(id);
            		
            }
public static void main(String[]args) {
	EmployeeInfo e=new EmployeeInfo();
	e.id();
	e.id(98475);
	e.name();
}
}

