/*Create a Person class that includes fields for last name, first name, and zip code.
Include a default constructor that initializes last name, first name, and zip code to “X” if no arguments are supplied.
Also include a display function.
Write a main() function that instantiates and displays two Person objects: one that uses the default values,
 and one for which you supply your own values. Save the file as Person.java.
 You will use the Person class in other assignments later.*/

public class Person{
  protected String lastName;
  protected String firstName;
  protected String zipCode;

  public Person{
    lastName = "";
    firstName = "";
    zipCode = "";
  }

  public Person(String empLastName, String empFirstName, String empZipCode) {
    setData(empLastName, empFirstName, empZipCode);
  }

  public void setData(String empLastName, String empFirstName, String empZipCode) {
    if(empLastName == ""){
      lastName = "X";
    }
    else{
      lastName  = empLastName;
    }
    if(empFirstName == ""){
      firstName = "X";
    }
    else{
      firstName = empFirstName;
    }
    if(empZipCode == ""){
      zipCode = "X";
    }
    else{
      zipCode = empZipCode;
    }
  }

  public void printInfo() {
    System.out.println("Name: " lastName + ", " firstName);
    System.out.println("Zipcode: " + zipCode);
  }
}
public class PersonMain{
  public static void main(String[] args) {
    JohnSmith.Person("Smith", "John", "12345");
    Default.Person("", "", "");

    JohnSmith.printInfo();
    Default.printInfo();
  }
}
