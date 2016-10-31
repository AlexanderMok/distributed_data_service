package elxsoft.msgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import elxsoft.msgt.dao.MstSiteDao;
import elxsoft.msgt.facade.MstSiteFacade;

/**
 * 
 * <B>系统名称(System)：</B><BR>
 * <B>模块名称(Module)：</B><BR>
 * <B>中文类名(Name)：</B><BR>
 * <B>概要说明(Description)：</B>数据库层的访问<BR>
 * 
 * @author Alex
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = elxsoft.msgt.facade.MstSiteFacade.class, protocol = {
		"dubbo" })
public class MstSiteService implements MstSiteFacade
{

	@Autowired
	private MstSiteDao mstSiteDao;

	public void insert(JSONObject json) throws Exception
	{
		this.mstSiteDao.insert(json);
	}

	public int update(JSONObject json) throws Exception
	{
		return this.mstSiteDao.update(json);
	}

	public List<JSONObject> getList(JSONObject jsonParam, int start, int limit) throws Exception
	{
		return this.mstSiteDao.getList(jsonParam, start, limit);
	}

	public int getTotal(JSONObject jsonParam)
	{
		return this.mstSiteDao.getTotal(jsonParam);
	}

	public JSONObject get(String siteId)
	{
		return this.mstSiteDao.get(siteId);
	}

}
