public class MainClass2 {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Деревянко", "+7(927) 663 59 12");
        phoneDirectory.add("Деревянко", "+7(902) 777 58 10");
        phoneDirectory.add("Нагучев", "+7(933) 541 32 33");
        phoneDirectory.add("Генич", "+7(917) 882 31 34");
        phoneDirectory.add("Генич", "+7(922) 333 51 64");

        System.out.println("Номера абонентов с фамилией 'Деревянко': " + phoneDirectory.get("Деревянко"));
        System.out.println("Номера абонентов с фамилией 'Нагучев': " + phoneDirectory.get("Нагучев"));
        System.out.println("Номера абонентов с фамилией 'Генич': " + phoneDirectory.get("Генич"));
    }

}
