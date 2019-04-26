eaio-uuid
=========

This is a fork of `com.eaio.uuid:uuid` version 3.2. The sources have been
imported from the [sources JAR](https://repo1.maven.org/maven2/com/eaio/uuid/uuid/3.2/).

The goal of this fork is to make the library work with Java 9 and later.

## Create Release

Execute the following commands to create a new uuid release and publish it on
maven central.

```sh
mvn release:clean release:prepare
mvn release:perform
```

Make sure you have a working GPG setup to sign the artifacts and that you have
valid sonatype credentials for the `ossrh` serverId in your `~/.m2/settings.xml`.

See [Sonatype Maven documentation](https://central.sonatype.org/pages/apache-maven.html) for details.

## License

MIT - See [copying.txt](copying.txt) for details.
