package spp.core.orderService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import spp.core.member.AdminMember;
import spp.core.member.Member;
import spp.core.memberService.MemberService;
import spp.core.memberService.MemberServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();
    
    @Test
    @DisplayName("주문 테스트")
    void order() {
        Member member = new AdminMember(2104, "Kim");
        memberService.join(member);
        
        int price = orderService.order(member.getId());
        Assertions.assertThat(price).isEqualTo(10000);
    }


}