SUMMARY = "Minimal Linux Kiosk image for Lipl Display"
LICENSE = "MIT"

# Inherit the core image creation recipe
inherit core-image

# De minimale set pakketten die op het filesystem moeten landen
IMAGE_INSTALL += "packagegroup-core-boot wayland weston weston-init libgles2-mesa mesa-megadriver lipl-display-femtovg"

# Houd het filesystem zo compact mogelijk
IMAGE_LINGUAS = "en-us"

IMAGE_FEATURES += "allow-empty-password allow-root-login empty-root-password ssh-server-dropbear"

SYSTEMD_DEFAULT_TARGET = "graphical.target"
