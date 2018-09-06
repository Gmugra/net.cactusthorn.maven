# net.cactusthorn.maven

Maven Demo project. Demonstrate:
1. Submodules
1. build-tools module
1. Generated sources
   1. http://www.mojohaus.org/build-helper-maven-plugin/
1. Integration tests
   1. https://maven.apache.org/surefire/maven-failsafe-plugin/
   1. https://www.petrikainulainen.net/programming/maven/integration-testing-with-maven/
1. Checkstyle
   1. http://checkstyle.sourceforge.net/
1. Spotbugs
   1. https://spotbugs.github.io/
1. "quiet" tests mode
1. "all-jar", jar which including its dependencies
   1. https://maven.apache.org/plugins/maven-shade-plugin/
   1. example: /submodule-one/pom.xml
1. jar archive of the source files
   1. https://maven.apache.org/plugins/maven-source-plugin/
1. JVM and Command Line Options with **.mvn**
   1. https://maven.apache.org/docs/3.3.1/release-notes.html
1. The project local maven repository

## How to
How to run checkstyle:
```bash
mvn checkstyle:check
```
How to run spotbugs:
```bash
mvn spotbugs:check
```
How to run integration tests:
```bash
mvn verify -Pintegration-test
```
How to run "quiet" tests mode:
```bash
mvn test -Ptest-quiet
mvn verify -Pintegration-test-quiet
```

## checkstyle
Here we have a bit tricky configuration to make it possible to use the same configuration files (checks & suppressions) in IDE plugins:
* Eclipse: http://checkstyle.org/eclipse-cs/#!/
* IntelliJ IDEA: https://plugins.jetbrains.com/plugin/1065-checkstyle-idea

Path to the suppressions file from property (checkstyle_checks.xml):
```xml
<module name="Checker">
...
	<module name="SuppressionFilter">
		<property name="file" value="${suppressionsFile}" />
		<property name="optional" value="false" />
	</module>
...
</module>
```
and in the pom.xml we provide value for the "suppressionsFile" property:
```xml
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-checkstyle-plugin</artifactId>
<version>${plugin.version.maven.checkstyle}</version>
<configuration>
	...
	<propertyExpansion>suppressionsFile=/checkstyle_suppressions.xml</propertyExpansion>
</configuration>
```

## "quiet" tests mode
You definitely is using Logging in the project.
And eventually you (by default) is using debug log-level in unit/integration test (which is fine and wanted).
However, it could be unnecessary to get multi-megabyte "debug"-logs when you need to build the whole projects (e.g. "mvn clean install")
Solution is to use profile(s) which substitute "default" logging configuration with "quiet"(log-level = error) logging configuration.

## couple of maven hints

List of predefined Maven properties:
https://github.com/cko/predefined_maven_properties/blob/master/README.md

Get artifact in the local repository with all dependencies:
```bash
mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:get -Dartifact=io.swagger:swagger-codegen-cli:2.3.1
```

Add Jar in the local repository:
```bash
mvn install:install-file -Dfile=myjar-{version}.jar -DgroupId=my.group.id -DartifactId=my-artifact-it -Dversion={version} -Dpackaging=jar
```

Add Jar in the project local repository:
```bash
mvn install:install-file -Dfile=myjar-{version}.jar -DgroupId=my.group.id -DartifactId=my-artifact-it -Dversion={version} -Dpackaging=jar -DlocalRepositoryPath=../project-maven-repository -DcreateChecksum=true
```

## License
Released under the BSD 2-Clause License
```
Copyright (C) 2018, Alexei Khatskevich
All rights reserved.

Licensed under the BSD 2-clause (Simplified) License (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://opensource.org/licenses/BSD-2-Clause
```