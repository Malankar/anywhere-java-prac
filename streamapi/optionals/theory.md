#### **`What are optionals?`**
```
Optionals in Java are used to represent the absence of a value. This is useful in situations where a method might not return a value, or where a variable might not have a value assigned to it. Optionals are typically used to avoid null reference errors, which can occur when trying to access a null value.

Optionals are typically used in cases where a method might return a null value, but the caller of the method needs to handle the absence of a value. For example, consider the following code:

```

#### **`So If we can handle the null exception by conditional statement why use optionals?`**
```
The primary reason for returning an Optional from a method is to explicitly convey to the caller of the method that the returned value might not be present. This allows the caller to handle the absence of a value in a safe and effective manner, and avoids the potential for null reference errors.

So, even if the end result did look similar its still making clear to the user just by return an optional in the first place. 

Also Optional offers some other nice methods to deal with null values all together. 
```


#### **`What is findFirst in java streams and how it associates with optionals?`**
```
In Java, the findFirst() method is a part of the Stream API, which is used to first element of a collection that matches a given condition. This method returns an Optional object, which is a container for a value that may or may not be present.
```
