# Native Image

Build the application:
```shell
./gradlew clean bootBuildImage
```

Run the application:
```shell
docker run --rm -p 8080:8081 native:0.0.1-SNAPSHOT
```

## Issues
If `bootBuildImage` fails to run increase the amount of memory that docker can use within Docker > Preferences > Resources