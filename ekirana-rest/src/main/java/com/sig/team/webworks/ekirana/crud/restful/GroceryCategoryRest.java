package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
import com.sig.team.webworks.ekirana.crud.repository.GroceryCategoryRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class GroceryCategoryRest {

	@Resource
	private GroceryCategoryRepository groceryCategoryRepository;

	@RequestMapping(value = "/groceryCategory", method = RequestMethod.GET)
	public @ResponseBody Object groceryCategory() throws RestException {
		return groceryCategoryRepository.findAll();
	}

	@RequestMapping(value = "/groceryCategory/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return groceryCategoryRepository.findOne(id);
	}

	@RequestMapping(value = "/groceryCategory/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		groceryCategoryRepository.delete(id);
	}

	@RequestMapping(value = "/groceryCategory", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody GroceryCategory entity) throws RestException {
		return groceryCategoryRepository.save(entity);
	}
	
}
