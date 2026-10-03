SUMMARY = "Custom image with cage kiosk"
DESCRIPTION = ""
LICENSE = "MIT"

# Inherit the core image creation recipe
inherit core-image

IMAGE_FEATURES += "ssh-server-openssh package-management"

EXTRA_IMAGE_FEATURES += "allow-empty-password allow-root-login empty-root-password package-management ssh-server-openssh"

IMAGE_INSTALL:append = " bluez5 dbus lipl-display-femtovg cage"
