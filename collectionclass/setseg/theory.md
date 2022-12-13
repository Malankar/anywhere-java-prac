#### **`What is set?`**
```
In Java, a Set is a collection of unique elements. Sets are used to store and manage collections of data in which each element must be unique. This makes them useful for storing and managing data such as a list of unique identifiers or a list of unique words in a document.
```

#### **`What are types of set?`**
```
Java provides several different implementations of the Set interface, including HashSet, TreeSet, and LinkedHashSet.

HashSet is a type of set that uses a hash table to store its elements. It does not maintain the elements in any particular order, but it allows for fast access to the elements. This makes it a good choice for sets that need to be accessed quickly, but where the order of the elements is not important.

TreeSet is a type of set that uses a tree data structure to store its elements. It maintains the elements in ascending order, according to the natural ordering of the elements or according to a comparator provided by the user. This makes it a good choice for sets that need to be maintained in a particular order, such as sets of numbers or strings that need to be sorted.

LinkedHashSet is a type of set that uses a hash table and a linked list to store its elements. It maintains the elements in the order in which they were inserted, allowing for efficient insertion and access to the elements. This makes it a good choice for sets that need to maintain the order of their elements, such as sets that need to be iterated in the same order in which they were added.


```
```
- HashSet is a good choice for sets that need to be accessed quickly, but where the order of the elements is not important. 
- TreeSet is a good choice for sets that need to be maintained in a particular order, such as sets of numbers or strings that need to be sorted. 
- LinkedHashSet is a good choice for sets that need to maintain the order of their elements, such as sets that need to be iterated in the same order in which they were added.
```

#### **`Why not use arraylist instead of hashset if we just want to access the elements right?`**
```
While both a hash set and an array list can be used to store a collection of elements, a hash set is better suited for checking the presence of an element, while an array list is better suited for accessing elements by their index. It is also worth noting that a hash set does not store elements in a specific order, while an array list does.
```

#### **`Where not to use hashset?`**
```
A hash set is not the best choice for situations where you need to maintain the order of the elements in the collection or where you need to perform operations that require sorting the elements. This is because a hash set does not store elements in a specific order and does not provide the necessary methods for sorting the elements.
Additionally, a hash set is not the most efficient data structure for situations where you need to access elements by their index, as it does not provide fast indexed access to elements like an array or an array list. In such cases, you may want to use an array or an array list instead.
```

#### **`When to use Treeset?`**
```
A tree set is a data structure that stores unique elements in a sorted order. It provides fast lookups to check if an element exists in the set and can be used in situations where you need to maintain the order of the elements in a collection or where you need to perform operations that require sorting the elements.
```

#### **`When not to use Treeset?`**
```
A tree set is not the best choice for situations where you need to quickly check if an element exists in a collection or where you do not need to maintain the order of the elements. In such cases, you may want to use a different data structure such as a hash set, which are better suited for these tasks. Additionally, a tree set is not the most efficient data structure for situations where you need to access elements by their index, as it does not provide fast indexed access to elements like an array or an array list. In such cases, you may want to use an array or an array list instead.
```

#### **`When to use and not to use LinkedHashSet?`**
```
A LinkedHashSet is a Set implementation that maintains the order in which elements were inserted. This is in contrast to a HashSet, which does not maintain any order among its elements, and a TreeSet, which maintains its elements in ascending order. One reason to use a LinkedHashSet is if you need to iterate through the set in the order in which elements were added. This can be useful if you want to preserve the original order of the elements, or if you want to implement a "recently used" list.

On the other hand, a LinkedHashSet may not be the best choice if you need to access elements in the set frequently, since it has a slightly higher memory overhead compared to a HashSet due to the additional linked list used to maintain the insertion order. In this case, a HashSet would be a more efficient choice. Additionally, if you need to access elements in a sorted order, a TreeSet would be a better choice than a LinkedHashSet.
```

#### **`Usecase for LinkedHashSet?`**
```
A perfect use case for a LinkedHashSet is to implement a cache that retains the order in which elements were added. For example, you might use a LinkedHashSet to store the most recently accessed items in a web application, such as the pages that a user has visited. This way, you can easily iterate through the set in the order in which the pages were accessed, and remove the least recently used items if the cache reaches its maximum capacity.

In this case, a LinkedHashSet is better than a HashSet because it maintains the insertion order, so you can easily access the most recently used items. A TreeSet would not be suitable in this case because it maintains its elements in ascending order, and not in the order in which they were added to the set.
```
