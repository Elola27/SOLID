package ISP;

public class EmailSender {
	 public static void sendEmail(Person c, String message){
		// Mezu bat bidaltzen du Person klaseko korreo helbidera. 
		 String a=c.getEmailAddress();
		 System.out.println(message + " mezua bidali zaio" + a + "mailera");
	 }
}
