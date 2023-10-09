package com.besot;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User daro = new User();
        daro.setName("DARO");
        System.out.println("This is my user object :" + daro);
        Product lgElectronics = new Product();
        lgElectronics.setName("LG");
        lgElectronics.setBatchNo(1234L);
        lgElectronics.setCategory("TV");
        Product lgElectronics1 = new Product();
        lgElectronics1.setName("LG");
        lgElectronics1.setBatchNo(1234L);
        lgElectronics1.setCategory("TV");
        lgElectronics1.addProduct(lgElectronics1);
        System.out.println("Are they equal: " +Objects.equals(lgElectronics, lgElectronics1));
        System.out.println(" My name is : "+ lgElectronics.getName());

    }
}