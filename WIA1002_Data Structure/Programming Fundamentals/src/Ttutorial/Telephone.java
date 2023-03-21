package Ttutorial;
/*1. Write the definition of a class Telephone that contains:
• An instance variable areaCode
• An instance variable number
• A static variable numberOfTelephoneObject that keeps track of the number of Telephone
objects created
• A constructor that accepts two arguments used to initialize the two instance variables
• The accessor and mutator methods for areaCode and number
• A method makeFullNumber that does not accept any argument, concatenates areaCode
and number with a dash in between, and returns the resultant String.
 Write the statements to:
• Instantiate 5 Telephone objects and store them in an array. Iterate through the array to
print the full number of the 5 Telephone objects on the console. Your output should look
as below:
03-79676300
03-79676301
03-79676302
03-79676303
03-79676304
*/
public class Telephone {
    private String areaCode, number;
    static public int numberOfTelephoneObject;
    public Telephone(String areaCode, String number) {
        numberOfTelephoneObject++;
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String makeFullNumber(){
        return areaCode + "-" + number;
    }


    public static void main(String[] args) {
        Telephone [] telephones = new Telephone[5];
        for (int i = 0; i < telephones.length; i++) {
            Telephone telephone = new Telephone("03", "7967630"+i);
            telephones[i] = telephone;
            System.out.println(telephone.makeFullNumber());
        }

    }
}
