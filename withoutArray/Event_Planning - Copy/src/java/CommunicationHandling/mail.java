///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package CommunicationHandling;
//
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class mail
{
     public void notifyServiceProvider(String mailAdd){
         String Content= "your have new order please refer EVENTZ.";
         String title="new order";
         
         sendmail(mailAdd,title,Content);
        }
        
        public void notifyCustomerProvider(String mailAdd){
        
          String Content= "your have a reply from service provider. Please check your service orders from EVENTZ";
         String title="reply from service provider";
         
         sendmail(mailAdd,title,Content);
        
        
        }
public void sendmail(String mailadd , String header , String content)
{    
    // Sender's email ID needs to be mentioned
     String from = "eventz.sl@yahoo.com";
     String pass ="Eve@123";
    // Recipient's email ID needs to be mentioned.
   String to = mailadd;
   String host = "smtp.mail.yahoo.com";

   // Get system properties
   Properties properties = System.getProperties();
   // Setup mail server
   properties.put("mail.smtp.starttls.enable", "true");
   properties.put("mail.smtp.host", host);
   properties.put("mail.smtp.user", from);
   properties.put("mail.smtp.password", pass);
   properties.put("mail.smtp.port", "587");
   properties.put("mail.smtp.auth", "true");

   // Get the default Session object.
   Session session = Session.getDefaultInstance(properties);

   try{
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));

      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO,
                               new InternetAddress(to));

      // Set Subject: header field
      message.setSubject(header);

      // Now set the actual message
      message.setText(content);

      // Send message
      Transport transport = session.getTransport("smtp");
      transport.connect(host, from, pass);
      transport.sendMessage(message, message.getAllRecipients());
      transport.close();
      System.out.println("Sent message successfully....");
   }catch (MessagingException mex) {
      mex.printStackTrace();
   }
}
}
