package com.rubbypaper.board.persistence;

import org.springframework.data.repository.CrudRepository;

import com.rubbypaper.board.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
