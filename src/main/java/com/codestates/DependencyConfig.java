package com.codestates;
import com.codestates.coffee.CoffeeReposistoty;
import com.codestates.coffee.CoffeeService;
import com.codestates.member.MemberRepository;
import com.codestates.member.MemberService;


// 의존성 주입을 관리하는 설정 파일을 만들어서 관심사 분리를 통해 해결할 수 있다.
public class DependencyConfig {
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    public MemberRepository memberRepository(){
        return new MemberRepository();
    }

    public CoffeeService coffeeService(){
        return new CoffeeService(coffeeReposistoty());
    }

    public CoffeeReposistoty coffeeReposistoty(){
        return new CoffeeReposistoty();
    }
}
