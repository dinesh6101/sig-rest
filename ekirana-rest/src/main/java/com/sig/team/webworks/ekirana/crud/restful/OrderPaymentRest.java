package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.OrderPayment;
import com.sig.team.webworks.ekirana.crud.repository.OrderPaymentRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class OrderPaymentRest {

	@Resource
	private OrderPaymentRepository orderPaymentRepository;

	@RequestMapping(value = "/orderPayment", method = RequestMethod.GET)
	public @ResponseBody Object orderPayment() throws RestException {
		return orderPaymentRepository.findAll();
	}

	@RequestMapping(value = "/orderPayment/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return orderPaymentRepository.findOne(id);
	}

	@RequestMapping(value = "/orderPayment/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		orderPaymentRepository.delete(id);
	}

	@RequestMapping(value = "/orderPayment", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody OrderPayment entity) throws RestException {
		return orderPaymentRepository.save(entity);
	}
	
}
