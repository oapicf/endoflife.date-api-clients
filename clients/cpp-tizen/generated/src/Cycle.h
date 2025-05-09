/*
 * Cycle.h
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */

#ifndef _Cycle_H_
#define _Cycle_H_


#include <string>
#include "Cycle_cycle.h"
#include "Cycle_discontinued.h"
#include "Cycle_eol.h"
#include "Cycle_lts.h"
#include "Cycle_support.h"
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 *
 *  \ingroup Models
 *
 */

class Cycle : public Object {
public:
	/*! \brief Constructor.
	 */
	Cycle();
	Cycle(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Cycle();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Cycle_cycle getCycle();

	/*! \brief Set 
	 */
	void setCycle(Cycle_cycle  cycle);
	/*! \brief Get Release date for the first release in this cycle.
	 */
	Date getReleaseDate();

	/*! \brief Set Release date for the first release in this cycle.
	 */
	void setReleaseDate(Date  releaseDate);
	/*! \brief Get 
	 */
	Cycle_eol getEol();

	/*! \brief Set 
	 */
	void setEol(Cycle_eol  eol);
	/*! \brief Get Latest release in this cycle.
	 */
	std::string getLatest();

	/*! \brief Set Latest release in this cycle.
	 */
	void setLatest(std::string  latest);
	/*! \brief Get Link to changelog for the latest release in this cycle, or null if unavailable.
	 */
	std::string getLink();

	/*! \brief Set Link to changelog for the latest release in this cycle, or null if unavailable.
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	Cycle_lts getLts();

	/*! \brief Set 
	 */
	void setLts(Cycle_lts  lts);
	/*! \brief Get 
	 */
	Cycle_support getSupport();

	/*! \brief Set 
	 */
	void setSupport(Cycle_support  support);
	/*! \brief Get 
	 */
	Cycle_discontinued getDiscontinued();

	/*! \brief Set 
	 */
	void setDiscontinued(Cycle_discontinued  discontinued);

private:
	Cycle_cycle cycle;
	Date releaseDate;
	Cycle_eol eol;
	std::string latest;
	std::string link;
	Cycle_lts lts;
	Cycle_support support;
	Cycle_discontinued discontinued;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Cycle_H_ */
