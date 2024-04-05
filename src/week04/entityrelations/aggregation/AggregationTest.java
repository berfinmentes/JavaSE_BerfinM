package week04.entityrelations.aggregation;

public class AggregationTest {
    public static void main(String[] args) {
      //  Address adress = new Address("2037","Ankara");
       // System.out.println(adress);

        AggregateEmployee employee = new AggregateEmployee(1,"Alperen", new Address("2037","Ankara"));
        System.out.println(employee);


    }
}
