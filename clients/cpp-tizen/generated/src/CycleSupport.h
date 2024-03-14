/*
 * Cycle_support.h
 *
 * Whether this release cycle has active support
 */

#ifndef _Cycle_support_H_
#define _Cycle_support_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Whether this release cycle has active support
 *
 *  \ingroup Models
 *
 */

class Cycle_support : public Object {
public:
	/*! \brief Constructor.
	 */
	Cycle_support();
	Cycle_support(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Cycle_support();

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

#endif /* _Cycle_support_H_ */
