eaio-uuid
=========

This is a fork of `com.eaio.uuid:uuid` version 3.2. The sources have been
imported from the [sources JAR](https://repo1.maven.org/maven2/com/eaio/uuid/uuid/3.2/).

The goal of this fork is to make the library work with Java 9 and later.

## Create Release

Execute the following commands to create a new uuid release and publish it on
maven central.

In this example the new version is `3.2.1` and the new development version is
`3.2.2-SNAPSHOT`. Adjust the versions accordingly.

```
mvn -DnewVersion="3.2.1" versions:set versions:commit
git add pom.xml
git commit -m '[release] Prepare release 3.2.1'
git tag 3.2.1
mvn -Psign-artifacts clean install deploy
mvn -DnewVersion="3.2.2-SNAPSHOT" versions:set versions:commit
git add pom.xml
git commit -m '[release] Prepare for next development iteration'
git push
```

Make sure you have a working GPG setup to sign the artifacts and that you have
valid sonatype credentials for the `ossrh` serverId in your `~/.m2/settings.xml`.

## License

MIT - See [copying.txt](copying.txt) for details.
