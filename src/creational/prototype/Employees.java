package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    private List<String> empList;
    public Employees(){
        empList = new ArrayList<>();
        //costly operation of loading the data from db everytime an object is created
        loadEmployees();
    }
    public Employees(List<String> list){
        empList = list;
    }

    @Override
    public Employees clone() throws CloneNotSupportedException {
        /*Normal clone would take the address of the currentList
         and assign it to the cloned copy as well.
        * as it might be modified
        Employees employees = new Employees();
        Employees employees_1 = employees.clone();
        Employees employees_2 = employees.clone();

        employees_2.getEmpList().add("Beta");

        employees_1.getEmpList().remove("Sreeni");

        System.out.println(employees.getEmpList() +" "+employees_1.getEmpList()+" "+employees_2.getEmpList());
        output:
        [Srinivas, Jith, Jitendra, Beta] [Srinivas, Jith, Jitendra, Beta] [Srinivas, Jith, Jitendra, Beta]

        */
        //return (Employees) super.clone();
        //so deep copy the list
        List<String> emps = new ArrayList<>();
        for(String emp:getEmpList()){
            emps.add(emp);
        }
        return new Employees(emps);
        /*
        * output for same code above
        * [Sreeni, Srinivas, Jith, Jitendra] [Srinivas, Jith, Jitendra] [Sreeni, Srinivas, Jith, Jitendra, Beta]
        * */
    }

    public List<String> getEmpList(){
        return empList;
    }

    public void loadEmployees(){
        System.out.println("Imagine this loads from db...");
        empList.add("Sreeni");
        empList.add("Srinivas");
        empList.add("Jith");
        empList.add("Jitendra");
    }
}
