package com.sig.team.webworks.ekirana.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
import com.sig.team.webworks.ekirana.service.ItemCountService;
import com.sig.team.webworks.rest.exception.RestException;

/*import com.sig.team.webworks.ekirana.constants.ApplicationConstants;
 import com.sig.team.webworks.ekirana.constants.ExceptionMessages;*/

@RestController
public class ItemCountController {
	private static final Logger LOGGER = Logger.getLogger(ItemController.class);

	@Resource
	private ItemCountService itemCountService;

	/*
	 * @RequestMapping(value = "/itemCount", method = RequestMethod.GET) public @ResponseBody List<String> getItemCount() throws RestException { return
	 * itemCountService.getItemCount(); }
	 */

	@RequestMapping(value = "/groceryCategory1", method = RequestMethod.GET)
	public @ResponseBody List<GroceryCategory> getGroceryCategory() throws RestException {
		return itemCountService.getAllGroceryCategory();
	}

}
