package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.Items;
import com.sig.team.webworks.ekirana.crud.repository.ItemsRepository;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
public class ItemsRest {

	@Resource
	private ItemsRepository itemsRepository;

	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public @ResponseBody Object items() throws RestException {
		return itemsRepository.findAll();
	}

	@RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return itemsRepository.findOne(id);
	}

	@RequestMapping(value = "/items/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		itemsRepository.delete(id);
	}

	@RequestMapping(value = "/items", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Items entity) throws RestException {
		return itemsRepository.save(entity);
	}
	
}
