package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
@RequestMapping("/api/v1")
public class ShipwreckController {
	
	//get list of wrecks
	@RequestMapping(value ="shipwrecks", method=RequestMethod.GET)
	public List<Shipwreck> list() {
		return ShipwreckStub.list();
	}
	
	//create new wreck
	@RequestMapping(value ="shipwrecks", method=RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return ShipwreckStub.create(shipwreck);
	}
	
	//get wreck by Id
	@RequestMapping(value ="shipwrecks/{id}", method=RequestMethod.GET)
	public Shipwreck get(@PathVariable long id) {
		return ShipwreckStub.get(id);
	}
	
	//update wreck
	@RequestMapping(value ="shipwrecks/{id}", method=RequestMethod.PUT)
	public Shipwreck get(@PathVariable long id, @RequestBody Shipwreck shipwreck) {
		return ShipwreckStub.update(id, shipwreck);
	}
	
	//delete wreck
	@RequestMapping(value ="shipwrecks/{id}", method=RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id) {
		return ShipwreckStub.delete(id);
	}
}
