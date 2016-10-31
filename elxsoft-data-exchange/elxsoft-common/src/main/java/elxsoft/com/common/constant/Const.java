package elxsoft.com.common.constant;

public final class Const
{

	/**
	 * <B>构造方法</B><BR>
	 */
	private Const()
	{
	}

	/** 判断代码：是  boolean for YES*/
	public static final String TRUE = "1";

	/** 判断代码：否  boolean for NO */
	public static final String FALSE = "0";

	/** 通用字符集编码 */
	public static final String CHARSET_UTF8 = "UTF-8";

	/** 中文字符集编码 */
	public static final String CHARSET_CHINESE = "GBK";

	/** 英文字符集编码 */
	public static final String CHARSET_LATIN = "ISO-8859-1";

	/** 根节点ID */
	public static final String ROOT_ID = "root";

	/** NULL字符串 */
	public static final String NULL = "null";

	/** 日期格式 */
	public static final String FORMAT_DATE = "yyyy-MM-dd";

	/** 日期时间格式 */
	public static final String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";

	/** 时间戳格式 */
	public static final String FORMAT_TIMESTAMP = "yyyy-MM-dd HH:mm:ss.SSS";

	/** JSON成功标记 */
	public static final String JSON_SUCCESS = "success";

	/** JSON数据 */
	public static final String JSON_DATA = "data";

	/** JSON数据列表 */
	public static final String JSON_ROWS = "rows";

	/** JSON总数 */
	public static final String JSON_TOTAL = "total";

	/** JSON消息文本 */
	public static final String JSON_MESSAGE = "message";
    /** fundamental info */
	public static final String TAG_SYS = "sys";
    /** main message dao*/
	public static final String TAG_MST = "mst";
    /** message queue*/
	public static final String TAG_MQ = "mq";
    /** data */
	public static final String TAG_DAT = "dat";
    /** statistics */
	public static final String TAG_STA = "sta";

	public static final String TAG_INT = "int";

	public static final String[] TAGS = { TAG_SYS, TAG_MST, TAG_MQ, TAG_DAT, TAG_STA, TAG_INT };

	/** Cookie键值：验证键值  Cookie validation*/
	public static final String COOKIE_VALIDATE_KEY = "VALIDATE_KEY";

	/** Cookie键值：验证键值分割符  delimiter*/
	public static final String COOKIE_VALIDATE_KEY_SPLIT = "$_";

	/** 请求属性键值：当前项目标识  Request Current Tag*/
	public static final String REQ_CUR_TAG = "REQ_CUR_TAG";

	/** 请求属性键值：当前用户标识  Request Current User ID*/
	public static final String REQ_CUR_USER_ID = "CUR_USER_ID";

	/** 请求属性键值：当前用户名称  Request Current User Name*/
	public static final String REQ_CUR_USER_NAME = "CUR_USER_NAME";

	/** 请求属性键值：当前机构标识  Request Current Organization ID*/
	public static final String REQ_CUR_ORG_ID = "CUR_ORG_ID";

	/** 请求属性键值：当前角色名称  Request Current Role Code*/
	public static final String REQ_CUR_ROLE_CODE = "CUR_ROLE_CODE";
	
	public static final String SYS_INIT = "SYS_INIT";

}
