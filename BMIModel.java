package com.example.bmiactivity;

public class BMIModel
{
    public static double toDouble(String s)
    {
        return Double.parseDouble(s);
    }

    public static double getBMI(double weight , double height )
    {
        double result = ( weight / (height * height));
        return result ;
    }

    public static String formatBMI(double bmi)
    {
        return String.format("%.1f",bmi);
    }


    /* public String toPound ()
    {
        double a = this.weight / 0.454;
        String pound = String.format("%.1f",a);
        return pound;
    }*/
}





