package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.ItemType;
import com.sig.team.webworks.ekirana.crud.repository.ItemTypeRepository;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
public class ItemTypeRest {

	@Resource
	private ItemTypeRepository itemTypeRepository;

	@RequestMapping(value = "/itemType", method = RequestMethod.GET)
	public @ResponseBody Object itemType() throws RestException {
		return itemTypeRepository.findAll();
	}

	@RequestMapping(value = "/itemType/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return itemTypeRepository.findOne(id);
	}

	@RequestMapping(value = "/itemType/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		itemTypeRepository.delete(id);
	}

	@RequestMapping(value = "/itemType", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody ItemType entity) throws RestException {
		return itemTypeRepository.save(entity);
	}
	
}
