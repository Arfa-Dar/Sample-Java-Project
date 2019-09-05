package A1;

import java.util.ArrayList;
import java.util.Iterator;
                                    // Question# 1
public class Employee {
    ArrayList<String> benefits= new ArrayList<String>();
    void CalculatePay(){
        System.out.println("Calculating employee's pay");
    }

}

class Intern extends Employee{
    Intern()
    {
        addbenefitsintern();
    }
    private void addbenefitsintern() {
        if (benefits.isEmpty() == true) {
            benefits.add("Intern benefits");
        }
    }
    public void CalculatePay()
    {
        System.out.println("Calculating Intern's Pay");
    }
}

class Software_Dev extends Intern{
    Software_Dev()
    {
        addbenefitsSD();
    }
    private void addbenefitsSD()
    {
            benefits.add("Dev benefits");
    }
    public void CalculatePay()
    {
        System.out.println("Calculating Software Developer's Pay");
    }

}

class Project_Mng extends Software_Dev{
    Project_Mng()
    {
        addbenefitsPM();
    }
    private void addbenefitsPM() {
            benefits.add("Manager benefits");
        }
    public void CalculatePay()
    {
        System.out.println("Calculating Project Manager's Pay");
    }
}

class Main{
    public static void main(String[] args)
    {
        Employee A= new Project_Mng();
        Software_Dev B= new Software_Dev();
        Intern C= new Intern();
        for(int i=0;i<A.benefits.size();i++)
        {
            System.out.println(A.benefits.get(i));
        }
        ArrayList<Employee> E= new ArrayList<Employee>();
        E.add(A);
        E.add(B);
        E.add(C);
        Iterator r=  E.iterator();
        while (r.hasNext())
        {
            Employee R= (Employee) r.next();
            R.CalculatePay();
        }


    }
}





