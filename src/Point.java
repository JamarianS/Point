#  Answer to each question in details (You can google to find answers)

        - What is Java and what are its key features?
        Java is an object oriented programming language
        The approach was developed to increase programmer's productivity and also to overcome the traditional approach of programming. Java supports several OOP features like Objects, Class, Data Abstraction, Encapsulation, Data Hiding, Inheritance and Polymorphism.
        - How do you declare and use variables in Java?
        To create a variable, you must specify the type and assign it a value:
        Where type is one of Java's types (such as int or String), and variableName is the name of the variable (such as x or name). The equal sign is used to assign values to the variable.
        - What is a class in Java and how do you define one?
        A Java class is the template from which objects are created. It is a blueprint for an object. A class is created using the keyword class . Classes can contain methods, which are actions that the class can perform, and fields, which are variables that contain data used by the class.
        - What is encapsulation and how is it achieved in Java?
        Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.. Declare the variables of a class as private. Provide public setter and getter methods to modify and view the variables value
        - How do you create objects in Java and what is their role in the program?
        In Java, the new keyword is used to create new objects. Declaration − A variable declaration with a variable name with an object type. Instantiation − The 'new' keyword is used to create the object. An object stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages).
        - What is the difference between a method and a constructor in Java?
        In Java, constructors must be called with the same name as the name of the class in which they live, whereas methods can have any name and can be called directly either with a reference to the class or an object reference.
        - How do you implement inheritance in Java and what are its benefits?
        Inheritance in java is one of the core concepts of Object-Oriented Programming. Java Inheritance is used when we have is-a relationship between objects. Inheritance in Java is implemented using extends keyword.
        - What is abstraction and how is it achieved in Java?
        Data abstraction is a method where essential elements are displayed to the user and trivial elements are kept hidden. In Java, abstraction is achieved by using the abstract keyword for classes and interfaces. In abstract classes, we can have abstract methods as well as concrete methods.
        - How do you work with arrays and ArrayLists in Java and what are their differences?
        In Java, array is a basic functionality whereas ArrayList is a part of the collection framework. Array members can be accessed using [], while ArrayList can access elements using a set of methods and modify them.  Which of these is a key difference between arrays and ArrayLists? Arrays are fixed size but ArrayLists can change in size.

        - How do you use control statements such as if, else, and switch in Java?
        - What is a loop and how do you implement it in Java?
        Loops in Java is a feature used to execute a particular part of the program repeatedly if a given condition evaluates to be true. To implement a loop in java
        - What is a method signature in Java and why is it important?
        Method Signature in java is defined as the structure of a method that is designed by the programmer. Method Signature is the combination of a method's name and its parameter list. A class cannot have two methods with the same signature. If we declare two methods with the same signature, compilation error is thrown.In Java, signatures are used to identify methods and classes at the level of the virtual machine code. You have to declare types of variables in your code in order to be able to run the Java code. Java is strictly typed and will check any parameters at compilation time if they are correct.
        - What is a package in Java and how do you create one?
        To create a package, you choose a name for the package (naming conventions are discussed in the next section) and put a package statement with that name at the top of every source file that contains the types (classes, interfaces, enumerations, and annotation types) that you want to include in the package.
        - How do you use the String class in Java and what are some of its useful methods?
        What is the use of string class in Java?
        Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects. The Java platform provides the String class to create and manipulate strings.
        - What is a constructor in Java and how is it used to create objects?
        Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type. Sometimes constructors are also referred to as special methods to initialize an object.When you create an object, you are creating an instance of a class, therefore "instantiating" a class. The new operator requires a single, postfix argument: a call to a constructor. The name of the constructor provides the name of the class to instantiate. The constructor initializes the new object.
        - How do you implement encapsulation in Java and why are they important in OOP?
        Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.  It prevents outer classes from accessing and changing fields and methods of a class
- What is object-oriented programming and what are its main principles?
        Object-oriented programming is a programming paradigm based on the concept of "objects", which can contain data and code. Abstraction, encapsulation, polymorphism, and inheritance are the four main theoretical principles of object-oriented programming.
        - What is the difference between a class and an object in OOP?
        A class is a blueprint for declaring and creating objects. An object is a class instance that allows programmers to use variables and methods from inside the class
