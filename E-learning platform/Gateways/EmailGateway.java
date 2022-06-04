package Gateways;

import Messages.DailyNewsEmail;
import Messages.GradeAnnouncementEmail;
import Messages.TaskAddedEmail;

public class EmailGateway
{
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsEmail) {
			DailyNewsEmail dailyNewsEmailMessage = (DailyNewsEmail) message;
			
			dailyNewsEmailMessage.prepareMessages(placeHolders);
			
			// some code to send message
		}
		else if(message instanceof GradeAnnouncementEmail) {
			GradeAnnouncementEmail announcementEmailMessage = (GradeAnnouncementEmail) message;
			
			announcementEmailMessage.prepareMessages(placeHolders);
			
			// some code to send message
		}
		else if(message instanceof TaskAddedEmail) {
			TaskAddedEmail addedEmailMessage = (TaskAddedEmail) message;
			
			addedEmailMessage.prepareMessages(placeHolders);
			
			// some code to send message by email to user
		}
	}
}
