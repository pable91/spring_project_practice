package spp.core.memberService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spp.core.AppConfig;
import spp.core.member.AdminMember;
import spp.core.member.Member;

class MemberServiceImplTest {

    MemberService memberService;

    @BeforeEach
    public void BeforeEach() {
        //AppConfig ac = new AppConfig();
        //memberService = ac.memberService();
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        memberService = ac.getBean("memberService", MemberService.class);
    }

    @Test
    @DisplayName("회원 가입 테스트")
    void join() {
        Member member = new AdminMember(100, "m1");
        memberService.join(member);

        Member findMember = memberService.findByMember(member.getId());

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}