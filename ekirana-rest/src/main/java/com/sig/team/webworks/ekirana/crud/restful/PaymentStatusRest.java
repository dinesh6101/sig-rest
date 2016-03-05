package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.PaymentStatus;
import com.sig.team.webworks.ekirana.crud.repository.PaymentStatusRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class PaymentStatusRest {

	@Resource
	private PaymentStatusRepository paymentStatusRepository;

	@RequestMapping(value = "/paymentStatus", method = RequestMethod.GET)
	public @ResponseBody Object paymentStatus() throws RestException {
		return paymentStatusRepository.findAll();
	}

	@RequestMapping(value = "/paymentStatus/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return paymentStatusRepository.findOne(id);
	}

	@RequestMapping(value = "/paymentStatus/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		paymentStatusRepository.delete(id);
	}

	@RequestMapping(value = "/paymentStatus", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody PaymentStatus entity) throws RestException {
		return paymentStatusRepository.save(entity);
	}
	
}
