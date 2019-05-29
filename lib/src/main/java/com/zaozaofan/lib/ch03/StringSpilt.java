package com.zaozaofan.lib.ch03;

import java.util.Arrays;

public class StringSpilt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString("a.b".split("."))); //[]
        //[Ljava.lang.String;@677327b6
        System.out.println(Arrays.toString("a b".split(" ")));

    }
}
