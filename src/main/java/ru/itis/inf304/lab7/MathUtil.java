package ru.itis.inf304.lab7;

public class MathUtil {
    public static Double exp(Double x)  {
        double epsylon = 0.000001;
        Double sum = 1d;
        double x_ = x;
        int n = 1;

        while(x_ > epsylon){
            x_ = x_*x/n;
            n++;
            sum += x_;
        }
        return sum;
    }
}
