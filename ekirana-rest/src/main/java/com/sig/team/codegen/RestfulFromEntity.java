package com.sig.team.codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class RestfulFromEntity {

	private String REPOSITORY_LOCATION = "src/main/java/com/sig/team/webworks/crud/restful/";

	public static void main(String[] args) {
		new RestfulFromEntity().exec();
	}

	public void exec() {

		File folder = new File("src/main/java/com/sig/team/webworks/crud/entity");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.println(file.getName());
				generateRepositoryFromModel(file.getName());
			}
		}

	}

	private void generateRepositoryFromModel(String name) {
		/* first, get and initialize an engine */
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		/* next, get the Template */
		Template t = ve.getTemplate("src/main/java/com/sig/team/codegen/RestfulFromEntity.vm");

		String domainClass = name.replaceAll(".java", "");
		String domainVariable;
		String className;
		String repositoryClass;
		String repositoryClassVariable;

		try {
			/* create a context and add data */
			VelocityContext context = new VelocityContext();
			context.put("domainClass", domainClass);

			className = domainClass + "Rest";
			context.put("className", className);

			domainVariable = domainClass;
			domainVariable = Character.toLowerCase(domainVariable.charAt(0)) + domainVariable.substring(1);
			context.put("domainVariable", domainVariable);

			repositoryClass = domainClass + "Repository";
			context.put("repositoryClass", repositoryClass);

			repositoryClassVariable = repositoryClass;
			repositoryClassVariable = Character.toLowerCase(repositoryClassVariable.charAt(0)) + repositoryClassVariable.substring(1);
			context.put("repositoryClassVariable", repositoryClassVariable);

			context.put("findAll", repositoryClassVariable + ".findAll");
			context.put("findOne", repositoryClassVariable + ".findOne");
			context.put("delete", repositoryClassVariable + ".delete");
			context.put("save", repositoryClassVariable + ".save");

			/* now render the template into a StringWriter */
			StringWriter writer = new StringWriter();
			t.merge(context, writer);
			/* show the World */

			File file = new File(REPOSITORY_LOCATION + className + ".java");
			FileWriter fileWriter = new FileWriter(file);
			file.createNewFile();
			fileWriter.write(writer.toString());
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
