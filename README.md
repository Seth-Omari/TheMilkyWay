# The Milky Way

The App consumes NASA search API to show a list of Milky Way Images taken in 2017.

### Prerequisites

The project has all required dependencies in the gradle files. Add the Project to Android Studio or
IntelliJ and build.All the required dependencies will be downloaded and installed.

## Architecture

The project uses MVVM architecture pattern.

## Tech-stack

* [Kotlin](https://kotlinlang.org/) - a cross-platform, statically typed, general-purpose
  programming language with type inference.

## Libraries

* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel/) - Manage UI
  related data in a lifecycle conscious way.
* [ViewBinding](https://developer.android.com/topic/libraries/data-binding) - support library that
  allows binding of UI components in layouts to data sources,binds milky way image details to UI
* [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started)
    - Android Jetpack's Navigation component to navigate between MilkyWayFragment and
      MilkyWayDetailsFragment
* [Dagger Hilt](https://developer.android.com/jetpack/androidx/releases/hilt) - For Dependency
  Injection. Used this for easy testing, refactoring and to enhance re-usability of dependencies
* [Retrofit](https://square.github.io/retrofit/) - To fetch milky way images from the NASA search
  API.
* [Kotlin Flow](https://developer.android.com/kotlin/flow) - To access data sequentially
* [Espresso](https://developer.android.com/training/testing/espresso) - For UI tests.

## Screenshots

| Milky Way Images List | Milky Way Image Details |
| ------ | ----- |
| ![Milky way Images](/Screenshots/MilkyWayImagesList.jpg) | ![Milky way details](/Screenshots/MlikyWayImageDetails.jpg) | 

## Things to improve
* Use room to persist the milky way data locally so that user can access the milky way data while their device is offline.
* To move the mapping logic to the view model class to reduce logic on the view.
* Change the date format for the date the milky way image was taken.






