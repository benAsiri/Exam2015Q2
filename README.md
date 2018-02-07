# SM2015Q1_Sample Answers_SLIITVERSION

This answer might be not right for you if you are not woring out by yourself. Please find your own way.

## Question 1 - SM

Using the Java reflection API, write a method called “searchClasses()” that:

1. Takes two parameters:
1.1 A single string representing a class name (the “search” class), and
1.2 An array of strings representing a list of class names;

2. Examines each method in each class in the array;
3. Finds and outputs the methods that return the search class OR any superclass
(direct or indirect) of the search class. Output should be in the format “Class-
Name.methodName”.
For example, consider the following code:

```
class ClassW {...}
class ClassX extends ClassW {...}
class ClassY extends ClassX {...}
class ClassZ extends ClassY {...}

class ClassA {
  public ClassY method1() {...}
  public String method2(int i, double j) {...}
  public ClassX method3(ClassX x, int j) {...}
}

class ClassB {
  public ClassZ method4() {...}
  public ClassW method5(int x, int y, int z) {...}
}
```
Say your searchClasses() method is called like this:

```
String[] classList = {"ClassA", "ClassB"};
searchClasses("ClassY", classList);
```

It should then output the following:
```
ClassA.method1
ClassA.method3
ClassB.method5
```

• These methods return ClassY (the search class), its superclass ClassX, or the “supersuperclass”
ClassW.
You may ignore exception handling. You may also assume (if you need to) that the
inheritance tree for the search class is at most 100 levels deep. Refer to the following
method signatures on the next page as required.

• java.lang.Class:
```
String getName();
Class forName(String);
Method getMethod(String, Object...);
Method[] getMethods();
Class getSuperclass();
Class asSubclass(Class);
```

• java.lang.reflect.Method:
```
String getName();
boolean isAccessible();
Class[] getParameterTypes();
Class getReturnType();
```

## Authors

* **Dileepa** - *Initial work* - [dsrajapaksa](https://github.com/dsrajapaksa)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

