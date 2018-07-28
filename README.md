Kotlin RythmEngine Demo
=======================

Use [rythmengine](https://github.com/rythmengine/rythmengine) to render templates.

Notice
------

- we should only `@item.name@` or `@item.getName()` for the `User.name` property. Since the syntax `@item.name` is only for field, which is not accessible in Kotlin.
- It's recommend to put templates under a directory named `rythm`, which will be the root if there are more than one templates.

Resources
---------

- Code: <https://github.com/rythmengine/rythmengine>
- Online Demos: <http://fiddle.rythmengine.org/#/editor>
- Documentation: <http://rythmengine.org/doc/index>
- IDEA plugin: <https://plugins.jetbrains.com/plugin/9438-rythm-engine-detector--r-e-d>