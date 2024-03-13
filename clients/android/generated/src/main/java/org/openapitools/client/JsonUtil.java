/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Cycle".equalsIgnoreCase(className)) {
      return new TypeToken<List<Cycle>>(){}.getType();
    }
    
    if ("CycleCycle".equalsIgnoreCase(className)) {
      return new TypeToken<List<CycleCycle>>(){}.getType();
    }
    
    if ("CycleDiscontinued".equalsIgnoreCase(className)) {
      return new TypeToken<List<CycleDiscontinued>>(){}.getType();
    }
    
    if ("CycleEol".equalsIgnoreCase(className)) {
      return new TypeToken<List<CycleEol>>(){}.getType();
    }
    
    if ("CycleLts".equalsIgnoreCase(className)) {
      return new TypeToken<List<CycleLts>>(){}.getType();
    }
    
    if ("CycleSupport".equalsIgnoreCase(className)) {
      return new TypeToken<List<CycleSupport>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Cycle".equalsIgnoreCase(className)) {
      return new TypeToken<Cycle>(){}.getType();
    }
    
    if ("CycleCycle".equalsIgnoreCase(className)) {
      return new TypeToken<CycleCycle>(){}.getType();
    }
    
    if ("CycleDiscontinued".equalsIgnoreCase(className)) {
      return new TypeToken<CycleDiscontinued>(){}.getType();
    }
    
    if ("CycleEol".equalsIgnoreCase(className)) {
      return new TypeToken<CycleEol>(){}.getType();
    }
    
    if ("CycleLts".equalsIgnoreCase(className)) {
      return new TypeToken<CycleLts>(){}.getType();
    }
    
    if ("CycleSupport".equalsIgnoreCase(className)) {
      return new TypeToken<CycleSupport>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
