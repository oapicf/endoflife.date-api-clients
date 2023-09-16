import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Cycle
void main() {
  final instance = CycleBuilder();
  // TODO add properties to the builder and call build()

  group(Cycle, () {
    // Release Cycle
    // JsonObject cycle
    test('to test the property `cycle`', () async {
      // TODO
    });

    // Release Date for the first release in this cycle
    // JsonObject releaseDate
    test('to test the property `releaseDate`', () async {
      // TODO
    });

    // End of Life Date for this release cycle
    // JsonObject eol
    test('to test the property `eol`', () async {
      // TODO
    });

    // Latest release in this cycle
    // JsonObject latest
    test('to test the property `latest`', () async {
      // TODO
    });

    // Link to changelog for the latest release, if available
    // JsonObject link
    test('to test the property `link`', () async {
      // TODO
    });

    // Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
    // JsonObject lts
    test('to test the property `lts`', () async {
      // TODO
    });

    // Whether this release cycle has active support
    // JsonObject support
    test('to test the property `support`', () async {
      // TODO
    });

    // Whether this cycle is now discontinued.
    // JsonObject discontinued
    test('to test the property `discontinued`', () async {
      // TODO
    });

  });
}
