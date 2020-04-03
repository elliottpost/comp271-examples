# Shapes

This problem set demonstrates how polymorphism and interfaces can be very useful in reducing code duplication.

## Part 1 Overview
We'll now demonstrate how we would create shapes without benefitting from inheritance and polymorphism

### Part 1 Steps
Use the `part1` package

#### Step 1
Open the `Rectangle.java` file and review the code.

#### Step 2
Open the `App1.java` file. Review code and run application.

#### Step 3
Consider: How would we create a square shape? It is a rectangle, but should we just copy it and have all that duplicate code with only a few restrictions (namely that width = height)?

#### Step 4
View `Square.java`. This file was made by copying `Rectangle`.  `height` == `width` is enforced by removing width.

#### Step 5:
Open the `App2.java` file. Compare to `App1.java`. Run `App2`.

#### Step 6:
Consider: How would we create a parallelogram? It's very similar to a rectangle, but with angled edges. Let's enforce a 45 degree and 135 degree angle. Example:   

    **********  
    \         \  
     \         \  
      **********  


#### Step 7
View `Parallelogram.java`. This file was made by copying `Rectangle`.  The angles are is enforced in the print method.

#### Step 8:
Open the `App3.java` file. Compare to `App2.java`. Run `App3`.

### Part 1 Summary
You should have noticed a great deal of code duplication. This is a problem! What if we have a bug or add a new feature? We need to change many files. Consider: adding a `getArea()` method requires us to change 3 files. Our code is also complicated.

## Part 2 Overview
We'll now have `Square` and `Parallelogram` extend `Rectangle`

### Part 2 Steps
Use the package `part2`. 

#### Step 1:
Notice the `Rectangle` class has a new method, `getArea()`. This is the only change made. 

#### Step 2: 
Review `Square`. Notice that `Square` _extends_ `Rectangle`. Notice all methods have been removed, except the constructor. The constructor now calls `super(h, h)` which is passing the height to `Rectangle` as both height and width. Notice the instance variable for `Square` has been removed. 

#### Step 3:
Review `Parallelogram`. Notice it does the same changes overall as `Square`, but keeps its own `print` method since it differs from `Rectangle`. This is called _overriding_. 

#### Step 4: 
Review `App1`. Notice it removes some of the code duplication, but we can improve on this further. Notice we are now printing the area of each shape, but we only had to call this method in one place, rather than 3! Otherwise, `App1` runs identical to `part1.App3.java`.

#### Step 5:
Consider: How would we add a `Circle`? It should not extend `Rectangle` since it has no relationship to it (whereas the other shapes did). 

#### Step 6:
Look at `Circle.java`. Notice is has similar methods to `Rectangle`, but some vary. In particular, it shares `print()` and `getArea()`.

#### Step 7: 
Look at `App2.java`. It runs like `App1.java`, but we start seeing more code duplication now that we have another shape that isn't a type of rectangle.

### Part 2 Summary
We saw that by extending the Rectangle class, we are able to use inheritance to greatly reduce the code duplication within the `Square` and `Parallelogram` files themselves. We also saw that we can use polymorphism in the `Appx` files to reduce code duplication and complexity. However, as soon as we introduced another type of shape which is not also a type of rectangle, we started seeing a similar pattern to what happened in part 1.

## Part 3 Overview
We will create a Shape interface which all shapes will implement. You may have recognized that we have been calling all these objects shapes, and that we talk about what _type_ of shape they are! We can use that idea to create an interface which _is a_ `Shape`, and then every class which _implements_ `Shape`, _is a_ type of `Shape`! This will allow us to take our polymorphism further and reduce code duplication even more!

### Part 3 Steps
Use the package `part3`. 

#### Step 1:
Notice the `Shape` interface. This interface defines what constitutes a shape, and what all shapes must _implement_. In particular, all shapes must implement `getArea()` and `print()`.

#### Step 2:
Inspect `Circle`. Notice it now _implements_ `Shape`. This means that `Circle` _is a_ type of `Shape`! This is the only change made to Circle.

#### Step 3:
Inspect `Rectangle`. Notice it now _implements_ `Shape`. This means that `Rectangle` _is a_ type of `Shape`! This is the only change made to Rectangle.

#### Step 4:
Inspect `Square`. Notice it does *not* explicitly _implement_ `Shape`. But, `Square` _is a_ type of `Shape`! How? It is because `Square` _is a_ type of `Rectangle` (through extension), and if `Rectangle` _is a_ `Shape`, then `Square` *must* be a `Shape`, too. If you're familiar with boolean algebra, it follows this law: `a -> b -> c` (_a implies b implies c_) thus `a -> c` (_a implies c_).

