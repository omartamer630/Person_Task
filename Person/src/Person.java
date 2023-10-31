

public class Person {
    private String name ="";
    private int age;
    private String Numb ="";
    private  String email ="";
    public void setName(String name) {
        if(CheckName(name)) // Name Validation
        {
            this.name = name;
            System.out.println("Valid");
        }
        else
        {
            System.out.println("InValid");
        }

    }
    public String getName()
    {
        return name;
    }
    public boolean CheckName(String name) // Validation Process
    {
        return name.length() > 0 && name.length() <= 20;
    }
    public void setAge(int age)
    {
        if(age >= 20 && age <= 40)
        {
            this.age = age;
            System.out.println("Appropriate");
        }
        else
        {
            System.out.println("inAppropriate");
        }
    }
    public int getAge()
    {
        return age;
    }
    public void setNumb(String Numb)
    {
        if (checkNumb(Numb))
        {
            this.Numb = Numb;
        }
        else {
            System.out.println("Invalid");
        }
    }
    public boolean checkNumb(String Numb) {
        for (int i = 0; i < Numb.length(); i++) {
            char c = Numb.charAt(i);
            if ((Numb.length() == 11 ) && (c == '0' || c == '1' || c == '2' || c == '5')) {
                return true;  // Return true if the condition is met
            }
        }
        return false;  // Return false if the condition is not met for all characters
    }
    public String getNumb()
    {
        return Numb==null?"no phone number has been added":Numb;
    }

    public void setEmail(String email)
    {
        if (checkEmail(email))
        {
            this.email = email;
        }
        else {
            System.out.println("Invalid");
        }
    }
    public boolean checkEmail(String email)
    {
        String regex = "[a-zA-z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean checker = email.matches(regex);
        return checker;
    }
    public String getEmail()
    {
        return email;
    }

}
