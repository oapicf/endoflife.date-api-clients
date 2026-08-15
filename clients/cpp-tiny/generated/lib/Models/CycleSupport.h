
/*
 * Cycle_support.h
 *
 * Whether this release cycle has active support.
 */

#ifndef TINY_CPP_CLIENT_Cycle_support_H_
#define TINY_CPP_CLIENT_Cycle_support_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Whether this release cycle has active support.
 *
 *  \ingroup Models
 *
 */

class Cycle_support{
public:

    /*! \brief Constructor.
	 */
    Cycle_support();
    Cycle_support(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Cycle_support();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Cycle_support_H_ */
