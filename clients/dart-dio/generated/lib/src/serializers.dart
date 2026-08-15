//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_import

import 'package:one_of_serializer/any_of_serializer.dart';
import 'package:one_of_serializer/one_of_serializer.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:built_value/standard_json_plugin.dart';
import 'package:built_value/iso_8601_date_time_serializer.dart';
import 'package:openapi/src/date_serializer.dart';
import 'package:openapi/src/model/date.dart';

import 'package:openapi/src/model/cycle.dart';
import 'package:openapi/src/model/cycle_cycle.dart';
import 'package:openapi/src/model/cycle_discontinued.dart';
import 'package:openapi/src/model/cycle_eol.dart';
import 'package:openapi/src/model/cycle_lts.dart';
import 'package:openapi/src/model/cycle_support.dart';

part 'serializers.g.dart';

@SerializersFor([
  Cycle,
  CycleCycle,
  CycleDiscontinued,
  CycleEol,
  CycleLts,
  CycleSupport,
])
Serializers serializers = (_$serializers.toBuilder()
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(Cycle)]),
        () => ListBuilder<Cycle>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(String)]),
        () => ListBuilder<String>(),
      )
      ..add(const OneOfSerializer())
      ..add(const AnyOfSerializer())
      ..add(const DateSerializer())
      ..add(Iso8601DateTimeSerializer())
    ).build();

Serializers standardSerializers =
    (serializers.toBuilder()..addPlugin(StandardJsonPlugin())).build();
