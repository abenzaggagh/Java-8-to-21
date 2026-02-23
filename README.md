# Introduction of Modern Java

The Java programming language is a high-level, object-oriented language designed to be simple, secure, and portable. It allows developers to write code that can run on different operating systems without modification — following the famous principle: “Write Once, Run Anywhere.”

The Java platform, on the other hand, is the environment that makes this portability possible. It consists of several key components:

* JDK (Java Development Kit) – The complete toolkit for developing Java applications. It includes everything you need to write, compile, and run Java programs.
* JRE (Java Runtime Environment) – Part of the JDK, it provides the libraries and resources required to run Java applications.
* JVM (Java Virtual Machine) – Part of the JRE, it is the engine that executes Java bytecode. The JVM is what enables Java programs to run on different systems by abstracting away the underlying hardware and operating system.

## Evolution of Java - Modern Java

### Java 8 - Functional Programming

* Lambda
* Streams
* CompletableFuture

### Java 9 - Release of Java Modules

* Java Platform Module System
* Java Runtime Libraries (also modularized)

### Java 10 - Six Months Release

* New Features every 6 months

### Java 11 – First Long-Term Support (LTS)

* HTTP Client (standardized)
* New String methods (isBlank, lines, strip)
* var in lambda parameters
* Removal of Java EE and CORBA modules


### Java 12 – Switch Expressions (Preview)

* String.indent()
* Compact number formatting API

### Java 13 – Text Blocks (Preview)

* Text blocks (preview, multi-line strings)
* Dynamic CDS Archives

### Java 14 – Records & Pattern Matching (Preview)

* Records (preview)
* Pattern Matching for instanceof (preview)
* Helpful NullPointerExceptions

### Java 15 – Text Blocks Standardized

* Text blocks (final)
* Sealed classes (preview)
* Hidden classes

### Java 16 – Records Finalized

* Records (final)
* Pattern Matching for instanceof (final)
* Stream toList() method

### Java 17 – Long-Term Support (LTS)

* Sealed classes (final)
* Enhanced pseudo-random number generators
* Strong encapsulation of JDK internals

### Java 18 – Simple Web Server

* Simple built-in HTTP server
* UTF-8 as default charset


### Java 19 – Virtual Threads (Preview)

* Virtual Threads (Project Loom, preview)
* Structured concurrency (incubator)
* Record patterns (preview)

### Java 20 – Scoped Values & Pattern Matching Updates

* Scoped values (incubator)
* Record patterns (preview refinement)
* Pattern matching for switch (preview)

### Java 21 – Long-Term Support (LTS)

* Virtual Threads (final)
* Pattern Matching for switch (final)
* Record Patterns (final)
* Sequenced Collections
* Structured Concurrency (preview)

# Functional Programming

* Embraces creating immutable objects
* More concise & readable code
* Using functions/methods as first class citizens

## Imperative Programming vs Declarative Programming

### Imperative Programming

* Focuses on how to perform the operations.
* Embraces object mutability.
* This style of programming lists the step by step of instructions on how to achieve an objective.
* We write the code on what needs to be done in each step.
* Imperative style is used with classic Object Oriented Programming. 

### Declarative Programming

* Focuses on what is the result you want.
* Embraces object immutabilities.
* Analogous to SQL
* Use the functions that are already part of the library to achieve an objective.

Functional Programming uses the concept of declarative programming.

