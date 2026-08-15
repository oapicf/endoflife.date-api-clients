
/*
 * Cycle_cycle.h
 *
 * The release cycle which this release is part of.
 */

#ifndef TINY_CPP_CLIENT_Cycle_cycle_H_
#define TINY_CPP_CLIENT_Cycle_cycle_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The release cycle which this release is part of.
 *
 *  \ingroup Models
 *
 */

class Cycle_cycle{
public:

    /*! \brief Constructor.
	 */
    Cycle_cycle();
    Cycle_cycle(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Cycle_cycle();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Cycle_cycle_H_ */
