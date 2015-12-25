package com.geekymv.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

import com.google.gson.JsonObject;

public class HttpClientUtil {
	
	@Test
	public void testPost() {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://localhost:8080/UserDemo/post");
		
		try {
			HttpResponse response = client.execute(post);
			
			int statusCode = response.getStatusLine().getStatusCode();
			
			System.out.println(statusCode);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(client != null) {
					client.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	public static void requestJson() {
		String host = "http://miying.sinaapp.com";
		CloseableHttpClient client = HttpClients.createDefault();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", "miying");
		jsonObject.addProperty("password", "123");

//		System.out.println(jsonObject.toString());
		
		HttpPost post = new HttpPost(host+"/api/login/");
		StringEntity entity = new StringEntity(jsonObject.toString(), "utf-8");
		post.setEntity(entity);
		
		post.addHeader("Content-type","application/json;charset=UTF-8");  
//		post.setHeader("Host", host);
//		post.setHeader("Cookie", "saeut=CkMPGlYk1Ske2DcpGBPrAg==; csrftoken=NvwFYdB7ZPE2PnKCrG6IFHOLdThhT9yp; sessionid=uh7wy5d6wc5qhjst3jc38crxbhtv77mw");
//		post.setHeader("Origin:", host);
//		post.setHeader("Referer", host+"/api/");
//		post.setHeader("Accept", "application/json");  
//		post.setHeader("User-Agent", 
//				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.101 Safari/537.36");
		try {
			HttpResponse response = client.execute(post);
			String result = EntityUtils.toString(response.getEntity(), "utf-8");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(client != null) {
					client.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		requestJson();
		
//		String ip = "210.45.176.3";
//		String result = httpGet(ip);
//		System.out.println(result);
		
//		List<String> results = parserXml(result);
		
//		System.out.println(results);

	
//		String res = httpPost();
//		List<String> results = parserXml(res);
//
//		System.out.println(results);
		
		/*
		String host = "http://webservice.webxml.com.cn";
		String uri = "/WebServices/WeatherWS.asmx/getWeather";
		String url = host + uri;
		
		// 构造请求参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("theCityCode", "合肥"));
		params.add(new BasicNameValuePair("theUserID", ""));
		
		requestPost(url, params);
		*/
		
	}
	
	
	
	/**
	 * http-post请求
	 *
	 * @author: miying
	 * @createTime: 2015年9月12日 下午2:46:07
	 * @history:
	 * @param url 请求地址
	 * @param params 请求参数
	 * @return String
	 */
	public static String requestPost(final String url, final List<NameValuePair> params) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				CloseableHttpClient client = HttpClients.createDefault();
				try {
					HttpPost post = new HttpPost(url);
					post.setHeader("User-Agent", 
							"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.101 Safari/537.36");
					// 设置请求参数
					post.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
					
					CloseableHttpResponse response = client.execute(post);
					String result = EntityUtils.toString(response.getEntity(), "utf-8");
					
					System.out.println(result);
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if(client != null) {
							client.close();
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				
			}
		}).start();
		
		
		return null;
	} 
	
	
	/**
	 * post
	 *
	 * @author: miying
	 * @createTime: 2015年9月12日 下午2:37:48
	 * @history:
	 * @return String
	 */
	public static String httpPost() {
		String host = "http://webservice.webxml.com.cn";
		String uri = "/WebServices/WeatherWS.asmx/getWeather";
		String url = host + uri;
		
		CloseableHttpClient client = HttpClients.createDefault();
		try {
			HttpPost post = new HttpPost(url);
			
			// 构造请求参数
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			parameters.add(new BasicNameValuePair("theCityCode", "合肥"));
			parameters.add(new BasicNameValuePair("theUserID", ""));
		
//			post.setHeader("Origin", "http://webservice.webxml.com.cn");
//			post.setHeader("Content-Type", "application/x-www-form-urlencoded");
			post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.101 Safari/537.36");
			
			// 设置请求参数
			post.setEntity(new UrlEncodedFormEntity(parameters, "utf-8"));
			
			CloseableHttpResponse response = client.execute(post);
			
			String res = EntityUtils.toString(response.getEntity(), "utf-8");
			
			System.out.println(res);
			
			return res;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(client != null) {
					client.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return null;
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

	            System.out.println("Executing request " + httpget.getRequestLine());
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
