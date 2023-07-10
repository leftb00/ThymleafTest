package com.leftb.thymleaftest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDto {

	private String id;
	private String name;
	private String email;
	private int age;
}
