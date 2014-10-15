//Alec Louck
package lab7part1;

class Student
{
  private String SID;    // ID number
  private String name;
  /**
  * Create a student with default settings for detail information.
  */
  Student()
  {
    SID = "(unknown ID)";
    name = "No Name";
  }
  /**
  * Create a student with given name, year of birth and student ID
  */
  Student(String name, String studentID)
  {
    SID = studentID;
    this.name = name;
  }
  /**
  * Return the student ID of this student.
  */
  public String getStudentID()
  {
    //YOUR CODE HERE
      return SID;
  }
  /**
  * Set a new name for this person.
  */
  public void setName(String name)
  {
    name = "Joseph";
  }
  /**
  * Return the name of this person.
  */
  public String getName()
  {
    //YOUR CODE HERE
      return name;
  }
  /**
  * Return a string representation of this object.
  */
  public String toString()
  {
      System.out.println(super.toString() +
    "Student: "+ name +"\n" +
    "Student ID: " + SID + "\n");
    return super.toString() +
    "Student: "+ name +"\n" +
    "Student ID: " + SID + "\n";
  }
  
}