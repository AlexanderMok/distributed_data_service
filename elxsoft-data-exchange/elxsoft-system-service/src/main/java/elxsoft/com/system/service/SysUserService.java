package elxsoft.com.system.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import elxsoft.com.system.dao.SysUserDao;
import elxsoft.system.entity.SysUser;
import elxsoft.system.facade.SysUserFacade;

/**
 * 
 * <B>系统名称(System)：</B><BR>
 * <B>模块名称(Module)：</B><BR>
 * <B>中文类名(Name)：</B><BR>
 * <B>概要说明(Description)：</B>This service implements facade in system-facade<BR>
 * 
 * @author Alex
 */
@Service("sysUserService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = elxsoft.system.facade.SysUserFacade.class, protocol = {
		"rest", "dubbo" })
public class SysUserService implements SysUserFacade
{

	private SysUserDao sysUserDao;

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

	/**
	 * <B>方法名称 method：</B><BR>
	 * <B>概要说明 description：</B><BR>
	 * 
	 * @see elxsoft.system.facade.SysUserFacade#generateKey()
	 */
	@Override
	public String generateKey() throws Exception
	{
		return this.sysUserDao.generateKey();
	}

	/**
	 * <B>方法名称 method：</B><BR>
	 * <B>概要说明 description：</B><BR>
	 * 
	 * @see elxsoft.system.facade.SysUserFacade#getById(java.lang.String)
	 */
	@Override
	public JSONObject getById(String id) throws Exception
	{
		// get
		// http://localhost:8888/elxsoft-system-service/sysUserService/getById/{id}
		return this.sysUserDao.getById(id);
	}

	/**
	 * <B>方法名称 method：</B><BR>
	 * <B>概要说明 description：</B><BR>
	 * 
	 * @see elxsoft.system.facade.SysUserFacade#getList()
	 */
	@Override
	public List<JSONObject> getList() throws Exception
	{
		// post
		// http://localhost:8888/elxsoft-system-service/sysUserService/getById/getList
		List<JSONObject> list = this.sysUserDao.getList();
		if (!list.isEmpty())
		{
			return list;
		}
		else
		{
			return Collections.emptyList();
		}
	}

	/**
	 * <B>方法名称 method：</B><BR>
	 * <B>概要说明 description：</B><BR>
	 * 
	 * @see elxsoft.system.facade.SysUserFacade#insert(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public int insert(JSONObject jsonObject) throws Exception
	{
		return this.sysUserDao.insert(jsonObject);
	}

}
