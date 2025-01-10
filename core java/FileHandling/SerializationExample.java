package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private String name;
    private int age;
    private transient String password;  
    public Employee(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, "password123");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) 
        {
            out.writeObject(emp);
            System.out.println("Employee object serialized and saved to employee.ser");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

         try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("Employee object deserialized from employee.ser");
            System.out.println(deserializedEmp);  
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}