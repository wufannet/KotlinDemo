package com.zaozaofan.lib.ch04;

public interface TestInterface {
    void click();

    default void showoff(){
        //java 8 接口可以有默认实现,这样就可以多继承复用方法实现了.
    }
}
