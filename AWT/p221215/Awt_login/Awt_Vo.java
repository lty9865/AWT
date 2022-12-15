package Awt_login;

public class Awt_Vo {
	private String userID;
	private String userPW;

	public Awt_Vo() {

	}

	public Awt_Vo(String userID, String userPW) {
		this.userID = userID;
		this.userPW = userPW;
	}

	public String getID() {
		return userID;
	}

	public String getPW() {
		return userPW;
	}
}
