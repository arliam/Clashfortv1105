## Clash for AndroidTV

forked from [Clash for Android](https://github.com/Kr328/ClashForAndroid)

embed a web server to input long text using other device,such as smart phone

![截图](./img/img.png)

A Graphical user interface of [clash](https://github.com/Dreamacro/clash) for Android

<a href="https://play.google.com/store/apps/details?id=com.github.kr328.clash"><img width="200px" alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png"/></a>
or [Releases](https://github.com/Kr328/ClashForAndroid/releases)

### Feature

Fully feature of [clash](https://github.com/Dreamacro/clash) ~~(Exclude `external-controller`~~

### Requirement

- Android 5.0+ (minimum)
- Android 7.0+ (recommend)
- `armeabi-v7a` , `arm64-v8a`, `x86` or `x86_64` Architecture

### License

See also [LICENSE](./LICENSE) and [NOTICE](./NOTICE)

### Privacy Policy

See also [PRIVACY_POLICY.md](./PRIVACY_POLICY.md)

### Build

1. Update submodules

   ```bash
   git submodule update --init --recursive
   ```

2. Install **OpenJDK 11**, **Android SDK**, **CMake** and **Golang**

3. Create `local.properties` in project root with

   ```properties
   sdk.dir=/path/to/android-sdk
   ```

4. Create `signing.properties` in project root with

   ```properties
   keystore.path=/path/to/keystore/file
   keystore.password=<key store password>
   key.alias=<key alias>
   key.password=<key password>
   ```

5. Build

   ```bash
   ./gradlew app:assembleFossRelease
   ```

6. Pick `app-<version>-foss-<arch>-release.apk` in `app/build/outputs/apk/foss/release/`
