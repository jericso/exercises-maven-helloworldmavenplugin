package com.prolegoma.exercises.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * This goal will say "Hello world.".
 */
@Mojo(name = "sayhello")
public class HelloWorldMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException {

		getLog().info("Hello world.");
	}
}