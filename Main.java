public class Main {
    public static void main(String[] args) {
        Phone phone = PhoneStore.getPhone("Apple","iphone14");
        phone.getDescription();
        System.out.println();
        Phone phone1 = PhoneStore.getPhone("Apple","iphone13");
        phone1.getDescription();
    }
}