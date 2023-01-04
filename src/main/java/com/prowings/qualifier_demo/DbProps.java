package com.prowings.qualifier_demo;

public class DbProps {
	
	String url;
	String usr;
	String pwd;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsr() {
		return usr;
	}
	public void setUsr(String usr) {
		this.usr = usr;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "DbProps [url=" + url + ", usr=" + usr + ", pwd=" + pwd + "]";
	}
	
	

}
