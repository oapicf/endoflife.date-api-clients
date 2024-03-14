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

// CycleEol End of Life Date for this release cycle
type CycleEol struct {
	bool *bool
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CycleEol) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into bool
	err = json.Unmarshal(data, &dst.bool);
	if err == nil {
		jsonbool, _ := json.Marshal(dst.bool)
		if string(jsonbool) == "{}" { // empty struct
			dst.bool = nil
		} else {
			return nil // data stored in dst.bool, return on the first match
		}
	} else {
		dst.bool = nil
	}

	// try to unmarshal JSON data into string
	err = json.Unmarshal(data, &dst.string);
	if err == nil {
		jsonstring, _ := json.Marshal(dst.string)
		if string(jsonstring) == "{}" { // empty struct
			dst.string = nil
		} else {
			return nil // data stored in dst.string, return on the first match
		}
	} else {
		dst.string = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CycleEol)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CycleEol) MarshalJSON() ([]byte, error) {
	if src.bool != nil {
		return json.Marshal(&src.bool)
	}

	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableCycleEol struct {
	value *CycleEol
	isSet bool
}

func (v NullableCycleEol) Get() *CycleEol {
	return v.value
}

func (v *NullableCycleEol) Set(val *CycleEol) {
	v.value = val
	v.isSet = true
}

func (v NullableCycleEol) IsSet() bool {
	return v.isSet
}

func (v *NullableCycleEol) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCycleEol(val *CycleEol) *NullableCycleEol {
	return &NullableCycleEol{value: val, isSet: true}
}

func (v NullableCycleEol) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCycleEol) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


