package elxsoft.com.system.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import elxsoft.system.entity.SysUser;
import elxsoft.system.facade.SysUserFacade;

/**
 * 
 * <B>系统名称(System)：</B><BR>
 * <B>模块名称(Module)：</B><BR>
 * <B>中文类名(Name)：</B><BR>
 * <B>概要说明(Description)：</B><BR>
 * 
 * @author Alex
 */
@Controller
public class SysIndexController
{
	@Autowired
	private SysUserFacade sysUserFacade;

	/**
	 * <B>方法名称：</B>系统首页<BR>
	 * <B>概要说明：</B><BR>
	 * 
	 * @param request
	 *            页面请求
	 * @param response
	 *            页面响应
	 * @param dataYear
	 *            年份
	 * @return ModelAndView 模型视图
	 */
	@RequestMapping("/sysindex.html")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView ret = new ModelAndView("sys_index");

		return ret;
	}
	
	@RequestMapping("/sysuser.html")
	public ModelAndView facade(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView ret = new ModelAndView("sys_index");
		System.out.print(this.sysUserFacade);
		
		SysUser user = this.sysUserFacade.getUser();
        System.out.println(user);
		return ret;
	}

}
