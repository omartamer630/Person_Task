import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        Person userProfile = new Person();
        ArrayList<Person> data = new ArrayList<>();

        System.out.println(" 1 -> New Profile \n 2 -> Edit Your Profile \n 3 -> Delete Your profile");
        String userSetting = Sc.next();//

        String name = "", Birth = "", Numb = "", email= "";
        int age = 0;

        if (userSetting.equals("1")) {
            newProfile();
        } else if (userSetting.equals("2")) {
            System.out.println(" 1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate");
            int editChoice = Sc.nextInt();
            editProfile(editChoice);
        } else if (userSetting.equals("3")) {
            deleteProfile();
        } else {
            // print error message.
            System.out.println("Invalid Option!");
        }

    }

/**
 * 1- name  (20)
 2- age (40)
 3- email (omartamer@gmail.com)
 4- personal number (11 digit)
 5- birthdate (yyyy/mm/dd) class
 */

    private static Person newProfile () {
        // Name
        Scanner Sc = new Scanner(System.in);
        Person userProfile = new Person();


        System.out.println("Enter your name: ");
        String name = Sc.next();

        while (userProfile.CheckName(name) == false) {
            System.out.println("Re-enter Correctly: ");
            name = Sc.next();
        }

        userProfile.setName(name);

        System.out.println("Enter your  number :");
        String number = Sc.next();

        while (userProfile.checkNumb(number) == false) {
            System.out.println("Re-enter Correctly: ");
            number = Sc.next();
        }

        userProfile.setNumb(number);

        System.out.println("Enter your  email :");
        String email = Sc.next();

        while (userProfile.checkEmail(email) == false){
            System.out.println("Re-enter Correctly: ");
            email = Sc.next();
        }

        userProfile.setEmail(email);

        System.out.println("Enter your  age :");
        int age = Sc.nextInt();

        while (userProfile.checkAge(age) == false){
            System.out.println("Re-enter Correctly: ");
            age = Sc.nextInt();
        }

        userProfile.setAge(age);

        System.out.println("Enter your new BirthDate (YYYY/MM/DD) :");
        String Birth = Sc.next();

        while (userProfile.birthDate.checkBirth(Birth) == false){
            System.out.println("Re-enter Correctly: ");
            Birth = Sc.next();
        }

        userProfile.birthDate.setBirthDate(Birth);

        return userProfile;
    }
    private static void editProfile(int userEditchoice) {
        Scanner Sc = new Scanner(System.in);
        Person userProfile = new Person();

        if (userEditchoice == 1){

            System.out.println("Enter your new name: ");
            String name = Sc.next();

            while (userProfile.CheckName(name) == false) {
                System.out.println("Re-enter Correctly: ");
                name = Sc.next();
            }

            userProfile.setName(name);

            System.out.println("0 -> to end  to edit Something else -> (1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate)");
            int editChoice = Sc.nextInt();
            if (editChoice != 0) {
                editProfile(editChoice);
            }

        } else if (userEditchoice == 2) {

            System.out.println("Enter your new number :");
            String number = Sc.next();

            while (userProfile.checkNumb(number) == false) {
                System.out.println("Re-enter Correctly: ");
                number = Sc.next();
            }

            userProfile.setNumb(number);

            System.out.println("0 -> to end  to edit Something else -> (1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate)");
            int editChoice = Sc.nextInt();
            if (editChoice != 0) {
                editProfile(editChoice);
            }

        } else if (userEditchoice == 3) {

            System.out.println("Enter your new email :");
            String email = Sc.next();

            while (userProfile.checkEmail(email) == false){
                System.out.println("Re-enter Correctly: ");
                email = Sc.next();
            }

            userProfile.setEmail(email);

            System.out.println("0 -> to end  to edit Something else -> (1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate)");
            int editChoice = Sc.nextInt();
            if (editChoice != 0) {
                editProfile(editChoice);
            }

        } else if (userEditchoice == 4) {

            System.out.println("Enter your  age :");
            int age = Sc.nextInt();

            while (userProfile.checkAge(age) == false){
                System.out.println("Re-enter Correctly: ");
                age = Sc.nextInt();
            }

            userProfile.setAge(age);

            System.out.println("0 -> to end  to edit Something else -> (1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate)");
            int editChoice = Sc.nextInt();
            if (editChoice != 0) {
                editProfile(editChoice);
            }

        } else if (userEditchoice == 5) {

            System.out.println("Enter your new BirthDate (YYYY/MM/DD) :");
            String Birth = Sc.next();

            while (userProfile.birthDate.checkBirth(Birth) == false){
                System.out.println("Re-enter Correctly: ");
                Birth = Sc.next();
            }

            userProfile.birthDate.setBirthDate(Birth);

            System.out.println("0 -> to end  to edit Something else -> (1 -> Name , 2 -> Number , 3 -> Email , 4 -> Age , 5 -> BirthDate)");
            int editChoice = Sc.nextInt();
            if (editChoice != 0) {
                editProfile(editChoice);
            }

        }else {
            System.out.println("InValid Option!");
        }
    }
    private static void deleteProfile() {
        Person userProfile = new Person();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Are you Sure? (Type 'yes' to confirm):");
        String confirmation = Sc.next();
        if (confirmation.equalsIgnoreCase("yes")) {
                userProfile.setName("");
            userProfile.setAge(0);
            userProfile.birthDate.setBirthDate("");
            userProfile.setNumb("");
            userProfile.setEmail("");
                System.out.println("Profile deleted.");
            } else {
                System.out.println("Deletion canceled.");
            }
        }
    }
