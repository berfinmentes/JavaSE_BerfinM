package week04.entityrelations.composition;

import week04.entityrelations.aggregation.Address;

public class CompositeEmployee{}
   /* private int id;
    private String name;
    private Address address;*/

    /*public CompositeEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
      //  this.address = new Address();
    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }*/

   /* public String CompositeEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street, city);


        class Address {
            private final String street;
            private final String city;


            public Address(String street, String city) {
                this.street = street;
                this.city = city;
            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", city='" + city + '\'' +
                        '}';
            }
        }
    }

}*/



