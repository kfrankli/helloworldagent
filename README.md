# helloworldagent

A trivial/toy example of a java agent

## Building

```
mvn clean package
```

This should result in a `helloworldagent.jar` under the target directory.

## Running

This assumes you are using Red Hat JBoss EAP 7.x running in standalone mode.

Add the following to the end of `$JBOSS_HOME/bin/standalone.conf`, editing the file path as necessary:

```
JAVA_OPTS="$JAVA_OPTS -javaagent:/mvn-hello-world-jar/target/helloworldagent.jar -Dcontrast.config.path=ThisWasATest"
```

Now starting Red Hat JBoss EAP you should see the following:

```
$ $JBOSS_HOME/bin/standalone.sh
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /jboss-eap-7.4

  JAVA: /home/kfrankli/.sdkman/candidates/java/11.0.12-open/bin/java

  JAVA_OPTS:  -server -Xlog:gc*:file="/jboss-eap-7.4/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Xms1303m -Xmx1303m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -javaagent:/mvn-hello-world-jar/target/helloworldagent.jar -Dcontrast.config.path=ThisWasATest  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED

=========================================================================

Conform with all directives.
Remember obedience pays.
And when you watch that TV screen,
Remember it works both ways.
Big Brother is watching you!
ThisWasATest


13:13:52,404 INFO  [org.jboss.modules] (main) JBoss Modules version 1.11.0.Final-redhat-00001
13:13:52,668 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
13:13:52,674 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
...
```
