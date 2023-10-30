

public class Person {
    private String name ="";
    private int age;
    private  String email ="";
    private String Numb ="";

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
        if (Numb.length() == 11)
        {
            for (int i = 2; i < 3; i++) {
                char c = Numb.charAt(i);
                if (c == '0' || c == '1' || c == '2' || c == '5') {
                    this.Numb = Numb;
                } else {
                    System.out.println("Invalid");
                }

            }
        }
        else
        {
            System.out.println("Under 11 Digits");
        }
    }
    public String getNumb()
    {
        return Numb;
    }

}
