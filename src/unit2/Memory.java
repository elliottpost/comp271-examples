package unit2;

import unit1.LinearSearch;

public class Memory {
    public static void main(String[] args) {

/*
        // primitives
        int a;
        char c;
        double x;
        float y;
        boolean z;

        // array
        int[] arr = new int[10];

        // objects
        Integer __a;
        Character __c;
        Double __x;
        Float __y;
        Boolean __z;
        String __s;

        Memory __m;
        LinearSearch __ls;
*/

        Person a = new Person("Elly", 31);
        Person b = new Person("Jake", 26);

        if (a == b) {
            System.out.println("Person a has the same identity as person b");
        } else {
            System.out.println("Person a does NOT have the same identity as person b");
        }

        if (a.equals(b)) {
            System.out.println("Person a IS the same person as person b");
        } else {
            System.out.println("Person a IS NOT the same person as person b");
        }

//        b.setName(a.getName());
//        b.setAge(a.getAge());
//
//        System.out.println("B is now using A properties");
//
//        if (a == b) {
//            System.out.println("Person a has the same identity as person b");
//        } else {
//            System.out.println("Person a does NOT have the same identity as person b");
//        }
//
//        if (a.equals(b)) {
//            System.out.println("Person a IS the same person as person b");
//        } else {
//            System.out.println("Person a IS NOT the same person as person b");
//        }

        int x = 5;
        int y = x;
        x = 3;
        // y = 5;
        // x = 3;

        Person c = b;

        if (a == b) {
            System.out.println("Person a has the same identity as person b");
        } else {
            System.out.println("Person a does NOT have the same identity as person b");
        }

        if (b == c) {
            System.out.println("Person b has the same identity as person c");
        } else {
            System.out.println("Person b does NOT have the same identity as person c");
        }

        if (a == c) {
            System.out.println("Person a has the same identity as person c");
        } else {
            System.out.println("Person a does NOT have the same identity as person c");
        }

        c.setName(a.getName());
        c.setAge(a.getAge());
                                                   // name / age
        System.out.print("Person A: " + a + "\n"); //  Elly 31
        System.out.print("Person B: " + b + "\n"); // ?? + ?? => Elly 31 / Jake 26
        System.out.print("Person C: " + c + "\n"); // Elly 31

//        if (a.equals(b)) {
//            System.out.println("Person a IS the same person as person b");
//        } else {
//            System.out.println("Person a IS NOT the same person as person b");
//        }

    }
}
