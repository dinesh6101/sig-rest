package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.OrderNotifications;
import com.sig.team.webworks.ekirana.crud.repository.OrderNotificationsRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class OrderNotificationsRest {

	@Resource
	private OrderNotificationsRepository orderNotificationsRepository;

	@RequestMapping(value = "/orderNotifications", method = RequestMethod.GET)
	public @ResponseBody Object orderNotifications() throws RestException {
		return orderNotificationsRepository.findAll();
	}

	@RequestMapping(value = "/orderNotifications/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return orderNotificationsRepository.findOne(id);
	}

	@RequestMapping(value = "/orderNotifications/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		orderNotificationsRepository.delete(id);
	}

	@RequestMapping(value = "/orderNotifications", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody OrderNotifications entity) throws RestException {
		return orderNotificationsRepository.save(entity);
	}
	
}
