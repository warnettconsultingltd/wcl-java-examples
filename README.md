# wcl-java-examples
Examples of Java from version 8 onwards.

The pattern used for creating examples has been to create an examples-javaXX (where XX is the version).  
This is set up to provide a parent pom for two contained modules per Java version; examples-java-XX-preview and
examples-java-XX-stable.

The above structure enables segregation of stable, released features from preview features given
preview features may need to include additional parameters to enable.

## examples-java21

This module contains examples for the Java 21 release.

### examples-java-21-preview

Not yet implemented

### examples-java-21-stable

JEP 441 - Pattern Matching in switch.
ObjectMatch - basic switch pattern matching, including null.