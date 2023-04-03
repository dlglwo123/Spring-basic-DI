package com.codestates.member;

public class MemberService {
    // MemberRepository 라는 객체에 의존성을 가지고 있다.
    //private final MemberRepository memberRepository = new MemberRepository();

    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) //의존성 주입
    {
        this.memberRepository = memberRepository;
    }

    public void createMember(Member member){
        memberRepository.postMember(member);
    }
    public Member getMembers(Long Id){
        return memberRepository.getMember(Id);
    }
    public void deleteMember(Long id){
        memberRepository.deleteMember(id);
    }
}
