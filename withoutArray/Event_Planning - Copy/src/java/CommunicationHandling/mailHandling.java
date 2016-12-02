/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationHandling;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author Thilini.Samaranayake
 */
    public class mailHandling {
        
        public void notifyServiceProvider(String mailAdd){
         String Content= "your have new order";
         String title="new order";
         
         sendmail(mailAdd,title,Content);
        }
        
        public void notifyCustomerProvider(String mailAdd){
        
          String Content= "your have a reply from service provider";
         String title="reply from service provider";
         
         sendmail(mailAdd,title,Content);
        
        
        }
               
      public void sendmail(String reciever ,String sub, String Content) {
        final String username = "eventz.sl";
        final String password = "Eve@123";
        final String recipient = reciever;
        final String subject = sub ;
        final String emailmessage = Content;

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        props.put("mail.smtp.port", "25");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
            message.setSubject(subject);
            message.setText(emailmessage);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    }
   
   

    
    



