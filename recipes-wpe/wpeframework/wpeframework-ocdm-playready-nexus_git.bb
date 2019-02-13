SUMMARY = "WPE Framework OpenCDMi module for PlayReady Nexus"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

require include/wpeframework-plugins.inc

DEPENDS += " broadcom-refsw"

SRC_URI = "git://git@github.com/WebPlatformForEmbedded/OCDM-Playready-Nexus.git;protocol=https;branch=master"
SRCREV = "237d0d2a0c1d285e23c1c05a6edfa3ceb9110b84"

FILES_${PN} = "${datadir}/WPEFramework/OCDM/*.drm"