package elxsoft.system.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import elxsoft.system.entity.SysUser;


/**
 * 
 * <B>系统名称(System)：</B><BR>
 * <B>模块名称(Module)：</B><BR>
 * <B>中文类名(Name)：</B><BR>
 * <B>概要说明(Description)：</B>Define interface and REST access method<BR>
 * @author Alex
 */
@Path("/sysUserService")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public interface SysUserFacade
{

	@GET
	@Path("/testget")
	public void testget();

	@GET
	@Path("/getUser")
	public SysUser getUser();

	@GET
	@Path("/get/{id : \\d+}")
	public SysUser getUser(@PathParam(value = "id") Integer id);

	@GET
	@Path("/get/{id : \\d+}/{name}")
	public SysUser getUser(@PathParam(value = "id") Integer id, @PathParam(value = "name") String name);

	@POST
	@Path("/testpost")
	public void testpost();

	@POST
	@Path("/postUser")
	public SysUser postUser(SysUser user);

	@POST
	@Path("/post/{id}")
	public SysUser postUser(@PathParam(value = "id") String id);

}
