package spp.core.orderService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import spp.core.food.Food;
import spp.core.food.KoreanFood;
import spp.core.member.Member;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements  OrderService{
    private final Food food;
    private final MemberRepository memberRepository;

    @Override
    public int order(int memberId) {
        Member findMember = memberRepository.getMember(memberId);

        System.out.println("## " + findMember.getName() + "주문함");
        return food.buyFood();
    }
}
