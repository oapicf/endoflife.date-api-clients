
/*
 * Cycle_lts.h
 *
 * Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
 */

#ifndef TINY_CPP_CLIENT_Cycle_lts_H_
#define TINY_CPP_CLIENT_Cycle_lts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
 *
 *  \ingroup Models
 *
 */

class Cycle_lts{
public:

    /*! \brief Constructor.
	 */
    Cycle_lts();
    Cycle_lts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Cycle_lts();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Cycle_lts_H_ */
