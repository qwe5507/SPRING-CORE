package hello.core.member;

import hello.core.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {
    MemberService memberService;
    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join(){
        //given  //이게 주어졌을떄
        Member member = new Member(1L,"memberA",Grade.VIP);

        //when //이걸 했을떄
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then //이렇게 된다
        assertThat(member).isEqualTo(findMember);
    }
}
