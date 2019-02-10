package com.arahansa.magic1user.service;

import com.arahansa.magic1user.domain.Member;
import com.arahansa.magic1user.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Member save(Member member){
        return repository.save(member);
    }

}
