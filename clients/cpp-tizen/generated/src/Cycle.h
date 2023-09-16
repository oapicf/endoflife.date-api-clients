/*
 * Cycle.h
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */

#ifndef _Cycle_H_
#define _Cycle_H_


#include <string>
#include "AnyType.h"
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

	/*! \brief Get Release Cycle
	 */
	AnyType getCycle();

	/*! \brief Set Release Cycle
	 */
	void setCycle(AnyType  cycle);
	/*! \brief Get Release Date for the first release in this cycle
	 */
	AnyType getReleaseDate();

	/*! \brief Set Release Date for the first release in this cycle
	 */
	void setReleaseDate(AnyType  releaseDate);
	/*! \brief Get End of Life Date for this release cycle
	 */
	AnyType getEol();

	/*! \brief Set End of Life Date for this release cycle
	 */
	void setEol(AnyType  eol);
	/*! \brief Get Latest release in this cycle
	 */
	AnyType getLatest();

	/*! \brief Set Latest release in this cycle
	 */
	void setLatest(AnyType  latest);
	/*! \brief Get Link to changelog for the latest release, if available
	 */
	AnyType getLink();

	/*! \brief Set Link to changelog for the latest release, if available
	 */
	void setLink(AnyType  link);
	/*! \brief Get Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
	 */
	AnyType getLts();

	/*! \brief Set Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
	 */
	void setLts(AnyType  lts);
	/*! \brief Get Whether this release cycle has active support
	 */
	AnyType getSupport();

	/*! \brief Set Whether this release cycle has active support
	 */
	void setSupport(AnyType  support);
	/*! \brief Get Whether this cycle is now discontinued.
	 */
	AnyType getDiscontinued();

	/*! \brief Set Whether this cycle is now discontinued.
	 */
	void setDiscontinued(AnyType  discontinued);

private:
	AnyType cycle;
	AnyType releaseDate;
	AnyType eol;
	AnyType latest;
	AnyType link;
	AnyType lts;
	AnyType support;
	AnyType discontinued;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Cycle_H_ */
