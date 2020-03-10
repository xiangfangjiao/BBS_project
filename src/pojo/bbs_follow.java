package pojo;

import com.mysql.fabric.xmlrpc.base.Data;

public class bbs_follow {
	private String userId;
	private String beUserId;
	private Data followDate;
	public bbs_follow() {}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBeUserId() {
		return beUserId;
	}
	public void setBeUserId(String beUserId) {
		this.beUserId = beUserId;
	}
	public Data getFollowDate() {
		return followDate;
	}
	public void setFollowDate(Data followDate) {
		this.followDate = followDate;
	}
}
