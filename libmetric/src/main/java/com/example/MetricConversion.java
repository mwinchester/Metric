package com.example;
import java.io.*;

public class MetricConversion {
    public static void main (String args[]){
        // variables in caps because they are used as constants
        double METER = 1.094;
        double KILOMETER = .6214;
        double CENTIMETER = .3934;
        double FEET = 3280.84;  // feet in 1 kilometer
        double LITER = 1.0567; // 1 liter = 1.0567 quarts
        double KILOGRAM = 2.2046;

        // complete calculations and assign to variables
        double yards = 28 * METER;
        double miles = 168 * KILOMETER;
        double inches = 47 * CENTIMETER;
        double fps = (27*FEET)/ 60 / 60;
        double quarts = 92 * LITER;
        double pounds = 200 * KILOGRAM;

        // output formatted results limited to 2 places past the  decimal point
        System.out.format("28 meters = " + "%.3f" +  " yards.\n", yards);
        System.out.format("168 kilometers = " + "%.3f" +" miles.\n", miles);
        System.out.format("47 centimeters = " + "%.3f" + " inches.\n", inches);
        System.out.format("27 kilometers per hour = " + "%.3f" + " feet per seconds.\n" , fps);
        System.out.format("92 liters = " + "%.3f" + " quarts.\n", quarts);
        System.out.format("200 Kilograms = "+ "%.3f" + " pounds.\n", pounds);
    }
}
