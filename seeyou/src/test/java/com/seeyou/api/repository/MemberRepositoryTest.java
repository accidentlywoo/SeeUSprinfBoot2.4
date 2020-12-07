package com.seeyou.api.repository;

import com.seeyou.api.data.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

class MemberRepositoryTest {

	@Autowired MemberRepository memberRepository;

	@Test
	@Transactional
	@Rollback(value = false)
	public void Member_test(){
	    // given
		Member member = Member.builder().id(1L).name("우연희").nickName("Maeve").build();
		Long saveId = memberRepository.save(member);

		// when
		Member findMember = memberRepository.find(saveId);

	    // then
		assertThat(findMember.getId()).isEqualTo(member.getId());
	}

}