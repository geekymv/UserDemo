package com.geekymv.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class HttpClientUtil {
	
	public static void main(String[] args) {
		String ip = "210.45.176.3";
		String result = httpGet(ip);
		System.out.println(result);
		
		List<String> results = parserXml(result);
		
		System.out.println(results);
	}

	/**
	 *
	 * @author: miying
	 * @createTime: 2015年8月19日 下午11:32:54
	 * @history:
	 * @param ip
	 * @return String
	 */
	public static String httpGet(String ip) {
		   CloseableHttpClient httpclient = HttpClients.createDefault();
	        try {
	            HttpGet httpget = new HttpGet("http://www.webxml.com.cn"
	            		+ "/WebServices/IpAddressSearchWebService.asmx/getCountryCityByIp?theIpAddress=" + ip);

//	            System.out.println("Executing request " + httpget.getRequestLine());
	            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
	            	@Override
	                public String handleResponse(
	                        final HttpResponse response) throws ClientProtocolException, IOException {
	                    int status = response.getStatusLine().getStatusCode();
	                    if (status >= 200 && status < 300) {
	                        HttpEntity entity = response.getEntity();
	                        return entity != null ? EntityUtils.toString(entity) : null;
	                    } else {
	                        throw new ClientProtocolException("Unexpected response status: " + status);
	                    }
	                }

	            };
	            String responseBody = httpclient.execute(httpget, responseHandler);
//	            System.out.println("----------------------------------------");
//	            System.out.println(responseBody);
	            
	            return responseBody;
	            
	        } catch(Exception e) {
	        	e.printStackTrace();
	        } finally {
	            try {
					httpclient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
			return "";
	
	}
	
	/**
	 * 解析xml 获取数据
	 *
	 * @author: miying@iflytek.com
	 * @createTime: 2015年8月22日 下午12:14:15
	 * @history:
	 * @param xml
	 * @return List<String>
	 */
	public static List<String> parserXml(String xml) {
		List<String> datas = new ArrayList<String>();
		try {
			Document doc = DocumentHelper.parseText(xml);
			Element root = doc.getRootElement();
			
			for(Iterator<Element> iter = root.elementIterator(); iter.hasNext(); ) {
				Element ele = iter.next();
				String res = ele.getTextTrim();
				datas.add(res);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return datas;
	}
}
