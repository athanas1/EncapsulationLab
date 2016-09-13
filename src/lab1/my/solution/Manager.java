/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

/**
 *
 * @author athanas1
 */
public class Manager {
    //my way
    // Creating
     public Employee employee;
    //have to get info on new employee 
    public void orientEmployee(String firstName, String lastName, String ssn){
    Employee e = new Employee();
    e.setFirstName(firstName);
    e.setLastName(lastName);
    e.setSsn(ssn);
    e.startJob("100");
    employee = e;
    };
    
    public String getStatus(){
        return employee.getStatus();
    }
    
    //instructor way
    //private static int cubeId;
    
    /*
    public void orientNewEmployee(Employee employee){
        employee.completeEmployeeOrientation("A" + cubeId++);
    }
    */
}
    

