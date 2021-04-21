package exceptionsHandling.validPerson;

public class Main {
    public static void main(String[] args) {
       try {
           Person p = new Person("Sasho", "", 27);
       }catch (IllegalArgumentException ex){
           System.out.println("Exception throw: "+ex.getMessage());
       }

    }
}