- What are the access modifiers in Java and how are they used to control access to class members? Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private. In Java, you can use access specifiers to protect both a class's variables and its methods when you declare them. The Java language supports four distinct access levels for member variables and methods: private, protected, public, and, if left unspecified, package.
        - How do you implement method overloading and overriding in Java?
        - How do you create and manipulate String objects in Java?

        There are two ways to create a String object:
        By string literal : Java String literal is created by using double quotes. For Example: String s=“Welcome”;
        By new keyword : Java String is created by using a keyword “new”. For example: String s=new String(“Welcome”);
        You  can simply use the traditional one (the + operator). String str1= "Hello"; String str2 = "India"; String finalResult = str1+" "+str2; 2. Changing the given string's case: We can change the case of the string whenever required by using toLowerCase() and the toUpperCase() Java built-in functions.


        - What is the purpose of the length() method in the String class?
        The Java String class contains a length() method that returns the total number of characters a given String contains. This value includes all blanks, spaces, and other special characters. Every character in the String is counted.
        - How do you concatenate Strings in Java and what is the most efficient way to do so?
        In Java, two strings can be concatenated by using the + or += operator, or through the concat() method, defined in the java. lang. String class. The StringBuilder and StringBuffer classes are the fastest way to concatenate Strings in Java.
        - What is a substring in Java and how do you extract it from a String?
        The substring() function in Java is used to extract a part of a given string. The function returns a new string containing a portion of the original string, starting from the specified index to the end or to the specified end index. The Java .substring() method extracts a substring from an existing string based on index values we pass in as integer arguments.
        - How do you compare Strings in Java and what is the difference between == and equals()?
        Generally . equals is used for Object comparison, where you want to verify if two Objects have an identical value. == for reference comparison (are the two Objects the same Object on the heap) & to check if the Object is null. It is also used to compare the values of primitive types.
        - What is the role of the char data type in Java and how is it used?
        The char keyword is a data type that is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c'.
        - What is Unicode and how does it relate to the char data type in Java?
        Unicode provides a unique number for every character, no matter what the platform, no matter what the program, no matter what the language. The char data type is a 16-bit unsigned Java primitive data type. It represents a Unicode character. Note that char is an unsigned data type.
        - How do you convert a char to a String in Java and vice versa?
        A char is a primitive data type that stores a single character value while a string stores a sequence of char values. We can convert char to string in Java using the following ways: String. valueOf() method, Character.toString() method and Concatenation of strings. We can convert String to char in java using charAt() method of String class.
        - What is the difference between char and Character in Java?
        The main difference between char and Character is that char is a primitive data type whereas Character is a wrapper class that wraps a value of the primitive type char in an object.
        - What are escape sequences and how are they used with characters in Java?
        Escape sequences are used to signal an alternative interpretation of a series of characters. In Java, a character preceded by a backslash (\) is an escape sequence. The Java compiler takes an escape sequence as one single character that has a special meaning.
        - How do you create a char array in Java and what are its uses?
        A char array is created in the following way:

        Char[] charArray

        A character array is a sequence of characters, just as a numeric array is a sequence of numbers. A typical use is to store a short piece of text as a row of characters in a character vector.
        - What is the ASCII code and how is it related to the char data type?
        ASCII, abbreviated from American Standard Code for Information Interchange, is a character encoding standard for electronic communication.an integer (ASCII value) is stored in char variables rather than the character itself. For example, if we assign 'h' to a char variable, 104 is stored in the variable rather than the character itself. It's because the ASCII value of 'h' is 104.
        - How do you convert a character to its corresponding ASCII value in Java?
        Like, double quotes (" ") are used to declare strings, we use single quotes (' ') to declare characters. Now, to find the ASCII value of ch , we just assign ch to an int variable ascii . Internally, Java converts the character value to an ASCII value. We can also cast the character ch to an integer using (int) .
        - What is a Unicode character and how is it represented in Java?
        Unicode is a computing industry standard designed to consistently and uniquely encode characters used in written languages throughout the world. The Unicode standard uses hexadecimal to express a character. For example, the value 0x0041 represents the Latin character A

        To print Unicode characters, enter the escape sequence “u”. Unicode sequences can be used everywhere in Java code. As long as it contains Unicode characters, it can be used as an identifier.

        - How do you determine the type of a character in Java?
        Character.isDigit(string.charAt(index)) will return true if it's a digit
        Character.isLetter(string.charAt(index)) will return true if it's a letter

        - How do you perform case conversion on a character in Java?
        Java - Character toUpperCase() Method
        The Java Character toUpperCase() method converts the character argument to uppercase using case mapping information from the UnicodeData file. According to UnicodeData file, case is defined as the inherent property of a character.

        - What are some of the useful methods available in the Character class in Java?

        isDefined(char ch)
        Determines whether the character is defined in the Unicode or not.
        isDefined(int codePoint)
        Determines whether the character(Unicode code point) is defined in the Unicode or not.
        isDigit(char ch)
        Determines whether the given character is a digit or not.



        - How do you compare characters in Java and what is the difference between == and equals() when used with characters?

        The major difference between the == operator and . equals() method is that one is an operator, and the other is the method. Both these == operators and equals() are used to compare objects to mark equality.


        ## Write a Java class to represent a Point in a two-dimensional space. The class should have methods to set and get the x and y coordinates, calculate the distance to another Point, and return a String representation of the Point.




public class Point {


    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distance(Point p2){
        double dx = x - p2.x;
        double dy = y - p2.y;

        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
