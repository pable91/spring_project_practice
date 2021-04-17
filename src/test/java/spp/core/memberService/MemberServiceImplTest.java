package spp.core.memberService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spp.core.member.AdminMember;
import spp.core.member.Member;

class MemberServiceImplTest {

    MemberService memberServiceImpl = new MemberServiceImpl();

    @Test
    @DisplayName("회원 가입 테스트")
    void join() {
        Member member = new AdminMember(100, "m1");
        memberServiceImpl.join(member);

        Member findMember = memberServiceImpl.findByMember(member.getId());

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}