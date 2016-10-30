package elxsoft.com.system.service;

import org.springframework.stereotype.Service;

import elxsoft.system.entity.SysUser;
import elxsoft.system.facade.SysUserFacade;


/**
 * 
 * <B>系统名称(System)：</B><BR>
 * <B>模块名称(Module)：</B><BR>
 * <B>中文类名(Name)：</B><BR>
 * <B>概要说明(Description)：</B>This service implements facade in system-facade<BR>
 * @author Alex
 */
@Service("sysUserService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = elxsoft.system.facade.SysUserFacade.class, protocol = {
		"rest", "dubbo" })
public class SysUserService implements SysUserFacade
{

	public void testget()
	{
		// http://localhost:8998/elxsoft-system-service/sysUserService/testget
		System.out.println("测试...get");
	}

	public SysUser getUser()
	{
		// http://localhost:8998/elxsoft-system-service/sysUserService/getUser
		SysUser user = new SysUser();
		user.setId("1001");
		user.setName("张三");
		return user;
	}

	public SysUser getUser(Integer id)
	{
		// http://localhost:8998/elxsoft-system-service/sysUserService/get/1001
		System.out.println(id);
		System.out.println("测试...get");
		SysUser user = new SysUser();
		user.setId("1001");
		user.setName("张三");
		return user;
	}

	public SysUser getUser(Integer id, String name)
	{
		// http://localhost:8998/elxsoft-system-service/sysUserService/get/1001/z3
		System.out.println(id);
		System.out.println(name);
		System.out.println("测试...get");
		SysUser user = new SysUser();
		user.setId("1001z3");
		user.setName("张三");
		return user;
	}

	public void testpost()
	{
		System.out.println("测试...post");
	}

	public SysUser postUser(SysUser user)
	{
		System.out.println(user.getName());
		System.out.println("测试...postUser");
		SysUser user1 = new SysUser();
		user.setId("1001");
		user1.setName("张三");
		return user1;
	}

	public SysUser postUser(String id)
	{
		System.out.println(id);
		System.out.println("测试...get");
		SysUser user = new SysUser();
		user.setId("1001");
		user.setName("张三");
		return user;
	}

}
