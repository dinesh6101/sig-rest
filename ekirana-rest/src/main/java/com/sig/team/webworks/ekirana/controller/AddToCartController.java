package com.sig.team.webworks.ekirana.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.AddToCart;
import com.sig.team.webworks.ekirana.crud.repository.AddToCartRepository;
import com.sig.team.webworks.ekirana.model.User;
import com.sig.team.webworks.ekirana.service.AddToCartService;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
public class AddToCartController {
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(AddToCartController.class);

	@Resource
	private AddToCartRepository addtocartrepository;

	@Resource
	private AddToCartService addtocartservice;

	Integer userid = 4;

	@RequestMapping(value = "/addtocart", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody AddToCart entity) throws RestException {
		User accessuser = new User();
		//accessuser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//String username = accessuser.getUsername();
		entity.setUsername("Dinesh");
		return addtocartservice.save(entity);
	}

	@RequestMapping(value = "/addtocart/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCart(@PathVariable Integer id) {
		addtocartrepository.delete(id);
	}

	@RequestMapping(value = "/addtocart", method = RequestMethod.GET)
	public @ResponseBody List<AddToCart> getCartData() throws RestException {
		return (List<AddToCart>) addtocartservice.getCartData();
	}
	
	@RequestMapping(value = "/clearCartOfLoggedInUser", method = RequestMethod.GET)
	public @ResponseBody Integer clearCartOfLoggedInUser() throws RestException {
		// TODO get the userid of logged in user
		return addtocartservice.deleteCartByUserId(userid);
	}
	
	
}
