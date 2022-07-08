package ex07_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Thlokomelo Hlomuka";
        String firstName;
        String lastName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
       lastName = custName.substring(spaceIdx+1, custName.length());
       System.out.println(lastName);

    }
}
