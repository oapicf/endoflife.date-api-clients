/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `cycle` generated from model 'cycle'
-- Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
--

CREATE TABLE IF NOT EXISTS `cycle` (
  `cycle` TEXT DEFAULT NULL COMMENT 'Release Cycle',
  `releaseDate` TEXT DEFAULT NULL COMMENT 'Release Date for the first release in this cycle',
  `eol` TEXT DEFAULT NULL COMMENT 'End of Life Date for this release cycle',
  `latest` TEXT DEFAULT NULL COMMENT 'Latest release in this cycle',
  `link` TEXT DEFAULT NULL COMMENT 'Link to changelog for the latest release, if available',
  `lts` TEXT DEFAULT NULL COMMENT 'Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ',
  `support` TEXT DEFAULT NULL COMMENT 'Whether this release cycle has active support',
  `discontinued` TEXT DEFAULT NULL COMMENT 'Whether this cycle is now discontinued.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.';


