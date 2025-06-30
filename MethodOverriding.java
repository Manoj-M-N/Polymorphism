package com.pack;

class Bank {
    void roi() {
        System.out.println("Rate of Interest :1.07");
    }
}

class SBI extends Bank {
    
    void roi() {
        System.out.println("Rate of Interest:2.0");
    }
}

class UNION extends Bank {
    
    void roi() {
        System.out.println("Rate of Interest:2.5");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.roi();           // SBI method

        Bank b = new Bank();
        b.roi();           // Bank method

        Bank b1 = new SBI();
        b1.roi();          // SBI method via Bank reference

        Bank b2 = new UNION();
        b2.roi();          // UNION method via Bank reference
    }
}
