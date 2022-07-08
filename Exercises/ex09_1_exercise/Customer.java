package ex09_1_exercise;


public class Customer {
    public String name;
    public String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    //Access modifiers changed to public methods so that fields can be read or chnaged
 
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
        
    //ssn is read but not modified
    public String getSSN(){
        return ssn;
    }
}
