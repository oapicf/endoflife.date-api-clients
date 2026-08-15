//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'cycle_support.g.dart';

/// Whether this release cycle has active support.
@BuiltValue()
abstract class CycleSupport implements Built<CycleSupport, CycleSupportBuilder> {
  /// Any Of [String], [bool]
  AnyOf get anyOf;

  CycleSupport._();

  factory CycleSupport([void updates(CycleSupportBuilder b)]) = _$CycleSupport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CycleSupportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CycleSupport> get serializer => _$CycleSupportSerializer();
}

class _$CycleSupportSerializer implements PrimitiveSerializer<CycleSupport> {
  @override
  final Iterable<Type> types = const [CycleSupport, _$CycleSupport];

  @override
  final String wireName = r'CycleSupport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CycleSupport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CycleSupport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CycleSupport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CycleSupportBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(bool), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

