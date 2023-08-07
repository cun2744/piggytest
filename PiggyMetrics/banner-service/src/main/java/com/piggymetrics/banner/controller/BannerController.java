package com.piggymetrics.banner.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BannerController {

	@GetMapping("/pop")
	public Object pop() {
		return "/banners/banner/main_pop.png";
	}
}
