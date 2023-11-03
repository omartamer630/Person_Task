public class BirthDate{
    private String birthDate = "";

    public void setBirthDate(String birthDate) {
        if (checkBirth(birthDate)) {
            this.birthDate = birthDate;
            System.out.println("BirthDate: Added");
        } else {
            System.out.println("BirthDate: Invalid");
        }
    }

    public boolean checkBirth(String birthDate) {
        String regex = "^(19[8-9][3-9]|19[9-9][0-9]|20[0-1][0-9]|202[0-3])/(0[1-9]|1[0-2])/(0[1-9]|[12]\\d|3[01])$";
        return birthDate.matches(regex);
    }

    public String getBirthDate() {
        return birthDate;
    }
}
