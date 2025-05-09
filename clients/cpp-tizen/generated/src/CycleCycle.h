/*
 * Cycle_cycle.h
 *
 * The release cycle which this release is part of.
 */

#ifndef _Cycle_cycle_H_
#define _Cycle_cycle_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The release cycle which this release is part of.
 *
 *  \ingroup Models
 *
 */

class Cycle_cycle : public Object {
public:
	/*! \brief Constructor.
	 */
	Cycle_cycle();
	Cycle_cycle(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Cycle_cycle();

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

#endif /* _Cycle_cycle_H_ */
