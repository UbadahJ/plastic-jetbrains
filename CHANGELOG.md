<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# plastic-jetbrains Changelog

## [Unreleased]

## [1.0.0]
### Added
- Islands theme support (based on Islands Dark)
- K2 Kotlin mode support for the Kotlin semantic annotator

### Changed
- require IntelliJ Platform 2025.3 (253) or newer, no upper build limit
- tool windows, gutter and console now share the editor background inside islands
- migrate build to IntelliJ Platform Gradle Plugin 2.x

## [0.3.0]
### Fixed
- set maximum build number to 221.* for current EAP (fixes #5)

## [0.2.0]
### Changed
- improve muted colors to be less invasive to the eye
- update breakpoint background to be red-ish

## [0.1.0-beta]
### Added
- add coloring support for kotlin ([7cfc536](https://github.com/barfurth/plastic-jb-ide/commit/7cfc5360927719f3d90d5a19ac33bb7a99d952c1))
- provide initial port including java coloring ([649f453](https://github.com/barfurth/plastic-jb-ide/commit/649f4532a682e81e388c79e5c44e3880eea91eda))