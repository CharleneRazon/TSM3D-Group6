

 import java.util.Scanner;

class E_Form {  

    

               int emp_id, salary;  

               String name, address, department, email;  

 

 

               public int getEmp_id() {  

                              return emp_id;  

               }  

               public void setEmp_id(int emp_id) {  

                              this.emp_id = emp_id;  

               }  

               public int getSalary() {  

                              return salary;  

               }  

               public void setSalary(int salary) {  

                              this.salary = salary;  

               }
	public String getName() {  

                              return name;  

               }  

               public void setName(String name) {  

                              this.name = name;  

               }  

               public String getAddress() {  

                              return address;  

               }  

               public void setAddress(String address) {  

                              this.address = address;  

               }  

               public String getDepartment() {  

                              return department;  

               }
public void setDepartment(String department) {  

                              this.department = department;  

               }  

               public String getEmail() {  

                              return email;  

               }  

               public void setEmail(String email) {  

                              this.email = email;  

               }  

 

 

               @Override  

               public String toString() {  

                              return "\Employee [Employee = " + emp_id + ", \salary = " + salary + ", \name = " + name + ", \address = " + address  

            + ", \department = " + department + ", \email = " + email ;  

    }

class Employee{  

    

    public static void main(String args[]) {  

                              Scanner sc = new Scanner(System.in);

                              

                              System.out.print("Enter employee ID: ");

                              int emp_id = sc.nextInt();

                              System.out.print("Enter employee fullname: ");

                              String emp_id1 = sc.nextLine();

                              String fullname = sc.nextLine();

                              System.out.print("Enter department: ");

                              String dept = sc.nextLine();

                              System.out.print("Enter salary: ");

                              int salary = sc.nextInt();

                              System.out.print("Enter address: ");

                              String emp_id2 = sc.nextLine();

                              String address = sc.nextLine();

                              System.out.print("Enter email address: ");

                              String email = sc.nextLine();
E_Form emp = new E_Form();  

        

        emp.setEmp_id(emp_id);  

        emp.setName(fullname);  

        emp.setDepartment(dept);  

        emp.setSalary(salary);  

        emp.setAddress(address);  

        emp.setEmail(email);  

        System.out.println(emp);  

 

        

        int sal = emp.getSalary();  

        int increment = 0;





        if ((sal >=1000) && (sal <=1500))  

        {  

            

            increment += (sal * 2)/100;  

            sal = sal+increment;  

 

            emp.setSalary(sal);  

            System.out.println("\ Salary is incremented \");  

            System.out.println(emp);  

 

        }else if ((sal >=1500) && (sal <=20000)){  

            

            increment += (sal * 5)/100;  

            sal = sal+increment;  

 

            emp.setSalary(sal);  

            System.out.println("\ Salary is incremented ");  

            System.out.println(emp);  

        }else {  

            System.out.println("\ Salary is not incremented ");  

            System.out.println(emp);  

        }         

    }  

}
