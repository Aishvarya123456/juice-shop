package org.pageobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datas {
	 @JsonProperty("UserId") 
	public int userId;
    public int id;
    public String fullName;
    public String cardNum;
    public int expMonth;
    public int expYear;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Datas that = (Datas) o;

        if (expMonth != that.expMonth) return false;
        if (expYear != that.expYear) return false;
        return cardNum.equals(that.cardNum);
    }

    @Override
    public int hashCode() {
        int result = cardNum.hashCode();
        result = 31 * result + expMonth;
        result = 31 * result + expYear;
        return result;
    }
	@Override
	public String toString() {
		return "Datas [userId=" + userId + ", id=" + id + ", fullName=" + fullName + ", cardNum=" + cardNum
				+ ", expMonth=" + expMonth + ", expYear=" + expYear + "]";
	}
	
    

}
