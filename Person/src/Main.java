import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        Person obj = new Person();
        BirthdateValidator birth = new BirthdateValidator();
        System.out.println("1 -> New Profile \n 2 -> Edit Your Profile \n 3 -> Delete Your profile");
        String choice = Sc.next();
        String name = null, Birth = null, Numb = null, email= null;
        int age = 0;
        switch (choice) {
            case "1":
                System.out.println("Enter your name :");
                name = Sc.next();
                obj.setName(name);
                System.out.println("Enter Your age :");
                age = Sc.nextInt();
                obj.setAge(age);
                System.out.println("Enter Your Birthdate (YYYY/MM/DD) :");
                Birth = Sc.next();
                birth.setBirthDate(Birth);
                System.out.println("Enter Your Number :");
                Numb = Sc.next();
                obj.setNumb(Numb);
                System.out.println("Enter Your Email :");
                email = Sc.next();
                obj.setEmail(email);
                break;
            case "2":
                if((name != null) && (Numb != null) && (Birth != null) && (email != null) &&(age != 0)){
                    System.out.println("Enter what you want to edit (name , number , birthdate , email , age ).");
                    String choice_2 = Sc.next();
                    boolean exit = true;
                    while(exit)
                    {
                        switch (choice_2) {
                            case "name":
                                System.out.println("Enter your new name :");
                                name = Sc.next();
                                obj.setName(name);
                                break;
                            case "number":
                                System.out.println("Enter your new number :");
                                Numb = Sc.next();
                                obj.setNumb(Numb);
                                break;
                            case "birthdate":
                                System.out.println("Enter your new BirthDate :");
                                Birth = Sc.next();
                                birth.setBirthDate(Birth);
                                break;
                            case "email":
                                System.out.println("Enter your new email :");
                                email = Sc.next();
                                obj.setEmail(email);
                                break;
                            case "age":
                                System.out.println("Enter your new age :");
                                age = Sc.nextInt();
                                obj.setAge(age);
                                break;
                        }
                        System.out.println("Want To edit anything else ? (Type 'true' to reedit):");
                        exit = Sc.nextBoolean();
                    }
                }
                else {
                    System.out.println("You Don't have any Profile.");
                }
                break;
            case "3":
                System.out.println("Are you Sure? (Type 'yes' to confirm):");
                String confirmation = Sc.next();
                if (confirmation.equalsIgnoreCase("yes")) {
                    obj.setName(null);
                    obj.setAge(0);
                    birth.setBirthDate(null);
                    obj.setNumb(null);
                    obj.setEmail(null);
                    System.out.println("Profile deleted.");
                } else {
                    System.out.println("Deletion canceled.");
                }
                break;
        }
    }
}
