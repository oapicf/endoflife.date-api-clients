//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'cycle_eol.g.dart';

/// End-of-Life date for this release cycle.
@BuiltValue()
abstract class CycleEol implements Built<CycleEol, CycleEolBuilder> {
  /// Any Of [String], [bool]
  AnyOf get anyOf;

  CycleEol._();

  factory CycleEol([void updates(CycleEolBuilder b)]) = _$CycleEol;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CycleEolBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CycleEol> get serializer => _$CycleEolSerializer();
}

class _$CycleEolSerializer implements PrimitiveSerializer<CycleEol> {
  @override
  final Iterable<Type> types = const [CycleEol, _$CycleEol];

  @override
  final String wireName = r'CycleEol';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CycleEol object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CycleEol object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CycleEol deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CycleEolBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(bool), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

