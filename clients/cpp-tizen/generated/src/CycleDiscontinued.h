/*
 * Cycle_discontinued.h
 *
 * Whether this cycle is now discontinued.
 */

#ifndef _Cycle_discontinued_H_
#define _Cycle_discontinued_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Whether this cycle is now discontinued.
 *
 *  \ingroup Models
 *
 */

class Cycle_discontinued : public Object {
public:
	/*! \brief Constructor.
	 */
	Cycle_discontinued();
	Cycle_discontinued(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Cycle_discontinued();

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

#endif /* _Cycle_discontinued_H_ */
