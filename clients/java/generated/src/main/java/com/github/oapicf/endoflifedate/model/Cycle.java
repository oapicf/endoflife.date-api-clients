/*
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.endoflifedate.model;

import java.util.Objects;
import com.github.oapicf.endoflifedate.model.CycleCycle;
import com.github.oapicf.endoflifedate.model.CycleDiscontinued;
import com.github.oapicf.endoflifedate.model.CycleEol;
import com.github.oapicf.endoflifedate.model.CycleLts;
import com.github.oapicf.endoflifedate.model.CycleSupport;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.endoflifedate.JSON;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-09T11:49:02.743168284Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class Cycle {
  public static final String SERIALIZED_NAME_CYCLE = "cycle";
  @SerializedName(SERIALIZED_NAME_CYCLE)
  @javax.annotation.Nullable
  private CycleCycle cycle;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  @javax.annotation.Nullable
  private LocalDate releaseDate;

  public static final String SERIALIZED_NAME_EOL = "eol";
  @SerializedName(SERIALIZED_NAME_EOL)
  @javax.annotation.Nullable
  private CycleEol eol;

  public static final String SERIALIZED_NAME_LATEST = "latest";
  @SerializedName(SERIALIZED_NAME_LATEST)
  @javax.annotation.Nullable
  private String latest;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  @javax.annotation.Nullable
  private String link;

  public static final String SERIALIZED_NAME_LTS = "lts";
  @SerializedName(SERIALIZED_NAME_LTS)
  @javax.annotation.Nullable
  private CycleLts lts;

  public static final String SERIALIZED_NAME_SUPPORT = "support";
  @SerializedName(SERIALIZED_NAME_SUPPORT)
  @javax.annotation.Nullable
  private CycleSupport support;

  public static final String SERIALIZED_NAME_DISCONTINUED = "discontinued";
  @SerializedName(SERIALIZED_NAME_DISCONTINUED)
  @javax.annotation.Nullable
  private CycleDiscontinued discontinued;

  public Cycle() {
  }

  public Cycle cycle(@javax.annotation.Nullable CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

  /**
   * Get cycle
   * @return cycle
   */
  @javax.annotation.Nullable
  public CycleCycle getCycle() {
    return cycle;
  }

  public void setCycle(@javax.annotation.Nullable CycleCycle cycle) {
    this.cycle = cycle;
  }


  public Cycle releaseDate(@javax.annotation.Nullable LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Release date for the first release in this cycle.
   * @return releaseDate
   */
  @javax.annotation.Nullable
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(@javax.annotation.Nullable LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


  public Cycle eol(@javax.annotation.Nullable CycleEol eol) {
    this.eol = eol;
    return this;
  }

  /**
   * Get eol
   * @return eol
   */
  @javax.annotation.Nullable
  public CycleEol getEol() {
    return eol;
  }

  public void setEol(@javax.annotation.Nullable CycleEol eol) {
    this.eol = eol;
  }


  public Cycle latest(@javax.annotation.Nullable String latest) {
    this.latest = latest;
    return this;
  }

  /**
   * Latest release in this cycle.
   * @return latest
   */
  @javax.annotation.Nullable
  public String getLatest() {
    return latest;
  }

  public void setLatest(@javax.annotation.Nullable String latest) {
    this.latest = latest;
  }


  public Cycle link(@javax.annotation.Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Link to changelog for the latest release in this cycle, or null if unavailable.
   * @return link
   */
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }


  public Cycle lts(@javax.annotation.Nullable CycleLts lts) {
    this.lts = lts;
    return this;
  }

  /**
   * Get lts
   * @return lts
   */
  @javax.annotation.Nullable
  public CycleLts getLts() {
    return lts;
  }

  public void setLts(@javax.annotation.Nullable CycleLts lts) {
    this.lts = lts;
  }


  public Cycle support(@javax.annotation.Nullable CycleSupport support) {
    this.support = support;
    return this;
  }

  /**
   * Get support
   * @return support
   */
  @javax.annotation.Nullable
  public CycleSupport getSupport() {
    return support;
  }

  public void setSupport(@javax.annotation.Nullable CycleSupport support) {
    this.support = support;
  }


  public Cycle discontinued(@javax.annotation.Nullable CycleDiscontinued discontinued) {
    this.discontinued = discontinued;
    return this;
  }

  /**
   * Get discontinued
   * @return discontinued
   */
  @javax.annotation.Nullable
  public CycleDiscontinued getDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(@javax.annotation.Nullable CycleDiscontinued discontinued) {
    this.discontinued = discontinued;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cycle cycle = (Cycle) o;
    return Objects.equals(this.cycle, cycle.cycle) &&
        Objects.equals(this.releaseDate, cycle.releaseDate) &&
        Objects.equals(this.eol, cycle.eol) &&
        Objects.equals(this.latest, cycle.latest) &&
        Objects.equals(this.link, cycle.link) &&
        Objects.equals(this.lts, cycle.lts) &&
        Objects.equals(this.support, cycle.support) &&
        Objects.equals(this.discontinued, cycle.discontinued);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycle, releaseDate, eol, latest, link, lts, support, discontinued);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cycle {\n");
    sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    eol: ").append(toIndentedString(eol)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    lts: ").append(toIndentedString(lts)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    discontinued: ").append(toIndentedString(discontinued)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cycle");
    openapiFields.add("releaseDate");
    openapiFields.add("eol");
    openapiFields.add("latest");
    openapiFields.add("link");
    openapiFields.add("lts");
    openapiFields.add("support");
    openapiFields.add("discontinued");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Cycle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Cycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Cycle is not found in the empty JSON string", Cycle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Cycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Cycle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cycle`
      if (jsonObj.get("cycle") != null && !jsonObj.get("cycle").isJsonNull()) {
        CycleCycle.validateJsonElement(jsonObj.get("cycle"));
      }
      // validate the optional field `eol`
      if (jsonObj.get("eol") != null && !jsonObj.get("eol").isJsonNull()) {
        CycleEol.validateJsonElement(jsonObj.get("eol"));
      }
      if ((jsonObj.get("latest") != null && !jsonObj.get("latest").isJsonNull()) && !jsonObj.get("latest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // validate the optional field `lts`
      if (jsonObj.get("lts") != null && !jsonObj.get("lts").isJsonNull()) {
        CycleLts.validateJsonElement(jsonObj.get("lts"));
      }
      // validate the optional field `support`
      if (jsonObj.get("support") != null && !jsonObj.get("support").isJsonNull()) {
        CycleSupport.validateJsonElement(jsonObj.get("support"));
      }
      // validate the optional field `discontinued`
      if (jsonObj.get("discontinued") != null && !jsonObj.get("discontinued").isJsonNull()) {
        CycleDiscontinued.validateJsonElement(jsonObj.get("discontinued"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Cycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Cycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Cycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Cycle.class));

       return (TypeAdapter<T>) new TypeAdapter<Cycle>() {
           @Override
           public void write(JsonWriter out, Cycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Cycle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Cycle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Cycle
   * @throws IOException if the JSON string is invalid with respect to Cycle
   */
  public static Cycle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Cycle.class);
  }

  /**
   * Convert an instance of Cycle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

