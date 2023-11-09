

public class Person {
    private String name ="";
    private int age;
    private String numb ="";
    private  String email ="";
    public BirthDate birthDate = new BirthDate();
    public void setName(String name) {
        if(CheckName(name)) // Name Validation
        {
            this.name = name;
            System.out.println("Name: Added");
        }
        else
        {
            System.out.println("Name: InValid");
        }

    }
    public String getName()
    {
        return name;
    }
    public boolean CheckName(String name) // Validation Process
    {
        String regex = "^[A-Za-z]+$";
        if ((name.length() > 0 && name.length() <= 20) && (name.matches(regex))) {
            return true;
        }
        return false;
    }
    public void setAge(int age)
    {
        if(checkAge(age))
        {
            this.age = age;
            System.out.println("Age: Added");
        }
        else
        {
            System.out.println("Age: InValid");
        }
    }
    public boolean checkAge(int age)
    {
        if(age >= 20 && age <= 40)
        {
            return  true;
        }
        return false;
    }
    public int getAge()
    {
        return age;
    }
    public void setNumb(String numb)
    {
        if (checkNumb(numb))
        {
            this.numb = numb;
            System.out.println("Number: Added");
        }
        else {
            System.out.println("Number: Invalid");
        }
    }
    public boolean checkNumb(String numb) {
        for (int i = 0; i < numb.length(); i++) {
            char c = numb.charAt(i);
            if ((numb.length() == 11 ) && (c == '0' || c == '1' || c == '2' || c == '5')) {

                return true;  // Return true if the condition is met
            }
        }
        return false;  // Return false if the condition is not met for all characters
    }
    public String getNumb()
    {
        return numb==null?"no phone number has been added":numb;
    }

    public void setEmail(String email)
    {
        if (checkEmail(email))
        {
            this.email = email;
            System.out.println("Email: Added");
        }
        else {
            System.out.println("Email: Invalid");
        }
    }
    public boolean checkEmail(String email)
    {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
    public String getEmail()
    {
        return email;
    }
    public String toString() {
        return"\nProfile info: \n"+ "Name: " + getName() + "\n"+ "Number: " + getNumb() + "\n" + "Email: " + getEmail() + "\n" + "Age: " + getAge() + "\n" + "BirthDate: " + birthDate.getBirthDate() + "\n";
    }

}
