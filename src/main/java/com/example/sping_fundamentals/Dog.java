package com.example.sping_fundamentals;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public String makeNoise() {

        return "woof-woof";
    }
}
