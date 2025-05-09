# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X GET https://endoflife.date/api/all.json
curl -X GET https://endoflife.date/api/{product}/{cycle}.json
curl -X GET https://endoflife.date/api/{product}.json

```

## Try health and metrics

```
curl -s -X GET https://endoflife.date/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://endoflife.date/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://endoflife.date/metrics
{"base":...
. . .
```