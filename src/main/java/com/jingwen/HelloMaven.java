package com.jingwen;

public class HelloMaven {
    public int add(int m, int n) {
        return m+n;
    }

    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10, 30);
        System.out.println(res);
    }
}
