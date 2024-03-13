# Cycle

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cycle** | Pointer to [**CycleCycle**](CycleCycle.md) |  | [optional] 
**ReleaseDate** | Pointer to **string** | Release Date for the first release in this cycle | [optional] 
**Eol** | Pointer to [**CycleEol**](CycleEol.md) |  | [optional] 
**Latest** | Pointer to **string** | Latest release in this cycle | [optional] 
**Link** | Pointer to **NullableString** | Link to changelog for the latest release, if available | [optional] 
**Lts** | Pointer to [**CycleLts**](CycleLts.md) |  | [optional] 
**Support** | Pointer to [**CycleSupport**](CycleSupport.md) |  | [optional] 
**Discontinued** | Pointer to [**CycleDiscontinued**](CycleDiscontinued.md) |  | [optional] 

## Methods

### NewCycle

`func NewCycle() *Cycle`

NewCycle instantiates a new Cycle object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCycleWithDefaults

`func NewCycleWithDefaults() *Cycle`

NewCycleWithDefaults instantiates a new Cycle object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCycle

`func (o *Cycle) GetCycle() CycleCycle`

GetCycle returns the Cycle field if non-nil, zero value otherwise.

### GetCycleOk

`func (o *Cycle) GetCycleOk() (*CycleCycle, bool)`

GetCycleOk returns a tuple with the Cycle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCycle

`func (o *Cycle) SetCycle(v CycleCycle)`

SetCycle sets Cycle field to given value.

### HasCycle

`func (o *Cycle) HasCycle() bool`

HasCycle returns a boolean if a field has been set.

### GetReleaseDate

`func (o *Cycle) GetReleaseDate() string`

GetReleaseDate returns the ReleaseDate field if non-nil, zero value otherwise.

### GetReleaseDateOk

`func (o *Cycle) GetReleaseDateOk() (*string, bool)`

GetReleaseDateOk returns a tuple with the ReleaseDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReleaseDate

`func (o *Cycle) SetReleaseDate(v string)`

SetReleaseDate sets ReleaseDate field to given value.

### HasReleaseDate

`func (o *Cycle) HasReleaseDate() bool`

HasReleaseDate returns a boolean if a field has been set.

### GetEol

`func (o *Cycle) GetEol() CycleEol`

GetEol returns the Eol field if non-nil, zero value otherwise.

### GetEolOk

`func (o *Cycle) GetEolOk() (*CycleEol, bool)`

GetEolOk returns a tuple with the Eol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEol

`func (o *Cycle) SetEol(v CycleEol)`

SetEol sets Eol field to given value.

### HasEol

`func (o *Cycle) HasEol() bool`

HasEol returns a boolean if a field has been set.

### GetLatest

`func (o *Cycle) GetLatest() string`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *Cycle) GetLatestOk() (*string, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *Cycle) SetLatest(v string)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *Cycle) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetLink

`func (o *Cycle) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *Cycle) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *Cycle) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *Cycle) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *Cycle) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *Cycle) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetLts

`func (o *Cycle) GetLts() CycleLts`

GetLts returns the Lts field if non-nil, zero value otherwise.

### GetLtsOk

`func (o *Cycle) GetLtsOk() (*CycleLts, bool)`

GetLtsOk returns a tuple with the Lts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLts

`func (o *Cycle) SetLts(v CycleLts)`

SetLts sets Lts field to given value.

### HasLts

`func (o *Cycle) HasLts() bool`

HasLts returns a boolean if a field has been set.

### GetSupport

`func (o *Cycle) GetSupport() CycleSupport`

GetSupport returns the Support field if non-nil, zero value otherwise.

### GetSupportOk

`func (o *Cycle) GetSupportOk() (*CycleSupport, bool)`

GetSupportOk returns a tuple with the Support field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupport

`func (o *Cycle) SetSupport(v CycleSupport)`

SetSupport sets Support field to given value.

### HasSupport

`func (o *Cycle) HasSupport() bool`

HasSupport returns a boolean if a field has been set.

### GetDiscontinued

`func (o *Cycle) GetDiscontinued() CycleDiscontinued`

GetDiscontinued returns the Discontinued field if non-nil, zero value otherwise.

### GetDiscontinuedOk

`func (o *Cycle) GetDiscontinuedOk() (*CycleDiscontinued, bool)`

GetDiscontinuedOk returns a tuple with the Discontinued field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscontinued

`func (o *Cycle) SetDiscontinued(v CycleDiscontinued)`

SetDiscontinued sets Discontinued field to given value.

### HasDiscontinued

`func (o *Cycle) HasDiscontinued() bool`

HasDiscontinued returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


