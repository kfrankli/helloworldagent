package helloworld;

import java.lang.instrument.Instrumentation;

public class Agent {
	public static void premain(String agentArgs, Instrumentation inst) {
		System.out.println("Conform with all directives.\nRemember obedience pays.\nAnd when you watch that TV screen,\nRemember it works both ways.\nBig Brother is watching you!\n" + System.getProperty("contrast.config.path") + "\n\n");
	}

}
