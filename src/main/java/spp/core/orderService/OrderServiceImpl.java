package spp.core.orderService;

import spp.core.food.Food;
import spp.core.food.KoreanFood;
import spp.core.member.Member;

public class OrderServiceImpl implements  OrderService{
    private Food food = new KoreanFood();

    @Override
    public int order(Member member) {

        System.out.println("## 주문함");
        return food.buyFood();
    }
}
