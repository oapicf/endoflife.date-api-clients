# #endoflife.date
#
##Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
#
#The version of the OpenAPI document: 0.0.1
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  # Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
  class Cycle
    include JSON::Serializable

    # Optional properties
    @[JSON::Field(key: "cycle", type: CycleCycle?, nillable: true, emit_null: false)]
    property cycle : CycleCycle?

    # Release Date for the first release in this cycle
    @[JSON::Field(key: "releaseDate", type: Time?, nillable: true, emit_null: false)]
    property release_date : Time?

    @[JSON::Field(key: "eol", type: CycleEol?, nillable: true, emit_null: false)]
    property eol : CycleEol?

    # Latest release in this cycle
    @[JSON::Field(key: "latest", type: String?, nillable: true, emit_null: false)]
    property latest : String?

    # Link to changelog for the latest release, if available
    @[JSON::Field(key: "link", type: String?, nillable: true, emit_null: false)]
    property link : String?

    @[JSON::Field(key: "lts", type: CycleLts?, nillable: true, emit_null: false)]
    property lts : CycleLts?

    @[JSON::Field(key: "support", type: CycleSupport?, nillable: true, emit_null: false)]
    property support : CycleSupport?

    @[JSON::Field(key: "discontinued", type: CycleDiscontinued?, nillable: true, emit_null: false)]
    property discontinued : CycleDiscontinued?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@cycle : CycleCycle?, @release_date : Time?, @eol : CycleEol?, @latest : String?, @link : String?, @lts : CycleLts?, @support : CycleSupport?, @discontinued : CycleDiscontinued?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@release_date.nil? && @release_date.to_s.size > 10
        invalid_properties.push("invalid value for \"release_date\", the character length must be smaller than or equal to 10.")
      end

      if !@release_date.nil? && @release_date.to_s.size < 10
        invalid_properties.push("invalid value for \"release_date\", the character length must be great than or equal to 10.")
      end

      if !@latest.nil? && @latest.to_s.size < 1
        invalid_properties.push("invalid value for \"latest\", the character length must be great than or equal to 1.")
      end

      if !@link.nil? && @link.to_s.size < 1
        invalid_properties.push("invalid value for \"link\", the character length must be great than or equal to 1.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@release_date.nil? && @release_date.to_s.size > 10
      return false if !@release_date.nil? && @release_date.to_s.size < 10
      return false if !@latest.nil? && @latest.to_s.size < 1
      return false if !@link.nil? && @link.to_s.size < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] release_date Value to be assigned
    def release_date=(release_date)
      if !release_date.nil? && release_date.to_s.size > 10
        raise ArgumentError.new("invalid value for \"release_date\", the character length must be smaller than or equal to 10.")
      end

      if !release_date.nil? && release_date.to_s.size < 10
        raise ArgumentError.new("invalid value for \"release_date\", the character length must be great than or equal to 10.")
      end

      @release_date = release_date
    end

    # Custom attribute writer method with validation
    # @param [Object] latest Value to be assigned
    def latest=(latest)
      if !latest.nil? && latest.to_s.size < 1
        raise ArgumentError.new("invalid value for \"latest\", the character length must be great than or equal to 1.")
      end

      @latest = latest
    end

    # Custom attribute writer method with validation
    # @param [Object] link Value to be assigned
    def link=(link)
      if !link.nil? && link.to_s.size < 1
        raise ArgumentError.new("invalid value for \"link\", the character length must be great than or equal to 1.")
      end

      @link = link
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          cycle == o.cycle &&
          release_date == o.release_date &&
          eol == o.eol &&
          latest == o.latest &&
          link == o.link &&
          lts == o.lts &&
          support == o.support &&
          discontinued == o.discontinued
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [cycle, release_date, eol, latest, link, lts, support, discontinued].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenAPIClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