#### Step 5: 
Notice that `Parallelogram` follows the same logic as `Square`.

#### Step 6:
Inspect `App1`. Notice now refer to all the shapes as `Shape`. We no longer have `Rectangle r` and `Circle c`! This has reduced our code duplication. 

#### Step 7:
Consider: how would we improve `App1` even further? There's a lot of code in `main()` yet, and we've talked about breaking it into subtasks. There's also a lot of local variables, and public methods that are helper methods. In short, there's a lot of room for improvement.

#### Step 8:
Inspect `App2`. Notice we have 2 _class variables_ instead of 1. Then notice the `main()` method has been greatly simplified. We no longer are using local variables, and our loop has been shortened to 3 lines of code, which makes it very easy to read and easy to check for infinite loops!

Next, you should notice the line `s = create();`. The `create()` method is handling accepting user input and returning a type of `Shape`! In the past, we have always returned object types. Now you can see we must still return an object, but it can be any object that _is a_ `Shape`!

Notice how our `create()` method has even shortened greatly the logic for handling user input. We are now returning null or the shape immediately upon understanding what the user wants. This also allows us to enter an invalid data type (like a string) and have the program reset instead of exit!  

Next, notice all the helper methods have been made private. They never need to be accessed outside of `App2`, so there's no need for them to be public. 

#### Step 9:
Consider: let's say you want all shapes to have more things in common, perhaps color, type, also scale. How would you implement this? That is part of your assignment. Keep reading for details!


## Part 4 Steps
For part 4, you'll be working through the solutions on your own. Your tasks follow:

### Written Prompts

1. Uncomment the method heading `String getType()` the `Shape` interface. Declare it as private. What error message do you get when you try to compile? 
1. Why does making an interface method private give an error?
1. Why do we not declare `public` in the method headings of an interface?
1. Remove `private` from the getType() method heading. Add a method body. What error message do you get when you try to compile?
1. Why does having method body give you an error message?
1. Remove the method body from the interface and restore the method heading (ie: `String getType();`). What error message happens when you try to compile `Circle.java`?
1. Why does Circle.java fail to compile?
1. In one or two sentences and _in your own words_: what is an abstract class? 
1. Why is `ShapeBase` an abstract class?
1. What is the benefit of having `ShapeBase` an abstract class?
1. Why are `Circle` and `Rectangle` still `Shape`s even though they no longer implement `Shape`? (Hint: see discussion in lab README on `Square`).  
1. What is the `toString()` method in `ShapeBase` doing? Be specific! Hint: look at `App.printShape()` and answer this question _after_ you have completed the programming portions.


### Programming portion

* Uncomment the lines on `Shape` (complete the `@todo` in Shape).
* Implement `getType()`  in the appropriate place(s).
* Implement `setScale()`  in the appropriate place(s). Make sure you're using the `scale` variable found in `ShapeBase`. Hint: there's 2 ways to do this. One will get you full credit for proving you understand inheritance (hint!), the other will work but will not use inheritance.
* Implement `getScale()` in the appropriate place(s). Make sure you're using the `scale` variable found in `ShapeBase`. Hint: there's 2 ways to do this. One will get you full credit for proving you understand inheritance (hint!), the other will work but will not use inheritance. 
* Add a new type of `Shape` called `EquilateralTriangle`. Update `App` to allow the user to create an equilateral triangle. Be sure to continue using polymorphism for credit.

### Notes & Hints

* If you're trying to compile before you implement the missing methods, you'll get some errors for `App.java` and `ShapeBase.java` Those problematic lines are commented for now, but be sure to uncomment them before you submit, to ensure your code is working as expected.  
* Notice `ShapeBase` has an instance variable `scale`. This should provide some guidance with respect to the inheritance sections.  
* Technically, all rectangles are parallelograms, and all paralllograms are _not_ rectangles. However, every parallelogram with equal width on both sides and equal height on both sides, like our parralelograms, _are_ rectangles.  
* The `Circle` draw method is a bit crude when only using asterisks and working with small radiuses, but hopefully you'll get the idea.



## Submission Instructions (Please Read!)

Add your name in a comment to the top of EVERY file you submit, always. If you are working with a partner, both names need to be present. If a name is missing, the missing name gets 0 credit.  

When you are done, please submit the part 4 \*.java files via Sakai. You do not need to submit the \*.class files. Also submit any other files such as text files/written responses.

Zip the java files into a folder with your last name then first initial, for example: "POST_E.zip". 

If you are working with a partner, **only one student should submit**. Both students names should be found in zip folder name. Ex: If my partner is Margaret Hamilton, my zip folder would look like "HAMILTON_M_POST_E.zip". 

Good luck!