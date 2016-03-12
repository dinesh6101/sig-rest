package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.Profile;
import com.sig.team.webworks.matrimonial.crud.repository.ProfileRepository;

@RestController
public class ProfileRest {

	@Resource
	private ProfileRepository profileRepository;

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public @ResponseBody Object profile() {
		return profileRepository.findAll();
	}

	@RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return profileRepository.findOne(id);
	}

	@RequestMapping(value = "/profile/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		profileRepository.delete(id);
	}

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Profile entity) {
		return profileRepository.save(entity);
	}
	
}
