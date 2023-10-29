

public class Person {
    private String name;
    private int age;
    private  String email;
    private String phoneNumb;

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

}
