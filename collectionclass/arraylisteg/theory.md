#### **`What is Arraylist?`**
```
An ArrayList is a data structure in Java that is used to store a list of objects. It is similar to an array, but it can grow and shrink dynamically as elements are added or removed. This makes it an ideal data structure for storing a collection of objects.
```

#### **`How the ArrayList works?`**
```
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
```

#### **`Why use it?`**
```
Arraylist is to provide an efficient way to store, access and modify data. Arraylists are commonly used because they allow for fast and convenient access to data, and they are able to dynamically resize themselves to accommodate new items as needed.
```

#### **`Usecase?`**
```
Suppose we are building a game and we want to store the options a player chooses on every level and based on that outcomes of the later game will change we can store this choosen options in an Arraylist for better accessiblity.
```

#### **`Another usecase`**
```
use case for an arraylist would be to store a list of items that need to be accessed frequently, such as a list of user accounts or a list of product names. In this case, an arraylist would be an efficient way to store and access the data because it allows for fast lookup and easy manipulation of the items in the list.
```


#### **`Why its not efficient for larger data sets?`**
```
When an arraylist needs to resize its array, it must allocate a new, larger array in memory and copy all of the items from the old array to the new array. This can be a time-consuming process, and it can also lead to higher memory usage because the arraylist now has two arrays in memory: the old array and the new array. This can make an arraylist less efficient for accessing data and using memory compared to other data structures.
```
#### **`Advantage of Arraylist?`**
```
Provides fast iteration of elements using indexing.
It provides memory coherance meaning the elements are stored in a sequential memory location.
Fast random access of elements due to memory coherance.
```
#### **`Disadvantage of Arraylist?`**
```
Addition or deletion of data from the middle is time consuming as data needs to be shifted to update the list
Resizing of an arraylist when it reaches it's capacity with it initial capacity which is 10 is a costlier process as the elements will be copied from old to new space with 50% more capacity.
```

#### **`Why not use hashmap instead of arraylist?`**
```
Because they serve different purposes and have different characteristics. For example, if you need to store a collection of objects and maintain their order, then an ArrayList would be a better choice than a HashMap. On the other hand, if you need to store a collection of key-value pairs and look up values by their keys, then a HashMap would be a better choice than an ArrayList.
```


#### **`Keypoint`**
```
Fast lookup and easy manipulation. 
Higher memory consumption on large data.
```

#### **`What is initial capacity of arraylist and how does it shink or grow when adding new items into the collection?`**
```
The initial capacity of an ArrayList in Java is the number of elements that the list can hold without needing to resize its underlying array. This initial capacity is determined by the constructor that is used to create the list.

ArrayList constructor, which takes no arguments, creates a list with an initial capacity of 10 elements. This means that the list can hold up to 10 elements without needing to resize its underlying array.

If the list reaches its initial capacity and more elements are added to it, the list will automatically resize its underlying array to accommodate the additional elements. 

The exact amount by which the list's initial capacity is increased when its underlying array is resized depends on the implementation of the ArrayList class. In the default implementation of ArrayList, the new array is created with a capacity that is 1.5 times the size of the old array, plus 1. So, for example, if the old array has a capacity of 10 elements, the new array will have a capacity of 16 elements (1.5 * 10 + 1 = 16).

When the ArrayList class in Java increases the initial capacity of its underlying array, it increases the capacity by 1.5 times the size of the old array, plus 1. This means that the new array will be 50% larger than the old array, plus 1 element.

```