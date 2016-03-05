package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.OrderTrack;
import com.sig.team.webworks.ekirana.crud.repository.OrderTrackRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class OrderTrackRest {

	@Resource
	private OrderTrackRepository orderTrackRepository;

	@RequestMapping(value = "/orderTrack", method = RequestMethod.GET)
	public @ResponseBody Object orderTrack() throws RestException {
		return orderTrackRepository.findAll();
	}

	@RequestMapping(value = "/orderTrack/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return orderTrackRepository.findOne(id);
	}

	@RequestMapping(value = "/orderTrack/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		orderTrackRepository.delete(id);
	}

	@RequestMapping(value = "/orderTrack", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody OrderTrack entity) throws RestException {
		return orderTrackRepository.save(entity);
	}
	
}
