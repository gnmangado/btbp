package net.gmclabs.bringthebackpack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gmclabs.bringthebackpack.models.AdminUser;
import net.gmclabs.bringthebackpack.persistence.mappers.AdminUserDao;

@Service
public class AdminUserService {

	@Autowired
	private AdminUserDao adminUserMapper;

//	public AdminUser getAdminUserById(Integer id) {
//		return adminUserMapper.getAdminUser(id);
//	}

}
