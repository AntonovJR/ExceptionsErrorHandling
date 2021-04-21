package exceptionsHandling.customException;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
       setName(name);
       setEmail(email);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(!isValidName(name)){
            throw new InvalidPersonNameException("Student name cannot " +
                    "contain non alphabetic symbols");
        }
        this.name = name;
    }

    private boolean isValidName(String name) {
        for (int i = 0; i <name.length() ; i++) {
            char symbol = name.charAt(i);
            if(!Character.isAlphabetic(symbol)){
                return false;
            }
        }
        return true;

    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
