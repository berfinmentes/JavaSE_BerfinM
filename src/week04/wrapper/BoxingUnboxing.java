package week04.wrapper;

public class BoxingUnboxing {
    int number = 2;
    Integer integer = number;

    Integer integer2= 5;
    int number2 = integer2;

    Integer boxing = new Integer(100);  //Boxing
    Integer boxing2 = Integer.valueOf(100);  //Boxing


    Integer number3 = 100; //Auto Boxing
    int autoUnboxing = number3;//Auto unboxing

    //Unboxing
    int unBoxing = number3.intValue();  //Unboxing




}
