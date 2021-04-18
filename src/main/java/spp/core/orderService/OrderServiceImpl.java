package spp.core.orderService;

import spp.core.food.Food;
import spp.core.food.KoreanFood;
import spp.core.member.Member;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

public class OrderServiceImpl implements  OrderService{
    private Food food;
    private MemberRepository memberRepository;

    public OrderServiceImpl(KoreanFood koreanFood, MemoryMemberRepository memoryMemberRepository) {
        food = koreanFood;
        memberRepository = memoryMemberRepository;
    }

    @Override
    public int order(int memberId) {
        Member findMember = memberRepository.getMember(memberId);

        System.out.println("## " + findMember.getName() + "주문함");
        return food.buyFood();
    }
}
