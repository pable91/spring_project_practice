package spp.core.memberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spp.core.member.AdminMember;
import spp.core.member.Member;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

@Component
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memoryMemberRepository) {
        this.memberRepository = memoryMemberRepository;
    }

    @Override
    public void join(Member member) {
        if (this.memberRepository.getMember(member.getId()) == null )
            this.memberRepository.addMember(member);
    }

    @Override
    public Member findByMember(int id) {
        return this.memberRepository.getMember(id);
    }
}
