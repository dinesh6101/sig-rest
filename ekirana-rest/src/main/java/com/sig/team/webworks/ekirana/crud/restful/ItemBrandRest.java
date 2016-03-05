package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.ItemBrand;
import com.sig.team.webworks.ekirana.crud.repository.ItemBrandRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class ItemBrandRest {

	@Resource
	private ItemBrandRepository itemBrandRepository;

	@RequestMapping(value = "/itemBrand", method = RequestMethod.GET)
	public @ResponseBody Object itemBrand() throws RestException {
		return itemBrandRepository.findAll();
	}

	@RequestMapping(value = "/itemBrand/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return itemBrandRepository.findOne(id);
	}

	@RequestMapping(value = "/itemBrand/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		itemBrandRepository.delete(id);
	}

	@RequestMapping(value = "/itemBrand", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody ItemBrand entity) throws RestException {
		return itemBrandRepository.save(entity);
	}
	
}
