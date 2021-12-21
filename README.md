Compile class
javac -cp "." org/netspi/cli/App.java 

Make JAR
jar cfmv App.jar META-INF/MANIFEST.MF org/* log4j2.xml Log4j-* jndi.properties META-INF/*

