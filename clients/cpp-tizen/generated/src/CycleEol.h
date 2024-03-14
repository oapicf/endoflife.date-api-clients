/*
 * Cycle_eol.h
 *
 * End of Life Date for this release cycle
 */

#ifndef _Cycle_eol_H_
#define _Cycle_eol_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief End of Life Date for this release cycle
 *
 *  \ingroup Models
 *
 */

class Cycle_eol : public Object {
public:
	/*! \brief Constructor.
	 */
	Cycle_eol();
	Cycle_eol(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Cycle_eol();

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

#endif /* _Cycle_eol_H_ */
