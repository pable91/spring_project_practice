package spp.core.food;

import org.springframework.stereotype.Component;

//@Component
public class JapanFood implements Food{
    private final static int price = 20000;

    @Override
    public int buyFood() {
        System.out.println("## JapanFood 를 먹었음. 가격은 => " + price);
        return price;
    }
}
