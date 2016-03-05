package com.sig.team.codegen;

public class GenerateCrud {

	public static void main(String[] args) {

		new RepositoryFromEntity().exec();
		new RestfulFromEntity().exec();
	}
}
