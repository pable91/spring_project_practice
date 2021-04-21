package spp.core.food;

import org.springframework.stereotype.Component;

public class KoreanFood implements Food{
    private final static int price = 10000;

    @Override
    public int buyFood() {
        System.out.println("## KoreanFood 를 먹었음. 가격은 => " + price);
        return price;
    }
}
