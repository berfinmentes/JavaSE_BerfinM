package week03.garbagecollector;

public class TestGarbage1 {
    protected void finalize(){
        System.out.println("objekt ist garbage collected");

    }

    public static void main(String[] args) {

        TestGarbage1 garbage1 = new TestGarbage1();
                                                  /* Bunlar heapte ayrı yerde tutuluyor */
        TestGarbage1 garbage2 = new TestGarbage1();


        TestGarbage1 garbage3 = new TestGarbage1();
                                                 /* Bunlar heapte aynı nesneyi referans alıyorlar */
        TestGarbage1 garbage4 = garbage3;


        garbage1= null;
        garbage2= null;
        garbage3= null;
        garbage4= null;
        new TestGarbage1();  /*Anonim nesnedir garbage bunları algılar ve toplar sayıları önemli değildir*/
        System.gc();        /*Garbage*/
    }
}
