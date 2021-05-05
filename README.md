# PvZQuiz
A simple quiz game built with some specific requirements. Why is it called PvZQuiz? It's because i started playing Plant vs Zombie again while building this app.
* A single player quiz game
* A start screen that a user can start a new game
* 10 unique questions, each quiz question has 5 choices
* You have 10 seconds to answer each question
* Once quiz is completed, show a result page. Allow user to start a new game

# What is it made of?
* [Android Data Binding Library](https://developer.android.com/topic/libraries/data-binding/index.html) Binding of xml elements
* [MVVM Framework](https://en.wikipedia.org/wiki/Model–view–viewmodel) A framework that i'm using for the first time actually, which works quite well with data binding library.
* [Greenbot's EventBus](https://github.com/greenrobot/EventBus) to untangle message passing
* The usual material support library from Google
* The actual quiz questions are included in the project in the form a `.json` file under `/res/raw/quiz.json`

