
/*
 * Cycle_discontinued.h
 *
 * Whether this device version is no longer in production.
 */

#ifndef TINY_CPP_CLIENT_Cycle_discontinued_H_
#define TINY_CPP_CLIENT_Cycle_discontinued_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Whether this device version is no longer in production.
 *
 *  \ingroup Models
 *
 */

class Cycle_discontinued{
public:

    /*! \brief Constructor.
	 */
    Cycle_discontinued();
    Cycle_discontinued(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Cycle_discontinued();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Cycle_discontinued_H_ */
