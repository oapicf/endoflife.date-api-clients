/*
 * Cycle_lts.h
 *
 * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
 */

#ifndef _Cycle_lts_H_
#define _Cycle_lts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
 *
 *  \ingroup Models
 *
 */

class Cycle_lts : public Object {
public:
	/*! \brief Constructor.
	 */
	Cycle_lts();
	Cycle_lts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Cycle_lts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _Cycle_lts_H_ */
