package spp.core;

import spp.core.member.AdminMember;
import spp.core.member.Member;
import spp.core.memberService.MemberService;
import spp.core.memberService.MemberServiceImpl;
import spp.core.orderService.OrderService;
import spp.core.orderService.OrderServiceImpl;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Member member = new AdminMember(2321, "KKK");
        memberService.join(member);

        orderService.order(member.getId());
    }
}
