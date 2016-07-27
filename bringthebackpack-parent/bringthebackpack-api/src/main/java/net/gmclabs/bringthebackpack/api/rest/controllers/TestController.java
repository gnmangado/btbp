package net.gmclabs.bringthebackpack.api.rest.controllers;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.gmclabs.bringthebackpack.persistence.mappers.AdminUserMapper;
import net.gmclabs.bringthebackpack.persistence.models.AdminUser;

@Controller
@RequestMapping("/test")
public class TestController {

	static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private AdminUserMapper adminUserMapper;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<String> getTests(@RequestParam(value = "name", required = false) String name) {
		logger.info("Test controller executed");
		try {
			AdminUser adminUser = adminUserMapper.getUser(1);
			logger.info(adminUser.toString());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return Arrays.asList(name);
	}

}
