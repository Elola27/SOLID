package ISP;

public class Person extends EmailSendable implements Telephonable {
	 String name, address, email, telephone;
	 public void setName(String n) { name=n; }
	 public String getName() { return name; }

	 public void setAddress(String a) { address=a; }
	 public String getAddress() { return address; }

	 public void setEmail (String e) { email=e; }
	 @Override
	 public String getEmailAddress () { return email; }

	 public void setTelephone(String t) { telephone=t; }
	 
	 public String getTelephone() { return telephone; }

	}