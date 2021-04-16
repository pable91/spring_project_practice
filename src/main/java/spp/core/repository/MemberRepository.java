package spp.core.repository;

import spp.core.member.Member;

public interface MemberRepository {
    void addMember(Member member);
    Member getMember(int id);
}
