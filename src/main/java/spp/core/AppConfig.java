package spp.core;

import spp.core.food.KoreanFood;
import spp.core.memberService.MemberService;
import spp.core.memberService.MemberServiceImpl;
import spp.core.orderService.OrderService;
import spp.core.orderService.OrderServiceImpl;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new KoreanFood(), new MemoryMemberRepository());
    }
}
