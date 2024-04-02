package week04.wrapper;

public class Wrapper {
    public static void main(String[] args) {


        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("bilge");
        Boolean b4 = new Boolean("tRuE");
        Boolean b5 = new Boolean("tRUe");
        Boolean b6 = new Boolean("false");
        System.out.println("---Boolean---");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);


        System.out.println("---Byte---");
        Byte byte1 = new Byte((byte) 5);
        Byte byte2 = new Byte("50");
        System.out.println(byte1);
        System.out.println(byte2);

        System.out.println("---Integer---");
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer("15");
        Integer integerSum = integer1+integer2;
        //int sum = integer1+integer2;
        int number1 = 10;
        int number2 =20;
        System.out.println(integer1);
        System.out.println(integer2);


        System.out.println("---Long---");
        Long long1 = 100L;
        long primitiveLong = 100;


        System.out.println("---Character---");
        Character character1 = new Character((char)66);
        Character character2 = new Character((char)(66+32));
        System.out.println(character1);
        System.out.println(character2);
        Character character3 = new Character('A');
        System.out.println(character3);

    }
}
