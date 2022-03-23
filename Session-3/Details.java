import java.util.Scanner;
import java.util.*;

class Details1 {
    String name;
    String city;
    String hobby;

    public void detMethod(String name, String city, String hobby) {
        this.name = name;
        this.city = city;
        this.hobby = hobby;
        System.out.println(name);
        System.out.println(city);
        System.out.println(hobby);
    }
}

class Details {
    public static void main(String[] args) {
        String name = "Sruthi";
        String city = "Hyderabad";
        String hobby = "Badminton";
        Details1 s = new Details1();
        s.detMethod(name, city, hobby);
    }
}