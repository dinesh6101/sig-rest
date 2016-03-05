package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.ItemOffers;
import com.sig.team.webworks.ekirana.crud.repository.ItemOffersRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class ItemOffersRest {

	@Resource
	private ItemOffersRepository itemOffersRepository;

	@RequestMapping(value = "/itemOffers", method = RequestMethod.GET)
	public @ResponseBody Object itemOffers() throws RestException {
		return itemOffersRepository.findAll();
	}

	@RequestMapping(value = "/itemOffers/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return itemOffersRepository.findOne(id);
	}

	@RequestMapping(value = "/itemOffers/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		itemOffersRepository.delete(id);
	}

	@RequestMapping(value = "/itemOffers", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody ItemOffers entity) throws RestException {
		return itemOffersRepository.save(entity);
	}
	
}
