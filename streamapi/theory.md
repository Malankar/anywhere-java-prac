#### **`What is Streams ?`**
```
Streams in Java are used to process collections of data in a declarative manner, which means that the operations performed on the data are described, but not the specific details of how the operations are implemented.
```
#### **`What is difference between Streams and Streams API ?`**
```
A stream is a sequence of data elements that can be processed in a declarative way. Streams can be created from various data sources, such as collections, arrays, or I/O resources, and support a range of different operations for processing the elements in the stream.

The Stream API, on the other hand, is a Java API that provides a set of classes and interfaces for working with streams. The Stream API is part of the Java Collections Framework, and is located in the java.util.stream package. It provides a declarative programming model for working with streams, allowing developers to perform functional-style operations on streams of data, such as filtering, mapping, and reducing.

In short, a stream is a sequence of data elements that can be processed, while the Stream API is a Java API that provides a set of classes and interfaces for working with streams.
```

#### **`Why we use it ?`**
```
One reason why streams are useful in Java is that they provide a way to perform complex operations on data in a concise and declarative manner. For example, you can use streams to filter a collection of objects based on a certain criterion, and then perform a mapping operation on the resulting elements, all in a single statement. This can make your code more readable and easier to maintain.

Another reason why streams are useful in Java is that they are designed to support parallel operations. This means that you can use streams to perform operations on data in parallel, which can improve the performance of your program.

Streams support lazy evaluation. This means that the operations performed on a stream are not executed until the stream is actually used. This can help to improve the performance of your program by allowing it to avoid performing unnecessary computations.

Streams support parallel operations. This means that you can use streams to perform operations on data in parallel, which can improve the performance of your program by taking advantage of multiple cores or processors.

Streams provide a consistent interface for working with different types of data sources. For example, you can use the same set of stream operations to process data from a file, a network connection, or a database, even though the underlying data sources may be very different. This can make it easier to write and maintain code that works with different types of data.
```

#### **`What are collectors in a stream ?`**
```
Collectors in a stream are used to reduce a stream of elements to a single value or a collection of values. In other words, they allow you to combine the elements in a stream into a single result.
For example, you might use a collector to sum the elements in a stream, or to concatenate the elements in a stream into a single string. Collectors are typically used in conjunction with the collect method, which is a terminal operation on a stream.
```

#### **`What is lazy evaluation ?`**
```
Lazy evaluation is a programming technique where the evaluation of an expression is delayed until its result is actually needed. In Java, this is typically used in situations where the value of an expression may not be required, or where the cost of evaluating the expression is high.

For example, if an application needs to perform a complex calculation, but that calculation is only needed in certain circumstances, the application can use lazy evaluation to only perform the calculation when it is actually needed. This can save resources and improve the overall performance of the application.

Overall, lazy evaluation is a useful technique for optimizing the performance and efficiency of a program.
```
#### **`How we use it in streams`**
```
In Java, lazy evaluation can be used with the Stream API to optimize the performance of stream operations. The Stream API allows developers to perform functional-style operations on streams of data, such as filtering, mapping, and reducing.

By default, the Stream API uses lazy evaluation to avoid performing unnecessary operations on the elements in a stream. For example, suppose we are filtering an array of element which are greater than 10 then the filter method will not actually evaluate any of the elements in the stream until a terminal operation, such as forEach or collect, is called on the resulting stream. 

This means that the filter operation will only be performed on the elements in the stream that are actually needed, and will not be performed on any elements that are not required.

lazy evaluation is an important part of the Stream API, and allows developers to write efficient and performant code when working with streams of data in Java.
```

#### **`How does stream api implements lazy evaluation`**
```
The Stream API in Java uses lazy evaluation to avoid performing unnecessary operations on the elements in a stream. This is achieved through the use of intermediate and terminal operations.

Intermediate operations, such as filter and map, are operations that are applied to the elements in a stream, but do not produce a result. Instead, they return a new stream that can be further operated on. Because intermediate operations do not produce a result, they can be safely deferred until a terminal operation is called on the stream.

Terminal operations, such as forEach and collect, are operations that consume the elements in a stream and produce a result. When a terminal operation is called on a stream, the Stream API will evaluate the elements in the stream, applying any intermediate operations that were previously called on the stream. This means that intermediate operations are only performed on the elements in the stream that are actually needed, and are not performed on any elements that are not required.
```

#### **`What will happen if we consume a already consumed stream`**
```
If you attempt to consume a stream that has already been consumed, it will throw an IllegalStateException.

In Java, a stream can only be consumed once. This means that once a terminal operation, such as forEach or collect, has been called on a stream, the stream is considered to be consumed, and any attempt to call another terminal operation on that stream will throw an IllegalStateException.
```

#### **`Why is there such behaviour with streams what is the reason behind it.`**
```
The reason that a stream can only be consumed once is to prevent unintended side effects and to ensure the correctness of the program.

If a stream were allowed to be consumed multiple times, it could potentially cause unintended side effects and lead to incorrect results. 

For example, Consider a program that attempts to consume a stream of arraylist twice using the forEach method, while consuming it for the first time it adds each numbers square at the end of the arraylist and while consuming it for the second time it just want to show the original list, this would cause a side effect in the program as the data has been changed and the user wants the original data. To prevent this Stream API disallows the consumption of a stream more than once. 
```

#### **`What is parallel stream why we use it give some usecase ?`**
```
We can use Parallel stream in Java to process the elements of a collection concurrently, using multiple threads. In a parallel stream, the elements of the collection are divided into smaller chunks, which are then processed concurrently by different threads. This allows you to take advantage of multiple cores or processors on your computer, which can improve the performance of your program.

Here is an example of how you can use a parallel stream to process the elements of a collection:
```
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Process the elements of the list concurrently using a parallel stream
numbers.parallelStream()
  .forEach(n -> System.out.println(n + " * 2 = " + (n * 2)));

```
```
In this example, the numbers list is converted to a parallel stream using the parallelStream() method. The forEach() method is then used to iterate over the elements of the stream, and each element is processed concurrently by a different thread.

It's important to note that the order of the elements in the stream may not be preserved when using a parallel stream, as the elements are processed concurrently and may not be processed in the order in which they appear in the original collection.

One potential use case for parallel streams would be to perform data-intensive operations on large collections of data, such as performing complex calculations on a large dataset in a scientific or financial application. By using a parallel stream, you can take advantage of multiple processors or cores to perform the operation more quickly and efficiently.
```
