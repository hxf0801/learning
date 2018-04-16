# Eclipse Aether Sample

Sample code to use Eclipse Aether to download its own dependencies by reading its own __pom.xml__ programmatically. As of now, Eclipse Aether was migrated into Apache Maven and replaced by Apache Maven Resolver Provider project.

This sample refers to [**2017 Micha Kops blog**][1].

## Running the Example

Simply run the example using Maven command line:

```bash
mvn clean compile exec:java -Dexec.mainClass=com.hascode.tutorial.DownloadingArtifactsByPomExample
```

----

  [1]:http://www.hascode.com/2017/09/downloading-maven-artifacts-from-a-pom-file-programmatically-with-eclipse-aether/