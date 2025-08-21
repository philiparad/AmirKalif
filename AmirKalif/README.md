# AmirKalif (Queen Fan App)

This is a simple Android app (Java) showing a custom ListView of Queen band members.
Selecting a member updates the top area with their name and photo.

## How to open
1. Open Android Studio.
2. **File → Open…** and select the `AmirKalif` folder.
3. Let Gradle sync; if asked, upgrade Gradle plugin as needed.
4. Run on an emulator or device (minSdk 21).

## Project structure
- `app/src/main/AndroidManifest.xml`
- `app/src/main/java/com/example/amirkalif/`:
  - `SplashActivity.java`, `MainActivity.java`, `Musician.java`, `MusicianAdapter.java`
- `app/src/main/res/layout/`:
  - `activity_splash.xml`, `activity_main.xml`, `list_item.xml`
- `app/src/main/res/drawable/`:
  - placeholder images for members and logo

## Notes
- Replace placeholder images in `res/drawable/` with real photos if desired.
- The splash shows your name from `res/values/strings.xml`.
