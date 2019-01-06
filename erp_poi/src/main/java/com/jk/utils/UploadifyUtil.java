/**
 * <pre>项目名称:web_zys1 
 * 文件名称:UploadifyUtil.java 
 * 包名:com.jk.util 
 * 创建日期:2018年7月16日上午9:38:21 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */
package com.jk.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * <pre>项目名称：web_zys1s
 * 类名称：UploadifyUtil
 * 类描述：
 * 创建人:左宇胜
 * 创建时间：2018年7月16日 上午9:38:21
 * 修改人：
 * 修改时间：2018年7月16日 上午9:38:21
 * 修改备注：
 * @version </pre>
 */
public class UploadifyUtil {
        public static String upload(MultipartFile imgFile,HttpServletRequest request) throws Exception{
                //获取原文件名称
                String fileName = imgFile.getOriginalFilename();
                String folderPath = request.getSession().getServletContext().getRealPath("/")+
                        "upload/";
                File file = new File(folderPath);
                //该目录是否已经存在
                if(!file.exists()){
                        //   创建文件夹
                        file.mkdir();
                }
                String onlyFileName = UUID.randomUUID().toString()+fileName.substring(fileName.lastIndexOf('.'));
                FileOutputStream fos = new FileOutputStream(folderPath+onlyFileName);
                fos.write(imgFile.getBytes());
                fos.flush();
                fos.close();
                return  "upload/"+onlyFileName;
        }
}
