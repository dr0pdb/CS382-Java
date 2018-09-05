class Employee
{
	String name;
	int age;
	int salary;

	Employee(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
    public boolean equals(Object obj)
    {
	    if(this == obj)
	    {	    	
	        return true;
	    }
         
        if(obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
         
        // type casting.
        Employee emp = (Employee) obj;

        return (emp.name == this.name && emp.age == this.age && emp.salary == this.salary);
    }

    @Override
    public String toString()
    {
    	return ("Name: " + this.name + ", Age: " + Integer.toString(this.age) + ", Salary: " + Integer.toString(this.salary));
    }
}

public class Assignment_8_3_1601cs41 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Saurav", 20, 100000);
		Employee emp2 = new Employee("Vatsa", 20, 2000000);	

		if(emp1.equals(emp2))
		{
            System.out.println("Both Objects are equal. ");
		}
        else
        {
            System.out.println("Both Objects are not equal. ");
        }

        System.out.println(emp1.toString());
    	System.out.println(emp2.toString());
	}	
}