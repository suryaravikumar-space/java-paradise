package com.corejava.conditions;

public class MariageEligibility {
    static void marriage(){
        String country = "InDiA"; // we can give any country name here
        switch ((country).toLowerCase()) {
            case "india":
              commonCountry();
                break;
            case "usa":
               commonCountry();
               break;
        }
    }

static void commonCountry(){
    int brideAge = 70;
    int ageMin = 18;
    int ageMax = 60;
    if (ageMin <= brideAge && ageMax >= brideAge) {
        System.out.println("yes allowed in india");
    } else {
        System.out.println("In india not allowed");
    }
}

    public static void main(String[] args) {
        marriage(); // we calling the marriage method form main method
                    //
    }
}

//unary operator

/*
++, --, +,-
*/

//pre icrement    ++number:  value increment first then reusults computed
// post incremet  number++:   value is first  used for computation then incremented

/***
 * Assignment operators
 * 1*1=1
 * c=a*a;
 c=d; assignment operator
 c+=d; c=c+d;
 c-=d; c=c-d;
 c*=d;
 c/=d;
 c%=d;
 * */

/**
 * Relational(boolean)
 * == equals operator ex: c==d
 * != not equals          c!=d
 * <=
 * >=
 * >
 * <
 * */

/**
 * Bitwise operators
 * 60 -- 64 32 16 8 4 2 1
 *    -- 1  1  1  1 1 0 0
 *
 *    >> -signed right shift operator
 *    <<  signed left shift operator
 *    >>> - unsigned right shift operator
 * */

/***
 * Ternary operator:

 (condition)?sout(true):sout(false);
 * */