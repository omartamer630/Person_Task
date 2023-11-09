import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        Person userProfile = new Person();
        ArrayList<Person> data = new ArrayList<>();

        String name = "", Birth = "", Numb = "", email= "";
        int age = 0;
        String confirm;
        boolean repeat = true;
        while(repeat){
       System.out.println(" 0 ->Exit Menu \n 1 -> New Profile \n 2 -> Edit Your Profile \n 3 -> Delete Your profile");
        String userSetting = Sc.next();

        if (userSetting.equals("1")) {
            data.add(newProfile());
            System.out.println(data);
            System.out.println("Returning to main menu.");
            continue;
        } else if (userSetting.equals("2")) {
            if (data.isEmpty()) {
                    System.out.println("Currently, you don't have any profiles. If you'd like to create a new profile, please enter '[yes]/n'.");
                    confirm = Sc.next();
                if (confirm.equals("no")) {

                    System.out.println("No new profile created. Exiting...");
                    repeat = false;
                } else {

                    System.out.println("Returning to main menu.");
                    continue;
                }
            }
            else{
                System.out.println(" 1 ->New Name , 2 ->New Number , 3 ->New Email , 4 ->New Age , 5 ->New BirthDate");
                int editChoice = Sc.nextInt();
                editProfile(editChoice, data.get(0)); // Assuming you want to edit the first profile
                System.out.println(data);
            }

        } else if ((userSetting.equals("3")) && (!data.isEmpty())) {
            deleteProfile(data);
            System.out.println("Returning to main menu.");
            continue;
        } else if(userSetting.equals("0")){
        
            System.out.println("Exiting...");
            repeat = false;
        
        }else {
            System.out.println("Invalid Option!"); // print error message.
        }
    }

    }

    private static Person newProfile () {
        
        Scanner Sc = new Scanner(System.in);
        Person userProfile = new Person();

        System.out.println("Enter your name: "); //Name
        String name = Sc.next();

        while (userProfile.CheckName(name) == false) {
            System.out.println("Re-enter Correctly: ");
            name = Sc.next();
        }
        
        userProfile.setName(name);

        System.out.println("Enter your  number :"); //Number
        String number = Sc.next();

        while (userProfile.checkNumb(number) == false) {
            System.out.println("Re-enter Correctly: ");
            number = Sc.next();
        }

        userProfile.setNumb(number);

        System.out.println("Enter your  email :"); //Email
        String email = Sc.next();

        while (userProfile.checkEmail(email) == false){
            System.out.println("Re-enter Correctly: ");
            email = Sc.next();
        }

        userProfile.setEmail(email);

        System.out.println("Enter your  age :"); //Age
        int age = Sc.nextInt();

        while (userProfile.checkAge(age) == false){
            System.out.println("Re-enter Correctly: ");
            age = Sc.nextInt();
        }

        userProfile.setAge(age);

        System.out.println("Enter your new BirthDate (YYYY/MM/DD) :"); //BirthDate
        String Birth = Sc.next();

        while (userProfile.birthDate.checkBirth(Birth) == false){
            System.out.println("Re-enter Correctly: ");
            Birth = Sc.next();
        }

        userProfile.birthDate.setBirthDate(Birth);

        return userProfile;
    }
    private static void editProfile(int userEditchoice, Person userProfile) {
        Scanner Sc = new Scanner(System.in);
        int editChoice;
        while (userEditchoice != 0) {
            if (userEditchoice == 1) {
                System.out.println("Enter your new name: ");
                String name = Sc.next();
                while (!userProfile.CheckName(name)) {
                    System.out.println("Re-enter Correctly: ");
                    name = Sc.next();
                }
                userProfile.setName(name);
            } else if (userEditchoice == 2) {
                System.out.println("Enter your new number :");
                String number = Sc.next();
                while (!userProfile.checkNumb(number)) {
                    System.out.println("Re-enter Correctly: ");
                    number = Sc.next();
                }
                userProfile.setNumb(number);
            } else if (userEditchoice == 3) {
                System.out.println("Enter your new email :");
                String email = Sc.next();
                while (!userProfile.checkEmail(email)) {
                    System.out.println("Re-enter Correctly: ");
                    email = Sc.next();
                }
                userProfile.setEmail(email);
            } else if (userEditchoice == 4) {
                System.out.println("Enter your new age :");
                int age = Sc.nextInt();
                while (!userProfile.checkAge(age)) {
                    System.out.println("Re-enter Correctly: ");
                    age = Sc.nextInt();
                }
                userProfile.setAge(age);
            } else if (userEditchoice == 5) {
                System.out.println("Enter your new BirthDate (YYYY/MM/DD) :");
                String Birth = Sc.next();
                while (!userProfile.birthDate.checkBirth(Birth)) {
                    System.out.println("Re-enter Correctly: ");
                    Birth = Sc.next();
                }
                userProfile.birthDate.setBirthDate(Birth);
            } else {
                System.out.println("Invalid Option!");
            }
    
            System.out.println("0 -> to end  to edit Something else -> (1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate)");
            userEditchoice = Sc.nextInt();
        }
    }
    
    private static void deleteProfile(ArrayList<Person> data) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Are you Sure? (Type 'yes' to confirm):");
        String confirmation = Sc.next();
        if (confirmation.equalsIgnoreCase("yes")) {
            data.clear(); // Clears all profiles
            System.out.println("All profiles deleted.");
        } else {
            System.out.println("Deletion canceled.");
        }
        }
    }
