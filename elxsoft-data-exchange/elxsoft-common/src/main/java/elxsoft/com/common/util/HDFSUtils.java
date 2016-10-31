/**
 * Copyright 2016 TPRI. All Rights Reserved.
 */
package elxsoft.com.common.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * <B>系统名称(System)：</B><BR>
 * <B>模块名称(Module)：</B><BR>
 * <B>中文类名(Name)：</B><BR>
 * <B>概要说明(Description)：</B><BR>
 * 
 * @author Alex
 */
public class HDFSUtils
{
	public static void main(String[] args) throws Exception
	{

		Configuration conf = new Configuration();

		FileSystem hdfs = FileSystem.get(conf);

		Path dfs = new Path("/TestDir");

		hdfs.mkdirs(dfs);

	}
}
