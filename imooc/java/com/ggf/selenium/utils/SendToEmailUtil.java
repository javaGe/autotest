package com.ggf.selenium.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
/**
 * Created by foresee on 2019/4/11.
 */
public class SendToEmailUtil {
    public static void send(String subject, String content) throws Exception{
        Properties properties = new Properties();
        properties.put("mail.transport.protocol", "smtp");// 连接协议
        properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
        properties.put("mail.smtp.port", 465);// 端口号
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
        properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
        // 得到回话对象
        Session session = Session.getInstance(properties);
        // 获取邮件对象
        Message message = new MimeMessage(session);
        // 设置发件人邮箱地址
        message.setFrom(new InternetAddress("2698589777@qq.com"));
        // 设置收件人邮箱地址
        message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com")});
        //message.setRecipient(Message.RecipientType.TO, new InternetAddress("xxx@qq.com"));//一个收件人
        // 设置邮件标题
        message.setSubject(subject);
        // 设置邮件内容
        message.setText(content);
        // 得到邮差对象
        Transport transport = session.getTransport();
        // 连接自己的邮箱账户
        transport.connect("627317664@qq.com", "hgmwtgcgiolobfba");// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码
        // 发送邮件
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

    public static void sendEmail(String subject, String content) {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.163.com");
        email.setAuthentication("15813081353@163.com","g15813081353");

        try {
            email.setFrom("15813081353@163.com");
            email.addTo("627317664@qq.com");
            email.setSubject(subject);
            email.setContent(content,"text/html;charset=utf-8");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }




    }

  public static void main(String[] args) throws Exception {
        sendEmail("自动化测试", "测试内容");
    }

}
