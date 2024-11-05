/*
endoflife.date

Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

API version: 0.0.1
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)


// CycleLts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
type CycleLts struct {
	Bool *bool
	String *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CycleLts) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into Bool
	err = json.Unmarshal(data, &dst.Bool);
	if err == nil {
		jsonBool, _ := json.Marshal(dst.Bool)
		if string(jsonBool) == "{}" { // empty struct
			dst.Bool = nil
		} else {
			return nil // data stored in dst.Bool, return on the first match
		}
	} else {
		dst.Bool = nil
	}

	// try to unmarshal JSON data into String
	err = json.Unmarshal(data, &dst.String);
	if err == nil {
		jsonString, _ := json.Marshal(dst.String)
		if string(jsonString) == "{}" { // empty struct
			dst.String = nil
		} else {
			return nil // data stored in dst.String, return on the first match
		}
	} else {
		dst.String = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CycleLts)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CycleLts) MarshalJSON() ([]byte, error) {
	if src.Bool != nil {
		return json.Marshal(&src.Bool)
	}

	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil // no data in anyOf schemas
}


type NullableCycleLts struct {
	value *CycleLts
	isSet bool
}

func (v NullableCycleLts) Get() *CycleLts {
	return v.value
}

func (v *NullableCycleLts) Set(val *CycleLts) {
	v.value = val
	v.isSet = true
}

func (v NullableCycleLts) IsSet() bool {
	return v.isSet
}

func (v *NullableCycleLts) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCycleLts(val *CycleLts) *NullableCycleLts {
	return &NullableCycleLts{value: val, isSet: true}
}

func (v NullableCycleLts) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCycleLts) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

