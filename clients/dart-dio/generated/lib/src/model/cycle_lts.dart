//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'cycle_lts.g.dart';

/// Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
@BuiltValue()
abstract class CycleLts implements Built<CycleLts, CycleLtsBuilder> {
  /// Any Of [String], [bool]
  AnyOf get anyOf;

  CycleLts._();

  factory CycleLts([void updates(CycleLtsBuilder b)]) = _$CycleLts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CycleLtsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CycleLts> get serializer => _$CycleLtsSerializer();
}

class _$CycleLtsSerializer implements PrimitiveSerializer<CycleLts> {
  @override
  final Iterable<Type> types = const [CycleLts, _$CycleLts];

  @override
  final String wireName = r'CycleLts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CycleLts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CycleLts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CycleLts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CycleLtsBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(bool), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

