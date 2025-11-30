# Org.OpenAPITools - Azure Functions v4 Server

The endoflife.date v0 API is currently deprecated, please [use the endoflife.date v1 API](https://endoflife.date/docs/api/v1/).

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:8080 org.openapitools
```
