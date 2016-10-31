package elxsoft.msgt.facade;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public interface MstSiteFacade {
	
	public List<JSONObject> getList(JSONObject jsonParam, int start , int limit) throws Exception;

	public int getTotal(JSONObject jsonParam);
	
	public void insert(JSONObject jsonObject) throws Exception;
	
	public int update(JSONObject json) throws Exception;
	
	public JSONObject get(String siteId) throws Exception;
	
}
