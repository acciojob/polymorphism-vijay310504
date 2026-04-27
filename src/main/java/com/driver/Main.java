package com.driver;
import java.util.*;
public class Main {
     static class Product{
        public int product(int x,int y){
            return x*y;
        }public int product(int x,int y,int z){
            return x*y*z;
        }public double product(double x,double y){
            return x*y;
        }
    }public static void main(String[] args) {
        Product p=new Product();
        int res1=p.product(10,20);
        System.out.println(res1);
        int res2=p.product(10,20,30);
        System.out.println(res2);
        double res3=p.product(10.5,20.5);
        System.out.println(res3);
    }

}