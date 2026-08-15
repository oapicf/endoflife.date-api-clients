
/*
 * Cycle_eol.h
 *
 * End-of-Life date for this release cycle.
 */

#ifndef TINY_CPP_CLIENT_Cycle_eol_H_
#define TINY_CPP_CLIENT_Cycle_eol_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief End-of-Life date for this release cycle.
 *
 *  \ingroup Models
 *
 */

class Cycle_eol{
public:

    /*! \brief Constructor.
	 */
    Cycle_eol();
    Cycle_eol(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Cycle_eol();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Cycle_eol_H_ */
