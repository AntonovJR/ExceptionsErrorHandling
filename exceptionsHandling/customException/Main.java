package exceptionsHandling.customException;

public class Main {
    public static void main(String[] args) {
       try{
           Student student = new Student("Chavdar", "test@test.com");
       }catch (InvalidPersonNameException ex){
           System.out.println(ex.getMessage());
       }
    }
}
