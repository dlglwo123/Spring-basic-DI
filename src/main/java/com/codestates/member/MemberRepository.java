package com.codestates.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> members = new HashMap<>();

    public void postMember(Member member){
        members.put(member.getMemberId(),member);
    }
    public Member getMember(Long membersId){
        return members.get(membersId);
    }
    public void deleteMember(Long membersId){
        members.remove(membersId);
    }
}
