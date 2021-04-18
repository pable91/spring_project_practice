package spp.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spp.core.food.Food;
import spp.core.food.KoreanFood;
import spp.core.memberService.MemberService;
import spp.core.memberService.MemberServiceImpl;
import spp.core.orderService.OrderService;
import spp.core.orderService.OrderServiceImpl;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                food(),
                memberRepository()
        );
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public Food food() {
        return new KoreanFood();
    }
}
