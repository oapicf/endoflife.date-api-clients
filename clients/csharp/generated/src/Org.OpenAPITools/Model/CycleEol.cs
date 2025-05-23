// <auto-generated>
/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// End-of-Life date for this release cycle.
    /// </summary>
    public partial class CycleEol : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CycleEol" /> class.
        /// </summary>
        /// <param name="string"></param>
        /// <param name="bool"></param>
        internal CycleEol(Option<string?> @string, Option<bool?> @bool)
        {
            StringOption = @string;
            BoolOption = @bool;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of String
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<string?> StringOption { get; private set; }

        /// <summary>
        /// Gets or Sets String
        /// </summary>
        public string? String { get { return this.StringOption; } set { this.StringOption = new(value); } }

        /// <summary>
        /// Used to track the state of Bool
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<bool?> BoolOption { get; private set; }

        /// <summary>
        /// Gets or Sets Bool
        /// </summary>
        public bool? Bool { get { return this.BoolOption; } set { this.BoolOption = new(value); } }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CycleEol {\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="CycleEol" />
    /// </summary>
    public class CycleEolJsonConverter : JsonConverter<CycleEol>
    {
        /// <summary>
        /// Deserializes json to <see cref="CycleEol" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override CycleEol Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            string? varString = default;
            bool? varBool = default;

            Utf8JsonReader utf8JsonReaderAnyOf = utf8JsonReader;
            while (utf8JsonReaderAnyOf.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReaderAnyOf.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReaderAnyOf.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReaderAnyOf.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReaderAnyOf.CurrentDepth)
                    break;

                if (utf8JsonReaderAnyOf.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReaderAnyOf.CurrentDepth - 1)
                {
                    Utf8JsonReader utf8JsonReaderString = utf8JsonReader;
                    ClientUtils.TryDeserialize<string?>(ref utf8JsonReaderString, jsonSerializerOptions, out varString);

                    Utf8JsonReader utf8JsonReaderBool = utf8JsonReader;
                    ClientUtils.TryDeserialize<bool?>(ref utf8JsonReaderBool, jsonSerializerOptions, out varBool);
                }
            }

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        default:
                            break;
                    }
                }
            }

            Option<string?> varStringParsedValue = varString == null
                ? default
                : new Option<string?>(varString);
            Option<bool?> varBoolParsedValue = varBool == null
                ? default
                : new Option<bool?>(varBool);

            return new CycleEol(varStringParsedValue, varBoolParsedValue);
        }

        /// <summary>
        /// Serializes a <see cref="CycleEol" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="cycleEol"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, CycleEol cycleEol, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            if (cycleEol.StringOption.IsSet && cycleEol.StringOption.Value != null)
                writer.WriteString("support", cycleEol.StringOption.Value);

            if (cycleEol.BoolOption.IsSet && cycleEol.BoolOption.Value != null)
                writer.WriteBoolean("support", cycleEol.BoolOption.Value.Value);

            WriteProperties(writer, cycleEol, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="CycleEol" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="cycleEol"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, CycleEol cycleEol, JsonSerializerOptions jsonSerializerOptions)
        {

        }
    }
}
