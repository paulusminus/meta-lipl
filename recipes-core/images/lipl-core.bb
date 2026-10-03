SUMMARY = "Custom image with cage kiosk"
DESCRIPTION = ""
LICENSE = "MIT"

# Inherit the core image creation recipe
inherit core-image

IMAGE_FEATURES += "ssh-server-openssh package-management"

EXTRA_IMAGE_FEATURES += "debug-tweaks"
