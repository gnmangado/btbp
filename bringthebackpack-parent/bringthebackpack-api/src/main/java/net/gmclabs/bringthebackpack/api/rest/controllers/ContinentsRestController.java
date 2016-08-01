package net.gmclabs.bringthebackpack.api.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.gmclabs.bringthebackpack.models.Continent;
import net.gmclabs.bringthebackpack.services.IContinentsService;

@RestController
@RequestMapping("/continents")
public class ContinentsRestController extends AbstractCrudRestController<Continent> {

	@Autowired
	public ContinentsRestController(IContinentsService continentsService) {
		super(continentsService, Continent.class);
	}

}
