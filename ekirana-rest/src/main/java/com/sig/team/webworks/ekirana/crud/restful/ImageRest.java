package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.Image;
import com.sig.team.webworks.ekirana.crud.repository.ImageRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class ImageRest {

	@Resource
	private ImageRepository imageRepository;

	@RequestMapping(value = "/image", method = RequestMethod.GET)
	public @ResponseBody Object image() throws RestException {
		return imageRepository.findAll();
	}

	@RequestMapping(value = "/image/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return imageRepository.findOne(id);
	}

	@RequestMapping(value = "/image/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		imageRepository.delete(id);
	}

	@RequestMapping(value = "/image", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Image entity) throws RestException {
		return imageRepository.save(entity);
	}
	
}
