package spp.core.orderService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import spp.core.member.AdminMember;
import spp.core.member.Member;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    OrderService orderService = new OrderServiceImpl();

    @Test
    @DisplayName("주문 테스트")
    void order() {
        Member member = new AdminMember(2104, "Kim");

        int price = orderService.order(member);
        Assertions.assertThat(price).isEqualTo(20000);
    }


}