[Exemple of Imperative Programming vs Declarative Programming](https://github.com/abenzaggagh/Java-8-to-21/blob/main/ImperativeDeclarativeExemple.java$0).

# Lambda Expression

Lambda is equivalent to a function (method) without a name.

Lambda are also referred as aninymous functions and has all the qualities that a regular method has :
* Method parameters
* Method body
* Return type

Lambda are not tied ti any class like regular method.

Lambda can also be assigned to variable and passed around.

Lambda Expression : 
```
() -> Single statement or expression // Curly braces are not needed.
() -> { Multiple statements } // Curly braces are needed for multiple statements.
```

Lambda us mainly used to implement Functional Interfaces (SAM). 
```
@FunctionalInterface
```

[Exemple of Lambda Expressions](https://github.com/abenzaggagh/Java-8-to-21/tree/main/src/com/java/lambda$0).

# Functional Interface

A Functional Interface is an interface that contains exactly one abstract method (Single Abstract Method – SAM).

It is the foundation of Lambda Expressions in Java.

A Functional Interface can contain:
* One abstract method (required)
* Default methods
* Static methods
* Private methods (since Java 9)

But it must have only one abstract method.

Functional Interface annotation:
```
@FunctionalInterface
```

This annotation is optional, but recommended.
It ensures at compile time that the interface contains only one abstract method.

Example of Functional Interface:
```
@FunctionalInterface
public interface Calculator {
    int compute(int a, int b);
}
```

Lambda implementation:
```
Calculator add = (a, b) -> a + b;
```

Java provides many built-in Functional Interfaces in *java.util.function* package:

* Predicate<T> → returns boolean
* Function<T, R> → takes T and returns R
* Consumer<T> → takes T and returns nothing
* Supplier<T> → returns T and takes nothing

Functional Interfaces enable functional programming in Java and are mainly used with:

* Lambda expressions
* Method references
* Streams API

[Exemple of Function Interface](https://github.com/abenzaggagh/Java-8-to-21/tree/main/src/com/java/functionalInterfaces$0).

# Method Reference

Method Reference is a shorthand notation of a Lambda Expression used to call an existing method.

It makes the code more readable and concise.

Instead of writing a lambda that only calls a method, we can directly reference that method.

Method Reference uses the :: operator.

Syntax:
```
ClassName::staticMethod
objectReference::instanceMethod
ClassName::instanceMethod
ClassName::new   // Constructor reference
```

Types of Method References:
* Reference to a static method
* Reference to an instance method of a particular object
* Reference to an instance method of an arbitrary object of a given type
* Reference to a constructor

Example with Lambda:
```
Function<String, Integer> parse = s -> Integer.parseInt(s);
```

Equivalent Method Reference:
```
Function<String, Integer> parse = Integer::parseInt;
```

[Exemple of Method Reference](https://github.com/abenzaggagh/Java-8-to-21/tree/main/src/com/java/methodReference$0).


# Effective Final & Lambda Usage

## Effective Final

A variable used inside a Lambda Expression must be final or effectively final.

Effectively final means the variable is not modified after its initialization, even if it is not explicitly declared final.

Valid example:
```
int x = 10;

Runnable r = () -> System.out.println(x);
```

Invalid example:
```
int x = 10;

Runnable r = () -> System.out.println(x);
x++;   // Compilation error
```

# Streams

Introduced as part of Java 8

Main purpose is to perform some operation on Collections.

Parraled operations are easy to perform with Streams API without having to spawn a multiple threads.

Streams API can also be used with arrays or any kind of I/O.

Stream is a sequence of elements which can be created out of a collections such as list or Arrays or any kind of I/O resources and etc

```
List<String> names = Arrays.asList("Amine", "Jennifer", "Adam");

names.stream();
```

Stream operations can be performed either sequentially or parallel.

```
names.parallelStream();
```

Stream pipeline = Intermediate Operations + Terminal Operation

Exemple : 
```
    .stream().filter(...).map(...) // Intermediate Operations
    .collect(...) // Terminal Operation
```

Streams are lazy.

| Collection                                                                                                  |  Streams      |
| ----------------------------------------------------------------------------------------------------------- |:---------------------------------------------------------------------:|
| Can add / modify elements at any point of time.                                                             | can not modifiy elements in the stream. it's fixed dataset.           |
| Elements in a collections can be accessed in any order. Use appropriate methods based on the collection     | Elements in the stream can be accessed only in sequence               |
| Collection is eagerly constructed                                                                           | Streams are lazily constructed                                        |
| Collections can be traversed n numbers of times                                                             | Streams can be traversed only one                                     |
| Performs external iteration to iterate through the elements                                                 | Performs internal Iteration to iterate through the elements           |

## map
map transforms each element of a stream into another value using a function.

It produces a new stream where every element is the result of applying the transformation.

Example use cases:
* Convert objects to DTOs
* Extract a field from objects
* Apply calculations
  
## flatMap

flatMap transforms each element into a stream and then flattens all resulting streams into a single stream.

It is mainly used when working with nested structures (e.g., List<List<T>>).

It prevents having a Stream<Stream<T>> and instead produces a Stream<T>.

## distinct, count, sorted

* distinct removes duplicate elements (based on equals and hashCode).
* count returns the number of elements in the stream.
* sorted sorts the elements (natural order or using a comparator).

These operations are commonly used for data cleanup and ordering.

## filter

filter selects elements that match a given condition (predicate).

It returns a new stream containing only elements that satisfy the condition.

Used to:
* Remove unwanted data
* Apply business rules
* Narrow down datasets

## reduce

reduce combines stream elements into a single result.

It applies an accumulator function repeatedly to produce one final value.

Common uses:
* Sum of numbers
* Concatenating strings
* Aggregating results

## limit, skip

* limit(n) restricts the stream to the first n elements.
* skip(n) ignores the first n elements.

Useful for:
* Pagination
* Slicing datasets
* Performance optimization

## anyMatch, allMatch, noneMatch

These are terminal operations that evaluate conditions:
* anyMatch → returns true if at least one element matches.
* allMatch → returns true if all elements match.
* noneMatch → returns true if no elements match.

They are commonly used for validation and rule checking.

## findFirst, findAny

* findFirst returns the first element of the stream (if present).
* findAny returns any element (especially useful in parallel streams).

Both return an Optional.

## Short Circuiting

Short-circuiting operations stop processing as soon as the result is determined.

Examples:
* anyMatch
* findFirst
* limit

They improve performance by avoiding unnecessary computation.

## Factory methods of, iterate, generate

These are static methods of Stream used to create streams:
* of → creates a stream from fixed values.
* iterate → creates an infinite stream based on a seed and function.
* generate → creates an infinite stream using a supplier.

They are commonly used to initialize streams for functional pipelines.

[Exemple of Streams and Operators](https://github.com/abenzaggagh/Java-8-to-21/tree/main/src/com/java/streams).

# Numeric Streams

Numeric Streams are specialized streams for primitive types:
* IntStream
* LongStream
* DoubleStream

They avoid boxing overhead and provide additional numeric operations.

## Numeric Stream Ranges

Numeric streams provide range-based factory methods for generating sequences of numbers.

## IntStream

IntStream.range(start, end) → generates a sequence excluding end.

IntStream.rangeClosed(start, end) → includes end.

Commonly used for:
* Loop replacements
* Index-based iteration
* Generating sequences

## LongStream

LongStream.range(start, end)
LongStream.rangeClosed(start, end)

Same behavior as IntStream, but for long values.

Useful when working with large numbers.

## DoubleStream

DoubleStream does not provide range methods.

Instead, it is usually created using:
* DoubleStream.of(...)
* DoubleStream.generate(...)
* DoubleStream.iterate(...)

It is mainly used for decimal and scientific calculations.

## Boxing & Unboxing

Boxing converts a primitive type into its wrapper class:

int → Integer

Unboxing converts a wrapper back to primitive:

Integer → int

Regular streams (Stream<Integer>) require boxing/unboxing, which impacts performance.

Numeric Streams (IntStream, LongStream, DoubleStream) avoid this overhead by working directly with primitives.

To convert:
* boxed() → converts primitive stream to wrapper stream
* mapToInt, mapToLong, mapToDouble → convert object stream to primitive stream

## mapToObj, mapToLong, mapToDouble

These methods are used to convert between object streams and primitive streams.
* mapToObj → primitive stream to object stream
* mapToInt, mapToLong, mapToDouble → object stream to numeric stream

They are commonly used when:
* Extracting numeric fields from objects
* Switching between performance-focused numeric operations and object processing

[Exemple of Numeric Streams](https://github.com/abenzaggagh/Java-8-to-21/tree/main/src/com/java/streams/numericStreams).
