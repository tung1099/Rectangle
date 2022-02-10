package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng HCN: ");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều dài HCN: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Chu vi HCN là: " + rectangle.getPerimeter());
        System.out.println("Diện tích HCN là: " + rectangle.getArea());

    }
}
