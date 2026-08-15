//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'cycle_discontinued.g.dart';

/// Whether this device version is no longer in production.
@BuiltValue()
abstract class CycleDiscontinued implements Built<CycleDiscontinued, CycleDiscontinuedBuilder> {
  /// Any Of [String], [bool]
  AnyOf get anyOf;

  CycleDiscontinued._();

  factory CycleDiscontinued([void updates(CycleDiscontinuedBuilder b)]) = _$CycleDiscontinued;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CycleDiscontinuedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CycleDiscontinued> get serializer => _$CycleDiscontinuedSerializer();
}

class _$CycleDiscontinuedSerializer implements PrimitiveSerializer<CycleDiscontinued> {
  @override
  final Iterable<Type> types = const [CycleDiscontinued, _$CycleDiscontinued];

  @override
  final String wireName = r'CycleDiscontinued';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CycleDiscontinued object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CycleDiscontinued object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CycleDiscontinued deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CycleDiscontinuedBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(bool), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

