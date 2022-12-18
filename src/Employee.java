public class Employee {
    private static int Id;
    private String Surname;
    private String Name;
    private String Middlename;
    private int Department;
    private int Salary;

    public Employee(String surname, String name, String middlename, int department, int salary) {
        Id++;
        Surname = surname;
        Name = name;
        Middlename = middlename;
        Department = department;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Id: " + ((Id++) - 10) + " Фамилия: " + Surname + " Имя: " + Name +  " Отчество: " + Middlename + " Отдел: " + Department + " Зарплата: " + Salary;
    }

    public int getId() {
        return this.Id;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getName() {
        return this.Name;
    }

    public String getMiddlename() {
        return this.Middlename;
    }

    public int getDepartment() {
        return this.Department;
    }

    public int getSalary() {
        return this.Salary;
    }



    public void setSurname(String surname) {
        this.Surname = surname;
    }

   public void setName(String name) {
        this.Name = name;
    }

    public void setMiddlename(String middlename) {
        this.Middlename = middlename;
    }

    public void setDepartment(int department) {
        this.Department = department;
    }
    public void setSalary(float salary) {
        this.Salary = (int) salary;
    }


}