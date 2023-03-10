package com.ll;

public class Calc {
    public static int run(String exp) {
        int sum=0;

        if (exp.contains("-"))
            exp = exp.replace("- ", "+ -");

        String[] bits = null;
        bits = exp.split(" \\+ ");

        for(int i = 0; i<bits.length; i++)
            sum += Integer.parseInt(bits[i]);

        return sum;
    }
}
