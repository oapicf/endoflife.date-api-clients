//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/cycle_support.dart';
import 'package:openapi/src/model/cycle_lts.dart';
import 'package:openapi/src/model/cycle_cycle.dart';
import 'package:openapi/src/model/cycle_eol.dart';
import 'package:openapi/src/model/cycle_discontinued.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cycle.g.dart';

/// Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
///
/// Properties:
/// * [cycle] 
/// * [releaseDate] - Release date for the first release in this cycle.
/// * [eol] 
/// * [latest] - Latest release in this cycle.
/// * [link] - Link to changelog for the latest release in this cycle, or null if unavailable.
/// * [lts] 
/// * [support] 
/// * [discontinued] 
@BuiltValue()
abstract class Cycle implements Built<Cycle, CycleBuilder> {
  @BuiltValueField(wireName: r'cycle')
  CycleCycle? get cycle;

  /// Release date for the first release in this cycle.
  @BuiltValueField(wireName: r'releaseDate')
  Date? get releaseDate;

  @BuiltValueField(wireName: r'eol')
  CycleEol? get eol;

  /// Latest release in this cycle.
  @BuiltValueField(wireName: r'latest')
  String? get latest;

  /// Link to changelog for the latest release in this cycle, or null if unavailable.
  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'lts')
  CycleLts? get lts;

  @BuiltValueField(wireName: r'support')
  CycleSupport? get support;

  @BuiltValueField(wireName: r'discontinued')
  CycleDiscontinued? get discontinued;

  Cycle._();

  factory Cycle([void updates(CycleBuilder b)]) = _$Cycle;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CycleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Cycle> get serializer => _$CycleSerializer();
}

class _$CycleSerializer implements PrimitiveSerializer<Cycle> {
  @override
  final Iterable<Type> types = const [Cycle, _$Cycle];

  @override
  final String wireName = r'Cycle';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Cycle object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cycle != null) {
      yield r'cycle';
      yield serializers.serialize(
        object.cycle,
        specifiedType: const FullType(CycleCycle),
      );
    }
    if (object.releaseDate != null) {
      yield r'releaseDate';
      yield serializers.serialize(
        object.releaseDate,
        specifiedType: const FullType(Date),
      );
    }
    if (object.eol != null) {
      yield r'eol';
      yield serializers.serialize(
        object.eol,
        specifiedType: const FullType(CycleEol),
      );
    }
    if (object.latest != null) {
      yield r'latest';
      yield serializers.serialize(
        object.latest,
        specifiedType: const FullType(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.lts != null) {
      yield r'lts';
      yield serializers.serialize(
        object.lts,
        specifiedType: const FullType(CycleLts),
      );
    }
    if (object.support != null) {
      yield r'support';
      yield serializers.serialize(
        object.support,
        specifiedType: const FullType(CycleSupport),
      );
    }
    if (object.discontinued != null) {
      yield r'discontinued';
      yield serializers.serialize(
        object.discontinued,
        specifiedType: const FullType(CycleDiscontinued),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Cycle object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CycleBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cycle':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CycleCycle),
          ) as CycleCycle?;
          if (valueDes == null) continue;
          result.cycle.replace(valueDes);
          break;
        case r'releaseDate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.releaseDate = valueDes;
          break;
        case r'eol':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CycleEol),
          ) as CycleEol?;
          if (valueDes == null) continue;
          result.eol.replace(valueDes);
          break;
        case r'latest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.latest = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'lts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CycleLts),
          ) as CycleLts?;
          if (valueDes == null) continue;
          result.lts.replace(valueDes);
          break;
        case r'support':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CycleSupport),
          ) as CycleSupport?;
          if (valueDes == null) continue;
          result.support.replace(valueDes);
          break;
        case r'discontinued':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CycleDiscontinued),
          ) as CycleDiscontinued?;
          if (valueDes == null) continue;
          result.discontinued.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Cycle deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CycleBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

