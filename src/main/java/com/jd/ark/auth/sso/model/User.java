package com.jd.ark.auth.sso.model;

/**
 * Created by chenyi9 on 2017/7/13.
 */
public class User {

    private String userCode;
    private String userName;
    private String realName;
    private String email;
    private String mobile;
    private String sex;
    private String organizationCode;
    private String organizationName;
    private String organizationFullPath;
    private String organizationFullName;
    private String positionCode;
    private String positionName;
    private String levelCode;
    private String levelName;

    public User() {

    }

    public User(String userCode, String userName, String realName, String email, String mobile, String sex, String organizationCode, String organizationName, String organizationFullPath, String organizationFullName, String positionCode, String positionName, String levelCode, String levelName) {
        this.userCode = userCode;
        this.userName = userName;
        this.realName = realName;
        this.email = email;
        this.mobile = mobile;
        this.sex = sex;
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationFullPath = organizationFullPath;
        this.organizationFullName = organizationFullName;
        this.positionCode = positionCode;
        this.positionName = positionName;
        this.levelCode = levelCode;
        this.levelName = levelName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationFullPath() {
        return organizationFullPath;
    }

    public void setOrganizationFullPath(String organizationFullPath) {
        this.organizationFullPath = organizationFullPath;
    }

    public String getOrganizationFullName() {
        return organizationFullName;
    }

    public void setOrganizationFullName(String organizationFullName) {
        this.organizationFullName = organizationFullName;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userCode != null ? !userCode.equals(user.userCode) : user.userCode != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (realName != null ? !realName.equals(user.realName) : user.realName != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (mobile != null ? !mobile.equals(user.mobile) : user.mobile != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (organizationCode != null ? !organizationCode.equals(user.organizationCode) : user.organizationCode != null)
            return false;
        if (organizationName != null ? !organizationName.equals(user.organizationName) : user.organizationName != null)
            return false;
        if (organizationFullPath != null ? !organizationFullPath.equals(user.organizationFullPath) : user.organizationFullPath != null)
            return false;
        if (organizationFullName != null ? !organizationFullName.equals(user.organizationFullName) : user.organizationFullName != null)
            return false;
        if (positionCode != null ? !positionCode.equals(user.positionCode) : user.positionCode != null) return false;
        if (positionName != null ? !positionName.equals(user.positionName) : user.positionName != null) return false;
        if (levelCode != null ? !levelCode.equals(user.levelCode) : user.levelCode != null) return false;
        return levelName != null ? levelName.equals(user.levelName) : user.levelName == null;
    }

    @Override
    public int hashCode() {
        int result = userCode != null ? userCode.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
        result = 31 * result + (organizationFullPath != null ? organizationFullPath.hashCode() : 0);
        result = 31 * result + (organizationFullName != null ? organizationFullName.hashCode() : 0);
        result = 31 * result + (positionCode != null ? positionCode.hashCode() : 0);
        result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
        result = 31 * result + (levelCode != null ? levelCode.hashCode() : 0);
        result = 31 * result + (levelName != null ? levelName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sex='" + sex + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", organizationFullPath='" + organizationFullPath + '\'' +
                ", organizationFullName='" + organizationFullName + '\'' +
                ", positionCode='" + positionCode + '\'' +
                ", positionName='" + positionName + '\'' +
                ", levelCode='" + levelCode + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
