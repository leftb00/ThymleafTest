package com.leftb.thymleaftest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leftb.thymleaftest.dto.MemberDto;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String home(Model model) {

		model.addAttribute("text", "Hello, world.");
		return "home";
	}

	@RequestMapping(value="/member")
	public String member(Model model) {

		MemberDto dto = new MemberDto("tiger", "호랑이", "tiger@abc.com", 27);
		model.addAttribute("memberDto", dto);
		return "member";
	}

	@RequestMapping(value="/memberList")
	public String memberList(Model model) {

		List<MemberDto> list = new ArrayList<MemberDto>();

		for(int i=0; i<10; i++) {
			MemberDto dto = new MemberDto("tiger"+i, "호랑이", "tiger@abc.com", 27+i);
			list.add(dto);
		}

		model.addAttribute("memberList", list);
		return "memberList";
	}

	@RequestMapping(value="/iftest")
	public String iftest(Model model) {

		List<MemberDto> list = new ArrayList<MemberDto>();

		for(int i=0; i<10; i++) {
			MemberDto dto = new MemberDto("tiger"+i, "호랑이", "tiger@abc.com", 27+i);
			list.add(dto);
		}

		model.addAttribute("memberList", list);
		return "iftest";
	}
}
