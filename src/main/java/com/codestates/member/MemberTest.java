package com.codestates.member;
import com.codestates.DependencyConfig;
import java.sql.SQLOutput;

public class MemberTest {
    public static void main(String[] args) {

        DependencyConfig dependencyConfig = new DependencyConfig();

        MemberService memberService = dependencyConfig.memberService();

        Member member = new Member(0L,"dlglwo13@naver.com","이희재","010-4152-5821");
        memberService.createMember(member);

        Member currentM = memberService.getMembers(0L);

        System.out.println("회원 가입 유저 : " + member.getName());
        System.out.println("현재 첫번째 유저 : " + currentM.getName());

        if(member.getName().equals(currentM.getName())){
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
        memberService.deleteMember(0L);

        if(memberService.getMembers(0L) == null){
            System.out.println("회원이 성공적으로 탈퇴되었습니다.");
        }
    }
}
