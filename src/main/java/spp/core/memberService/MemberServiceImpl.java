package spp.core.memberService;

import spp.core.member.AdminMember;
import spp.core.member.Member;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    // 만약 Memory가 아닌 DB에 저장하는 시스템으로 바뀐다면 해당 구체클래스는 수정되야한다.
    // 이는 구체화에 의존하고 있다는 의미이므로 DIP 위반
    // 또한 확장이 아닌 변경을 해야하므로 OCP위반
    private MemberRepository memberRepo = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        if (memberRepo.getMember(member.getId()) == null )
            memberRepo.addMember(member);
    }

    @Override
    public Member findByMember(int id) {
        return memberRepo.getMember(id);
    }
}
