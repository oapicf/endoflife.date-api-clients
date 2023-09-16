#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AnyType.h"
#include "Cycle.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief All Products. *Synchronous*
 *
 * Return a list of all products. Each of these can be used for the other API endpoints.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getApiAllJsonSync(char * accessToken,
	
	void(* handler)(AnyType, Error, void* )
	, void* userData);

/*! \brief All Products. *Asynchronous*
 *
 * Return a list of all products. Each of these can be used for the other API endpoints.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getApiAllJsonAsync(char * accessToken,
	
	void(* handler)(AnyType, Error, void* )
	, void* userData);


/*! \brief Single cycle details. *Synchronous*
 *
 * Gets details of a single cycle
 * \param product Product URL as per the canonical URL on the endofife.date website *Required*
 * \param cycle Release Cycle for which the details must be fetched *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getApiProductCycleJsonSync(char * accessToken,
	AnyType product, AnyType cycle, 
	void(* handler)(Cycle, Error, void* )
	, void* userData);

/*! \brief Single cycle details. *Asynchronous*
 *
 * Gets details of a single cycle
 * \param product Product URL as per the canonical URL on the endofife.date website *Required*
 * \param cycle Release Cycle for which the details must be fetched *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getApiProductCycleJsonAsync(char * accessToken,
	AnyType product, AnyType cycle, 
	void(* handler)(Cycle, Error, void* )
	, void* userData);


/*! \brief Get All Details. *Synchronous*
 *
 * Get EoL dates of all cycles of a given product.
 * \param product Product URL as per the canonical URL on the endofife.date website *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getApiProductJsonSync(char * accessToken,
	AnyType product, 
	void(* handler)(AnyType, Error, void* )
	, void* userData);

/*! \brief Get All Details. *Asynchronous*
 *
 * Get EoL dates of all cycles of a given product.
 * \param product Product URL as per the canonical URL on the endofife.date website *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getApiProductJsonAsync(char * accessToken,
	AnyType product, 
	void(* handler)(AnyType, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://endoflife.date";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
