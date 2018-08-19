# net.cactusthorn.maven

Maven Demo project. Demonstrate:
1. Submodules
2. Generated sources
3. Integration tests
4. Checkstyle (http://checkstyle.sourceforge.net/)
5. JVM and Command Line Options with **.mvn** (https://maven.apache.org/docs/3.3.1/release-notes.html)

How to run checkstyle:
```
mvn checkstyle:check
```
How to run integration tests:
```
mvn verify -Pintegration-test
```

## couple of maven hints

Get artifact in the local repository with all dependencies:
```
mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:get -Dartifact=io.swagger:swagger-codegen-cli:2.3.1
```

Add Jar in the local repository
```
mvn install:install-file -Dfile=myjar-{version}.jar -DgroupId=my.group.id -DartifactId=my-artifact-it -Dversion={version} -Dpackaging=jar
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