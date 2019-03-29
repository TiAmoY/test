package mybatis.auth.po;
/**
 * 不用基本类型定义属性
 * 	    |
 *      V	
 *    封装类
 *    	
 * 
 * @author think
 *
 */

import java.sql.Date;

public class SysUser {
	private Integer id;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userInfo;
	private byte[] headImg;
	private Date createTime; 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public byte[] getHeadImg() {
		return headImg;
	}
	public void setHeadImg(byte[] headImg) {
		this.headImg = headImg;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+this.id+"	name:"+this.userName;
	}
}
