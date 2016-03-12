package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.Gallary;
import com.sig.team.webworks.matrimonial.crud.repository.GallaryRepository;

@RestController
public class GallaryRest {

	@Resource
	private GallaryRepository gallaryRepository;

	@RequestMapping(value = "/gallary", method = RequestMethod.GET)
	public @ResponseBody Object gallary() {
		return gallaryRepository.findAll();
	}

	@RequestMapping(value = "/gallary/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return gallaryRepository.findOne(id);
	}

	@RequestMapping(value = "/gallary/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		gallaryRepository.delete(id);
	}

	@RequestMapping(value = "/gallary", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Gallary entity) {
		return gallaryRepository.save(entity);
	}
	
}
