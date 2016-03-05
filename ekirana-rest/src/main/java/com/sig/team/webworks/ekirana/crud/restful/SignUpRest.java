package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.SignUp;
import com.sig.team.webworks.ekirana.crud.repository.SignUpRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class SignUpRest {

	@Resource
	private SignUpRepository signUpRepository;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public @ResponseBody Object signUp() throws RestException {
		return signUpRepository.findAll();
	}

	@RequestMapping(value = "/signUp/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return signUpRepository.findOne(id);
	}

	@RequestMapping(value = "/signUp/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		signUpRepository.delete(id);
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody SignUp entity) throws RestException {
		return signUpRepository.save(entity);
	}
	
}
