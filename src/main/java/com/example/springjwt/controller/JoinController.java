package com.example.springjwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjwt.dto.JoinDTO;
import com.example.springjwt.service.JoinService;

@RestController
public class JoinController {
	private final JoinService joinService;

	public JoinController(JoinService joinService) {
		this.joinService = joinService;
	}

	@PostMapping("/join")
	public String joinProcess(JoinDTO joinDTO){
		System.out.println(joinDTO.getPassword());
		joinService.joinProcess(joinDTO);

		return "ok";
	}
}
