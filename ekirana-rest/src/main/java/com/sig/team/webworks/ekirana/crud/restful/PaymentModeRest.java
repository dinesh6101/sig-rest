package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.PaymentMode;
import com.sig.team.webworks.ekirana.crud.repository.PaymentModeRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class PaymentModeRest {

	@Resource
	private PaymentModeRepository paymentModeRepository;

	@RequestMapping(value = "/paymentMode", method = RequestMethod.GET)
	public @ResponseBody Object paymentMode() throws RestException {
		return paymentModeRepository.findAll();
	}

	@RequestMapping(value = "/paymentMode/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return paymentModeRepository.findOne(id);
	}

	@RequestMapping(value = "/paymentMode/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		paymentModeRepository.delete(id);
	}

	@RequestMapping(value = "/paymentMode", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody PaymentMode entity) throws RestException {
		return paymentModeRepository.save(entity);
	}
	
}
