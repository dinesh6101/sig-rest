package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.CustomerOrder;
import com.sig.team.webworks.ekirana.crud.repository.CustomerOrderRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class CustomerOrderRest {

	@Resource
	private CustomerOrderRepository customerOrderRepository;

	@RequestMapping(value = "/customerOrder", method = RequestMethod.GET)
	public @ResponseBody Object customerOrder() throws RestException {
		return customerOrderRepository.findAll();
	}

	@RequestMapping(value = "/customerOrder/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return customerOrderRepository.findOne(id);
	}

	@RequestMapping(value = "/customerOrder/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		customerOrderRepository.delete(id);
	}

	@RequestMapping(value = "/customerOrder", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody CustomerOrder entity) throws RestException {
		return customerOrderRepository.save(entity);
	}
	
}
