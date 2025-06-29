# 🚀 7-Day Flutter Mastery Plan

A focused plan to go from React dev to confident Flutter developer in one week.

---

## 🗓️ Overview

| Day | Topics                      | Goals                             | Outcome                                       |
| --- | --------------------------- | --------------------------------- | --------------------------------------------- |
| 1   | Setup, Dart, Hello World    | Setup tools and learn Dart basics | Run first Flutter app                         |
| 2   | Widgets & Layouts           | Build UIs with Flutter widgets    | Create custom UI screens                      |
| 3   | Stateful Widgets            | Handle interactivity              | Counter, toggles, and input handling          |
| 4   | Navigation & Forms          | Multi-screen & input forms        | Route between pages, capture user input       |
| 5   | API Calls & JSON            | Connect to backend services       | Display dynamic data from internet            |
| 6   | State Management (Provider) | Manage app-wide state             | Use Provider to share and update global state |
| 7   | Final Project               | Combine all knowledge             | Build a complete mini Flutter app             |

---

## ✅ Day 1: Setup, Dart, Hello World

* Install Flutter SDK
* Setup VS Code or Android Studio
* Run `flutter doctor`
* Create a sample project:

```dart
void main() => runApp(MaterialApp(home: Text("Hello Flutter")));
```

* Learn Dart basics: variables, lists, maps, functions

---

## ✅ Day 2: Layouts and Widgets

* Learn UI building blocks:

  * `Text`, `Container`, `Row`, `Column`, `Padding`, `Scaffold`, `AppBar`, `Center`
* Use styling with `TextStyle`, `BoxDecoration`, etc.

Example:

```dart
Scaffold(
  appBar: AppBar(title: Text("My App")),
  body: Center(
    child: Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Icon(Icons.star, size: 48),
        Text("Welcome", style: TextStyle(fontSize: 24)),
      ],
    ),
  ),
)
```

---

## ✅ Day 3: Stateful Widgets

* Learn `StatefulWidget`, `setState`
* Handle interaction: `ElevatedButton`, `Switch`, etc.

Example:

```dart
int counter = 0;
ElevatedButton(
  onPressed: () => setState(() => counter++),
  child: Text("Count: \$counter"),
);
```

---

## ✅ Day 4: Navigation and Forms

* Learn `Navigator.push`, `Navigator.pop`
* Learn `TextField`, `Form`, `TextEditingController`, `GlobalKey`

Example:

```dart
Navigator.push(
  context,
  MaterialPageRoute(builder: (_) => SecondScreen()),
);
```

---

## ✅ Day 5: API Calls and JSON

* Add `http` package
* Use `FutureBuilder` for async rendering
* Use `async/await`, `jsonDecode`

Example:

```dart
final response = await http.get(Uri.parse("https://api.example.com/data"));
final data = jsonDecode(response.body);
```

---

## ✅ Day 6: State Management (Provider)

* Install `provider`
* Create model with `ChangeNotifier`
* Wrap with `MultiProvider`
* Use `context.watch`, `context.read`

Example:

```dart
class Counter with ChangeNotifier {
  int count = 0;
  void increment() {
    count++;
    notifyListeners();
  }
}
```

---

## ✅ Day 7: Final Project - Task Manager

* Features:

  * Add new tasks
  * View task list
  * Mark tasks complete
* Use Provider for task state
* Stretch Goals:

  * Persist tasks using `SharedPreferences`
  * Add dark mode
  * Use animations

---

## 🏁 After This Week

* Learn more advanced state management like Riverpod or Bloc
* Explore Firebase, camera, maps, storage
* Contribute to open-source Flutter projects
* Build portfolio apps
