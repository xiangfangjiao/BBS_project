package pojo;

import com.mysql.fabric.xmlrpc.base.Data;

public class bbs_invitation {
	private String invitationId;
	private String invitationMessage;
	private String userId;
	private int plateId;
	private int categoryId;
	private int isPass;
	private int isEnable;
	private int isCream;
	private Data invitationCreate;
	private Data invitationModify;
	public bbs_invitation() {}
	public String getInvitationId() {
		return invitationId;
	}
	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}
	public String getInvitationMessage() {
		return invitationMessage;
	}
	public void setInvitationMessage(String invitationMessage) {
		this.invitationMessage = invitationMessage;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getPlateId() {
		return plateId;
	}
	public void setPlateId(int plateId) {
		this.plateId = plateId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getIsPass() {
		return isPass;
	}
	public void setIsPass(int isPass) {
		this.isPass = isPass;
	}
	public int getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	public int getIsCream() {
		return isCream;
	}
	public void setIsCream(int isCream) {
		this.isCream = isCream;
	}
	public Data getInvitationCreate() {
		return invitationCreate;
	}
	public void setInvitationCreate(Data invitationCreate) {
		this.invitationCreate = invitationCreate;
	}
	public Data getInvitationModify() {
		return invitationModify;
	}
	public void setInvitationModify(Data invitationModify) {
		this.invitationModify = invitationModify;
	}
}
