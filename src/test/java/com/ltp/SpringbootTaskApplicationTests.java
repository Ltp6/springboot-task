package com.ltp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTaskApplicationTests {
    /**
     * @return
     * @Author Ltp
     * @Description 发送邮件
     * @Date 2019/5/14 11:11
     * @Param
     **/
    @Autowired
    private JavaMailSenderImpl javaMailSender;

    /**
     * @return
     * @Author Ltp
     * @Description 简单邮件发送
     * @Date 2019/5/14 11:35
     * @Param
     **/
    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        //邮件标题
        message.setSubject("通知");
        //邮件内容
        message.setText("你中了500万");
        //收件人
        message.setTo("18502825783@163.com");
        //发件人
        message.setFrom("li_tian_peng@qq.com");

        javaMailSender.send(message);
    }

    /**
     * @return
     * @Author Ltp
     * @Description 复杂邮件发送
     * @Date 2019/5/14 11:35
     * @Param
     **/
    @Test
    public void sendMail() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        //邮件标题
        messageHelper.setSubject("通知");
        //邮件内容
        messageHelper.setText("<h2>恭喜恭喜</h2>", true);
        //邮件附件
        messageHelper.addAttachment("CAP图.jpg", new File("E:\\文档\\图片\\CAP图.jpg"));
        messageHelper.addAttachment("codes.zip", new File("E:\\BaiduNetdiskDownload\\尚硅谷 Spring Cloud 视频教程全集\\codes.zip"));
        //收件人
        messageHelper.setTo("18502825783@163.com");
        //发件人
        messageHelper.setFrom("li_tian_peng@qq.com");
        javaMailSender.send(mimeMessage);
    }

}
