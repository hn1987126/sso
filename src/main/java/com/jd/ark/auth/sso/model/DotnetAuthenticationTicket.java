package com.jd.ark.auth.sso.model;

public class DotnetAuthenticationTicket {
	private int user_id;
	private String username;
	private String username_cn;
	private int depart_node_id;
	private String email_address;
	private String mobile_phone_number;
	private String im_account;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername_cn() {
		return username_cn;
	}

	public void setUsername_cn(String username_cn) {
		this.username_cn = username_cn;
	}

	public int getDepart_node_id() {
		return depart_node_id;
	}

	public void setDepart_node_id(int depart_node_id) {
		this.depart_node_id = depart_node_id;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getMobile_phone_number() {
		return mobile_phone_number;
	}

	public void setMobile_phone_number(String mobile_phone_number) {
		this.mobile_phone_number = mobile_phone_number;
	}

	public String getIm_account() {
		return im_account;
	}

	public void setIm_account(String im_account) {
		this.im_account = im_account;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depart_node_id;
		result = prime * result + ((email_address == null) ? 0 : email_address.hashCode());
		result = prime * result + ((im_account == null) ? 0 : im_account.hashCode());
		result = prime * result + ((mobile_phone_number == null) ? 0 : mobile_phone_number.hashCode());
		result = prime * result + user_id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((username_cn == null) ? 0 : username_cn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DotnetAuthenticationTicket other = (DotnetAuthenticationTicket) obj;
		if (depart_node_id != other.depart_node_id)
			return false;
		if (email_address == null) {
			if (other.email_address != null)
				return false;
		} else if (!email_address.equals(other.email_address))
			return false;
		if (im_account == null) {
			if (other.im_account != null)
				return false;
		} else if (!im_account.equals(other.im_account))
			return false;
		if (mobile_phone_number == null) {
			if (other.mobile_phone_number != null)
				return false;
		} else if (!mobile_phone_number.equals(other.mobile_phone_number))
			return false;
		if (user_id != other.user_id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (username_cn == null) {
			if (other.username_cn != null)
				return false;
		} else if (!username_cn.equals(other.username_cn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DotnetAuthenticationTicket [user_id=" + user_id + ", username=" + username + ", username_cn="
				+ username_cn + ", depart_node_id=" + depart_node_id + ", email_address=" + email_address
				+ ", mobile_phone_number=" + mobile_phone_number + ", im_account=" + im_account + "]";
	}
	
}
