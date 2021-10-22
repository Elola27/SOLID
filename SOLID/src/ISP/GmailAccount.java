package ISP;

public class GmailAccount extends EmailSendable{

	String name;
	String emailAddress;
	
	public GmailAccount(String a,String b) {
		name=a;
		emailAddress=b;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
}
