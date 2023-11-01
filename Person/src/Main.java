public class Main {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        BirthdateValidator p2 = new BirthdateValidator();
        p2.setBirthDate("1989/10/22");
        System.out.println(p2.getBirthDate());
    }
}
