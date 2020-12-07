package com.seeyou.api.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter @Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Member {

	@Id @GeneratedValue
	private Long id;
	private String name;
	private String nickName;
}
