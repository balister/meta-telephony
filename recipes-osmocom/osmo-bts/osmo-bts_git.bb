DESCRIPTION = "OsmoBTS a Free Software GSM Base Transceiver Station"
DEPENDS = ""
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-abis openbsc"

EXTRA_OECONF = " "

inherit autotools

PV = "0.13.0+gitr${SRCPV}"

SRCREV = "a2b806c375dc6b3e3b7df0496e06b34b1520bd1b"
SRC_URI = "git://git.osmocom.org/osmo-bts.git;protocol=git \
           file://0001-Move-gsm_shared_data-into-osmo-bts.patch \
           file://0001-Remove-sysmobts-tests-from-the-build.patch \
         "

S = "${WORKDIR}/git"
