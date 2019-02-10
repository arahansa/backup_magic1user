package com.arahansa.magic1user.service;

import com.arahansa.magic1user.domain.Member;
import com.arahansa.magic1user.helper.CommonPageInfo;
import com.arahansa.magic1user.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberService {

    @Autowired
    MemberRepository repository;

    public List<Member> findAll() {
        return repository.findAll();
    }

    public CommonPageInfo<Member> findPage(Pageable pageable){
        Page<Member> all = repository.findAll(pageable);
        return new CommonPageInfo<Member>(all);
    }

    public Member save(Member member){
        return repository.save(member);
    }

    public void createDummy(){
        for(int i=0;i<100;i++){
            Member member = new Member();
            member.setUsername("user" + i + "@naver.com");
            member.setPassword("1234");
            repository.save(member);
        }
    }

}
