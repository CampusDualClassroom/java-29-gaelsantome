package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {

        try {
            throw new IllegalStateException("Excepción");
        } catch (IllegalStateException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        System.out.println("Programa finalizado");
    }

}

