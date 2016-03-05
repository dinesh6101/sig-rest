package com.sig.team.webworks.ekirana.mail;

import java.beans.ConstructorProperties;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.io.Resource;
import org.springframework.mail.MailException;
import org.springframework.mail.MailPreparationException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import freemarker.cache.FileTemplateLoader;
import freemarker.core.Environment;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class MailHelper {

	private JavaMailSender mailSender;
	private SimpleMailMessage templateMessage;
	private Configuration freemarkerConfig;

	@ConstructorProperties({ "templateBaseDir", "mailSender", "templateMessage", "freemarkerConfig" })
	public MailHelper(Resource templateBaseDir, JavaMailSender mailSender, SimpleMailMessage templateMessage, Configuration freemarkerConfig) {
		this.mailSender = mailSender;
		this.templateMessage = templateMessage;
		this.freemarkerConfig = freemarkerConfig;
		try {
			FileTemplateLoader fileTemplateLoader = new FileTemplateLoader(templateBaseDir.getFile());
			this.freemarkerConfig.setTemplateLoader(fileTemplateLoader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public SimpleMailMessage getTemplateMessage() {
		return templateMessage;
	}

	public void setTemplateMessage(SimpleMailMessage templateMessage) {
		this.templateMessage = templateMessage;
	}

	public Configuration getFreemarkerConfig() {
		return freemarkerConfig;
	}

	public void setFreemarkerConfig(Configuration freemarkerConfig) {
		this.freemarkerConfig = freemarkerConfig;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendMail(String mailTemplateName, String toAddress, Map<String, String> valueReplacementMap) throws MailException {
		try {
			SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
			msg.setTo(toAddress);
			Template template = freemarkerConfig.getTemplate(mailTemplateName + ".ftl", LocaleContextHolder.getLocale());
			Writer out = new StringWriter();
			Environment env = template.createProcessingEnvironment(valueReplacementMap, out);
			env.setLocale(LocaleContextHolder.getLocale());
			env.process();
			msg.setText(out.toString());
			//mailSender.send(msg);
		} catch (IOException ex) {
			throw new MailPreparationException("Failed to load Template: " + mailTemplateName, ex);
		} catch (TemplateException ex) {
			throw new MailPreparationException("Failed to populate Template:" + mailTemplateName + ", with provided replacement values", ex);
		} catch (MailException ex) {
			throw ex;
		}
	}

	public void sendMail(String mailTemplateName, String toAddress, String subject, Map<String, String> valueReplacementMap) throws MailException {
		try {
			SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
			msg.setTo(toAddress);
			msg.setSubject(subject);
			Template template = freemarkerConfig.getTemplate(mailTemplateName + ".ftl", LocaleContextHolder.getLocale());
			Writer out = new StringWriter();
			Environment env = template.createProcessingEnvironment(valueReplacementMap, out);
			env.setLocale(LocaleContextHolder.getLocale());
			env.process();
			msg.setText(out.toString());
			//this.mailSender.send(msg);
		} catch (IOException ex) {
			throw new MailPreparationException("Failed to load Template: " + mailTemplateName, ex);
		} catch (TemplateException ex) {
			throw new MailPreparationException("Failed to populate Template:" + mailTemplateName + ", with provided replacement values", ex);
		} catch (MailException ex) {
			throw ex;
		}
	}

	public void sendSmsAsEmail(String mailTemplateName, String toAddress, Map<String, String> valueReplacementMap) throws MailException {
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setFrom("ClientServices");
			msg.setSubject(null);
			msg.setTo(toAddress);
			Template template = freemarkerConfig.getTemplate(mailTemplateName + ".ftl", LocaleContextHolder.getLocale());
			Writer out = new StringWriter();
			Environment env = template.createProcessingEnvironment(valueReplacementMap, out);
			env.setLocale(LocaleContextHolder.getLocale());
			env.process();
			msg.setText(out.toString());
			//this.mailSender.send(msg);
		} catch (IOException ex) {
			throw new MailPreparationException("Failed to load Template: " + mailTemplateName, ex);
		} catch (TemplateException ex) {
			throw new MailPreparationException("Failed to populate Template:" + mailTemplateName + ", with provided replacement values", ex);
		} catch (MailException ex) {
			throw ex;
		}
	}
}
