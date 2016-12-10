package com.slin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slin.bean.Toy;

@Controller
@RequestMapping(path="/rest.action")
public class RestController {

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Toy getMyToy () {
		Toy t = new Toy ("Hi Sexy !!") ;
		return t;
	}
}
