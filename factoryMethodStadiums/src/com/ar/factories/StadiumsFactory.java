package com.ar.factories;

import com.ar.products.Stadium;

public abstract class StadiumsFactory {
    public abstract Stadium createStadium(String stadiumtName);
}