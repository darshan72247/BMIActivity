package com.example.bmiactivity;

import org.junit.Test;

public class BMIModelTest
{
    @Test
    public void getBMITest()
    {
        double w,h;
        System.out.println("Testing BMI.getBMI");

        w=90;  h=1.8;  //h=0.5+2.5*Math.random();
        System.out.println(w+","+ h);
        System.out.println(BMIModel.getBMI(w,h));
    }

}
