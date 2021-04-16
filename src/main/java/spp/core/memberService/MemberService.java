package spp.core.memberService;

import spp.core.member.Member;

public interface MemberService {

    void join(Member member);
    Member findByMember(int id);
}
