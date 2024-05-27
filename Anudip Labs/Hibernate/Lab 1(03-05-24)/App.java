package com.demo.JPA_Hibernate_CRUD;


public class App 
{
    public static void main( String[] args )
    {
    	CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        crudOperations.removeEntity();
    }
}
