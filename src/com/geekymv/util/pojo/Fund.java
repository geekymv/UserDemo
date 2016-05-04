package com.geekymv.util.pojo;


public class Fund {
	/**
	 * sData是其他字段的json串
	 */
	private String sData;
	
	private String sSearchNumber;
	/**
	 * 中心个人账号
	 */
	private String sDwzhGrzh;
	/**
	 * 身份证
	 */
	private String sIDCard;
	/**
	 * 姓名
	 */
	private String sName;
	/**
	 * 所在单位名称
	 */
	private String sJobName;
	/**
	 * 开户日期
	 */
	private String Khrq;
	/**
	 * 单位月交额
	 */
	private String Dwyje;
	/**
	 * 个人月交额
	 */
	private String Gryje;
	/**
	 * 月工资额
	 */
	private String Gze;

	/**
	 * 公积金余额
	 */
	private String Ye;
	
	public Fund() {
	}

	public Fund(String sSearchNumber, String sDwzhGrzh, String sIDCard,
			String sName, String sJobName, String khrq, String dwyje,
			String gryje, String gze, String Ye) {
		this.sSearchNumber = sSearchNumber;
		this.sDwzhGrzh = sDwzhGrzh;
		this.sIDCard = sIDCard;
		this.sName = sName;
		this.sJobName = sJobName;
		this.Khrq = khrq;
		this.Dwyje = dwyje;
		this.Gryje = gryje;
		this.Gze = gze;
		this.Ye = Ye;
	}



	public String getsData() {
		return sData;
	}
	public void setsData(String sData) {
		this.sData = sData;
	}
	public String getsSearchNumber() {
		return sSearchNumber;
	}
	public void setsSearchNumber(String sSearchNumber) {
		this.sSearchNumber = sSearchNumber;
	}
	public String getsDwzhGrzh() {
		return sDwzhGrzh;
	}
	public void setsDwzhGrzh(String sDwzhGrzh) {
		this.sDwzhGrzh = sDwzhGrzh;
	}
	public String getsIDCard() {
		return sIDCard;
	}
	public void setsIDCard(String sIDCard) {
		this.sIDCard = sIDCard;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsJobName() {
		return sJobName;
	}
	public void setsJobName(String sJobName) {
		this.sJobName = sJobName;
	}
	public String getKhrq() {
		return Khrq;
	}
	public void setKhrq(String khrq) {
		Khrq = khrq;
	}
	public String getDwyje() {
		return Dwyje;
	}
	public void setDwyje(String dwyje) {
		Dwyje = dwyje;
	}
	public String getGryje() {
		return Gryje;
	}
	public void setGryje(String gryje) {
		Gryje = gryje;
	}
	public String getGze() {
		return Gze;
	}
	public void setGze(String gze) {
		Gze = gze;
	}

	public String getYe() {
		return Ye;
	}
	public void setYe(String ye) {
		Ye = ye;
	}
	
}
