SUMMARY = "Lipl Display FemtoVG"
HOMEPAGE = "https://github.com/paulusminus/lipl-display-femtovg"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8603333d779042e07e42f7c59853cd49"

# 1. Inherit the native Yocto cargo build system
inherit cargo cargo-update-recipe-crates

# 2. Point to the remote GitHub repository
SRC_URI = "git://github.com/paulusminus/lipl-display-femtovg.git;protocol=https;branch=main"
SRCREV = "ac93f6da3b328cd66e3fd5b636133a3b2db18b54"

# 3. Include the auto-generated crate dependencies list
include ${BPN}-crates.inc

# We do not need to customize installation because the default cargo install behavior is sufficient for this package.
