package action;

import com.opensymphony.xwork2.ActionSupport;

public class loginaction extends ActionSupport {
	
	private String uname;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String execute(){
		return SUCCESS;
	}

}
