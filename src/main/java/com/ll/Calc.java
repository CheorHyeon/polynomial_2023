package com.ll;

public class Calc {
    public static int run(String exp) {
        int result = 0;
        String[] bits = null;
        if (exp.contains("*"))
        {
            result = 1;
            bits = exp.split(" \\* ");
            for (int i = 0; i < bits.length; i++)
                result *= Integer.parseInt(bits[i]);
        }
        else
        {
            if (exp.contains("-")) exp = exp.replace("- ", "+ -");
            bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++)
                result += Integer.parseInt(bits[i]);
        }
        return result;
    }
}
