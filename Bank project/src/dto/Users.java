package dto;

public class Users {
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Users [uname=" + uname + ", passwd=" + passwd + "]";
	}
	public Users(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	}
	String uname;
	String passwd;
}
