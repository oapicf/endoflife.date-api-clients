//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'cycle_cycle.g.dart';

/// The release cycle which this release is part of.
@BuiltValue()
abstract class CycleCycle implements Built<CycleCycle, CycleCycleBuilder> {
  /// Any Of [String], [num]
  AnyOf get anyOf;

  CycleCycle._();

  factory CycleCycle([void updates(CycleCycleBuilder b)]) = _$CycleCycle;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CycleCycleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CycleCycle> get serializer => _$CycleCycleSerializer();
}

class _$CycleCycleSerializer implements PrimitiveSerializer<CycleCycle> {
  @override
  final Iterable<Type> types = const [CycleCycle, _$CycleCycle];

  @override
  final String wireName = r'CycleCycle';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CycleCycle object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CycleCycle object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CycleCycle deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CycleCycleBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(num), FullType(String), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

