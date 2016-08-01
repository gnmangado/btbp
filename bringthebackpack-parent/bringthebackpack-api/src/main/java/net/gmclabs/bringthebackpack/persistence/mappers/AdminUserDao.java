package net.gmclabs.bringthebackpack.persistence.mappers;

import org.apache.ibatis.annotations.Param;

import net.gmclabs.bringthebackpack.models.AdminUser;

public interface AdminUserDao {

	public AdminUser getAdminUser(@Param("id") Integer id, @Param("username") String userName);

}
