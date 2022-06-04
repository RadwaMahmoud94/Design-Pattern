package Gateways;

import Messages.DailyNewsMobile;
import Messages.GradeAnnouncementMobile;
import Messages.TaskAddedMobile;

public class SMSGateway {
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMobile) {
			DailyNewsMobile msg = (DailyNewsMobile) message;
			
			msg.prepareMessages(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradeAnnouncementMobile) {
			GradeAnnouncementMobile msg = (GradeAnnouncementMobile) message;
			
			msg.prepareMessages(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMobile) {
			TaskAddedMobile msg = (TaskAddedMobile) message;
			
			msg.prepareMessages(placeHolders);
			
			// some code to send message to user
		}
		
	}
}
