DESCRIPTION = "OsmoBTS a Free Software GSM Base Transceiver Station"
DEPENDS = ""
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d73201eaa7756524349718536abd889"

DEPENDS = "uhd"

EXTRA_OECONF = " --with-neon"

PARALLEL_MAKE = ""

inherit autotools-brokensep

PV = "0.1+gitr${SRCPV}"

SRCREV = "187225cf337244ad7061745b7834a027e44855be"
SRC_URI = "git://git.osmocom.org/osmo-trx.git;protocol=git \
         "

S = "${WORKDIR}/git"
