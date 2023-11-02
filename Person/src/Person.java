

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
        if(checkAge(age))
        {
            this.age = age;
            System.out.println("Valid");
        }
        else
        {
            System.out.println("inAppropriate");
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
            System.out.println("Valid");
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
        return numb==null?"no phone number has been added":numb;
    }

    public void setEmail(String email)
    {
        if (checkEmail(email))
        {
            this.email = email;
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
    public boolean checkEmail(String email)
    {
        String regex = "[a-zA-z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        return email.matches(regex);
    }
    public String getEmail()
    {
        return email;
    }

}
