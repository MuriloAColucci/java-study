public class Main {
    public static void main(String[] args) {

        //Autoboxing
//        Integer a = new Integer(123);
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;

        //Unboxing
//        int x = a;
//        double y = b;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        System.out.println(a + b + c + d);

//        int a = Integer.parseInt("123");
//        double b = Integer.parseInt("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
