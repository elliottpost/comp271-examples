package unit2;

import unit1.LinearSearch;

public class Memory {
    public static void main(String[] args) {

//        Person per1 = new Person("Elly", 31);
//        Person per2 = new Person("Jake", 26);
//        Person per3 = per1;
//
//        int i = 5;
//        char c = '@';
//        double d = 17.0;
//        float f = 21.0f;
//        int i2 = 7;
//        int i3 = i;
//        i = 6;


        // memory
        /*
        Var   |  Mem.  |
        Name  |  Addr. | Value
        -----------------------
        i     |  100   |  6
        c     |  101   |  @
        d     |  102   |  17
        ...   |  ...   | ....
        f     |  105   |  21
        ...   |  ...   | ....
        per1  |  120   | 125;
        per2  |  121   | 140
        per3  |  122   | 125
        ...   |  ....  |  ...
        N/A   |  125   | George; 31
        ...   |  ....  |  ...
        N/A   |  140   | Jake; 26
        ...   |  ....  |  ...
        i2    |  150   |  7
        i3    |  151   |  5
         */
        // if (memAddr[100] has the same value as memAddr[150]) ...
//        if (i == i2) {}

        // if (memAddr[100] has the same value as memAddr[151]) ...
//        if (i == i3) {}  // TRUE

        //  =         this is the assignment operator and it copies a value at a memory address to whatever its being assigned to
        //  ==        this is called the identity operator
        // equals()   this is a method for checking if two objects have the same value(s)


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
