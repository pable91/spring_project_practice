package spp.core.repository;

import spp.core.member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Integer, Member> memberRepo = new HashMap<>();

    @Override
    public void addMember(Member member) {
        memberRepo.put(member.getId(), member);
    }

    @Override
    public Member getMember(int id) {
        return memberRepo.get(id);
    }
}
