#import <Foundation/Foundation.h>
#import "OAIObject.h"

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


#import "OAIAnyType.h"
@protocol OAIAnyType;
@class OAIAnyType;



@protocol OAICycle
@end

@interface OAICycle : OAIObject

/* Release Cycle [optional]
 */
@property(nonatomic) OAIAnyType* cycle;
/* Release Date for the first release in this cycle [optional]
 */
@property(nonatomic) OAIAnyType* releaseDate;
/* End of Life Date for this release cycle [optional]
 */
@property(nonatomic) OAIAnyType* eol;
/* Latest release in this cycle [optional]
 */
@property(nonatomic) OAIAnyType* latest;
/* Link to changelog for the latest release, if available [optional]
 */
@property(nonatomic) OAIAnyType* link;
/* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  [optional]
 */
@property(nonatomic) OAIAnyType* lts;
/* Whether this release cycle has active support [optional]
 */
@property(nonatomic) OAIAnyType* support;
/* Whether this cycle is now discontinued. [optional]
 */
@property(nonatomic) OAIAnyType* discontinued;

@end