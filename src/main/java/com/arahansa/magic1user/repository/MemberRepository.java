package com.arahansa.magic1user.repository;


import com.arahansa.magic1user.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
