package net.gmclabs.bringthebackpack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gmclabs.bringthebackpack.persistence.mappers.AdminUserMapper;
import net.gmclabs.bringthebackpack.persistence.models.AdminUser;

@Service
public class AdminUserService {

	@Autowired
	private AdminUserMapper adminUserMapper;

	public AdminUser getAdminUserById(Integer id) {
		return adminUserMapper.getUser(id);
	}

}
