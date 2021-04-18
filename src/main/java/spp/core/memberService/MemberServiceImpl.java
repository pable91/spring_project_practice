package spp.core.memberService;

import spp.core.member.AdminMember;
import spp.core.member.Member;
import spp.core.repository.MemberRepository;
import spp.core.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepo;

    public MemberServiceImpl(MemoryMemberRepository memoryMemberRepository) {
        memberRepo = memoryMemberRepository;
    }

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
