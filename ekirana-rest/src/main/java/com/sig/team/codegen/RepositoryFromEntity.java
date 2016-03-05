package com.sig.team.codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class RepositoryFromEntity {

	private String REPOSITORY_LOCATION = "src/main/java/com/sig/team/webworks/crud/repository/";

	public static void main(String[] args) {
		new RepositoryFromEntity().exec();
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
		Template t = ve.getTemplate("src/main/java/com/sig/team/codegen/RepositoryFromEntity.vm");

		String fileName = name.replaceAll(".java", "");

		try {
			/* create a context and add data */
			VelocityContext context = new VelocityContext();
			context.put("domain", fileName);
			context.put("repositoryName", fileName+"Repository");
			/* now render the template into a StringWriter */
			StringWriter writer = new StringWriter();
			t.merge(context, writer);
			/* show the World */

			File file = new File(REPOSITORY_LOCATION + fileName + "Repository.java");
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
