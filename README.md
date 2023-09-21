# Anti Jitpack(.io) Maven Plugin

Detects when maven is running on jitpack.io and fails the build. Prevents artifacts from being auto published to jitpack.io.

## Why?

Jitpack creates broken artifacts and provides no way to delete them or disable the service. This plugin prevents Jitpack from building them in the first place.

## Usage

```xml
      <plugin>
        <groupId>dev.tr7zw.nojitpack.maven</groupId>
        <artifactId>no-jitpack-maven-plugin</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <executions>
          <execution>
            <id>antijitpack</id>
            <goals>
              <goal>antijitpack</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
```
