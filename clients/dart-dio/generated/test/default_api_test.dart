import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // All Products
    //
    // Return a list of all products. Each of these can be used for the other API endpoints.
    //
    //Future<BuiltList<String>> getApiAllJson() async
    test('test getApiAllJson', () async {
      // TODO
    });

    // Single cycle details
    //
    // Gets details of a single cycle.
    //
    //Future<Cycle> getApiProductCycleJson(String product, String cycle) async
    test('test getApiProductCycleJson', () async {
      // TODO
    });

    // Get All Details
    //
    // Get EoL dates of all cycles of a given product.
    //
    //Future<BuiltList<Cycle>> getApiProductJson(String product) async
    test('test getApiProductJson', () async {
      // TODO
    });

  });
}
