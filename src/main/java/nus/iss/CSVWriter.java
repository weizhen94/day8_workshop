package nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {

public static final String COMMA_DELIMITER = ","; 
public static final String NEWLINE_SEPARATOR = "\n"; 
private static final String FILE_HEADER = "staffNo, fullName, department, role, emailAddress, salary";  

public List <Employee> employees = null; 


    public List<Employee> generateEmployees(){
    employees = new ArrayList<Employee>(); 

    //create some employees
    Employee emp1 = new Employee("12345", "darryl ng", "ss", "lecturer", "darryl@nus.edu", 20000); 
    Employee emp2 = new Employee("23456", "thomas eng", "s", "lecturer", "thomas@nus.edu", 10000);
    Employee emp3 = new Employee("00434", "gab tan", "ssa", "lecturer", "gab@nus.edu", 21000);

    employees.add(emp1); 
    employees.add(emp2); 
    employees.add(emp3);
    
    return employees; 
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName); 

        //write FILE_HEADER to CSV
        fw.append(FILE_HEADER.toString()); 
        fw.append(NEWLINE_SEPARATOR); 

        //read records row by row and write it using fw.append()
        for(Employee e : employees){
            fw.append(e.getStaffNo()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getFullName()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getDepartment()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getRole()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getEmailAddress()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(String.valueOf(e.getSalary())); 
            fw.append(NEWLINE_SEPARATOR); 

        }

        fw.flush(); 
        fw.close(); 
        
    }
   

    
    
}
