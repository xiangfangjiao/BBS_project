package pojo;

import com.mysql.fabric.xmlrpc.base.Data;

public class bbs_user {
	private String userId;
	private String userPsw;
	private String userAlice;
	private String userEmail;
	private String userSex;
	private String userPhoto;
	private double userScore;
	private int userLevel;
	private Data userDown;
	private Data userLock;
	private Data userCreateDate;
	public bbs_user() {}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPsw() {
		return userPsw;
	}
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	public String getUserAlice() {
		return userAlice;
	}
	public void setUserAlice(String userAlice) {
		this.userAlice = userAlice;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public double getUserScore() {
		return userScore;
	}
	public void setUserScore(double userScore) {
		this.userScore = userScore;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public Data getUserDown() {
		return userDown;
	}
	public void setUserDown(Data userDown) {
		this.userDown = userDown;
	}
	public Data getUserLock() {
		return userLock;
	}
	public void setUserLock(Data userLock) {
		this.userLock = userLock;
	}
	public Data getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(Data userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
}
