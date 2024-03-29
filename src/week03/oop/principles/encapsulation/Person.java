package week03.oop.principles.encapsulation;

public class Person {
    private String lastname;
    private String name;
    private int age;
    private String tcKimlik;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String arabaSur() {
        if (age >= 18) {
            return name + " arabayi suruyor.";
        } else {
            return "Araba sürmeye yaşınız tutmuyor";
        }


        /*if(age < 0) {
            System.out.println("Yaş 0 dan küçük olamaz.");
            this.age =age;
        } else if(age<=18) {
            System.out.println("Ehkiyet almak için yaşınız tutmuyor");
            this.age = age;
        }else {
            System.out.println("Tebrikler! Ehliyet aldnız!");*/


            }

        }

