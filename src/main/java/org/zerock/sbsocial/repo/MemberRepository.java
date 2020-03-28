package org.zerock.sbsocial.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.sbsocial.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findMemberByEmail(String email);



}
