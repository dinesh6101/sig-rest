package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.ItemCategory;
import com.sig.team.webworks.ekirana.crud.repository.ItemCategoryRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class ItemCategoryRest {

	@Resource
	private ItemCategoryRepository itemCategoryRepository;

	@RequestMapping(value = "/itemCategory", method = RequestMethod.GET)
	public @ResponseBody Object itemCategory() throws RestException {
		return itemCategoryRepository.findAll();
	}

	@RequestMapping(value = "/itemCategory/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return itemCategoryRepository.findOne(id);
	}

	@RequestMapping(value = "/itemCategory/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		itemCategoryRepository.delete(id);
	}

	@RequestMapping(value = "/itemCategory", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody ItemCategory entity) throws RestException {
		return itemCategoryRepository.save(entity);
	}
	
}
