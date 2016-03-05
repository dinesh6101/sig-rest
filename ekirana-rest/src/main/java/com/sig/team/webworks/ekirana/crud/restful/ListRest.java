package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.List;
import com.sig.team.webworks.ekirana.crud.repository.ListRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class ListRest {

	@Resource
	private ListRepository listRepository;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody Object list() throws RestException {
		return listRepository.findAll();
	}

	@RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return listRepository.findOne(id);
	}

	@RequestMapping(value = "/list/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		listRepository.delete(id);
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody List entity) throws RestException {
		return listRepository.save(entity);
	}
	
}
