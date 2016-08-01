package net.gmclabs.bringthebackpack.persistence.mappers;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import net.gmclabs.bringthebackpack.persistence.models.AdminUser;

public interface AdminUserMapper {

	//TODO Define mapper so we don't have to include the results annotation.
	//TODO research about myBatis settings http://www.mybatis.org/mybatis-3/configuration.html#settings
	@Select("SELECT * FROM admin_user WHERE id = #{id}")
	 @Results({
	        @Result(property = "firstName", column = "first_name"),
	        @Result(property = "lastName", column = "last_name")
	    })
	public AdminUser getUser(@Param("id") Integer id);
}
