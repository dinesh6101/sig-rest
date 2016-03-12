package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.OrderStatus;
import com.sig.team.webworks.ekirana.crud.repository.OrderStatusRepository;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
public class OrderStatusRest {

	@Resource
	private OrderStatusRepository orderStatusRepository;

	@RequestMapping(value = "/orderStatus", method = RequestMethod.GET)
	public @ResponseBody Object orderStatus() throws RestException {
		return orderStatusRepository.findAll();
	}

	@RequestMapping(value = "/orderStatus/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return orderStatusRepository.findOne(id);
	}

	@RequestMapping(value = "/orderStatus/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		orderStatusRepository.delete(id);
	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody OrderStatus entity) throws RestException {
		return orderStatusRepository.save(entity);
	}
	
}
