package dev.tr7zw.maven.antijitpack;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "antijitpack", defaultPhase = LifecyclePhase.VERIFY)
public class SpigotStopMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        boolean isJitpack = false;
        File homeDir = new File("/home/jitpack");
        if (homeDir.exists()) {
            isJitpack = true;
        }
        if (isJitpack) {
            throw new RuntimeException("Builds on Jitpack are disabled!");
        }
    }
}
