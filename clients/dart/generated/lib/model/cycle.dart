//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Cycle {
  /// Returns a new [Cycle] instance.
  Cycle({
    this.cycle,
    this.releaseDate,
    this.eol,
    this.latest,
    this.link,
    this.lts,
    this.support,
    this.discontinued,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CycleCycle? cycle;

  /// Release date for the first release in this cycle.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? releaseDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CycleEol? eol;

  /// Latest release in this cycle.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? latest;

  /// Link to changelog for the latest release in this cycle, or null if unavailable.
  String? link;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CycleLts? lts;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CycleSupport? support;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CycleDiscontinued? discontinued;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Cycle &&
    other.cycle == cycle &&
    other.releaseDate == releaseDate &&
    other.eol == eol &&
    other.latest == latest &&
    other.link == link &&
    other.lts == lts &&
    other.support == support &&
    other.discontinued == discontinued;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cycle == null ? 0 : cycle!.hashCode) +
    (releaseDate == null ? 0 : releaseDate!.hashCode) +
    (eol == null ? 0 : eol!.hashCode) +
    (latest == null ? 0 : latest!.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (lts == null ? 0 : lts!.hashCode) +
    (support == null ? 0 : support!.hashCode) +
    (discontinued == null ? 0 : discontinued!.hashCode);

  @override
  String toString() => 'Cycle[cycle=$cycle, releaseDate=$releaseDate, eol=$eol, latest=$latest, link=$link, lts=$lts, support=$support, discontinued=$discontinued]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cycle != null) {
      json[r'cycle'] = this.cycle;
    } else {
      json[r'cycle'] = null;
    }
    if (this.releaseDate != null) {
      json[r'releaseDate'] = _dateFormatter.format(this.releaseDate!.toUtc());
    } else {
      json[r'releaseDate'] = null;
    }
    if (this.eol != null) {
      json[r'eol'] = this.eol;
    } else {
      json[r'eol'] = null;
    }
    if (this.latest != null) {
      json[r'latest'] = this.latest;
    } else {
      json[r'latest'] = null;
    }
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.lts != null) {
      json[r'lts'] = this.lts;
    } else {
      json[r'lts'] = null;
    }
    if (this.support != null) {
      json[r'support'] = this.support;
    } else {
      json[r'support'] = null;
    }
    if (this.discontinued != null) {
      json[r'discontinued'] = this.discontinued;
    } else {
      json[r'discontinued'] = null;
    }
    return json;
  }

  /// Returns a new [Cycle] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Cycle? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return Cycle(
        cycle: CycleCycle.fromJson(json[r'cycle']),
        releaseDate: mapDateTime(json, r'releaseDate', r''),
        eol: CycleEol.fromJson(json[r'eol']),
        latest: mapValueOfType<String>(json, r'latest'),
        link: mapValueOfType<String>(json, r'link'),
        lts: CycleLts.fromJson(json[r'lts']),
        support: CycleSupport.fromJson(json[r'support']),
        discontinued: CycleDiscontinued.fromJson(json[r'discontinued']),
      );
    }
    return null;
  }

  static List<Cycle> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Cycle>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Cycle.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Cycle> mapFromJson(dynamic json) {
    final map = <String, Cycle>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Cycle.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Cycle-objects as value to a dart map
  static Map<String, List<Cycle>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Cycle>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Cycle.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

