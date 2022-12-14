#### **`What is map in java?`**
```
Map is an interface that represents a data structure that maps keys to values. A map cannot contain duplicate keys, and each key can map to at most one value.
```

#### **`Types of map?`**
```
There are several different implementations of the Map interface in Java, including HashMap, TreeMap, and LinkedHashMap.

A HashMap is a Map implementation that uses a hash table to store its elements. It provides fast lookups and allows null values and null keys. It does not maintain the order of its elements, so the order in which elements are added to a HashMap may not be the same as the order in which they are iterated over.

A TreeMap is a Map implementation that maintains its elements in ascending order based on their keys. It does not allow null keys, but it does allow null values.

A LinkedHashMap is a Map implementation that maintains the order in which elements were inserted. It uses a doubly-linked list to store its elements, and provides fast lookups and does not allows null values and null keys.
```

#### **`When to use what?`**
```
If you need to access elements in a sorted order, a TreeMap would be a good choice.
If you need to preserve the order in which elements were added, a LinkedHashMap would be a good choice.
If you just need a fast access on map that allows null keys and values, a HashMap would be a good choice.
```

#### **`When to use and not use HashMap?`**
```
A HashMap is a type of data structure that maps keys to values. It is commonly used in Java because it provides fast lookup and insertion performance. Because of its fast performance, a HashMap is a good choice when you need to store and retrieve data quickly, such as when you're working with large data sets.

However, there are some situations where a HashMap may not be the best choice. For example, if you need to maintain the order of the elements in your data set, a HashMap may not be suitable because it does not guarantee the order of the elements. In this case, you may want to use a different data structure, such as a LinkedHashMap or a TreeMap, which do maintain the order of the elements.

Another potential disadvantage of a HashMap is that it does not support concurrent access, meaning that if multiple threads try to access and modify a HashMap at the same time, it can result in data corruption or other unexpected behavior. If you need to support concurrent access, you may want to use a ConcurrentHashMap instead.
```

#### **`Usecases?`**
```
One common use case for a HashMap is to store data that can be quickly retrieved using a unique key. For example, you could use a HashMap to store a database of customer information, where the customer's ID number is the key and the customer's name and other information is the value. This allows you to quickly look up a customer's information by their ID number.

Another use case for a HashMap is to count the number of times a certain value appears in a data set. For example, you could use a HashMap to count the number of times each word appears in a document. In this case, the words would be the keys and the values would be the number of times each word appears.
```

#### **`When to use not use TreeMap ?`**
```
A TreeMap is a good choice when you need to store data in a map and you want to maintain the order of the elements. For example, if you need to store a list of employees and retrieve them in alphabetical order by last name, a TreeMap would be a good choice.

However, TreeMap has slower lookup and insertion performance compared to a HashMap. This is because a TreeMap uses a tree data structure to store the elements, whereas a HashMap uses a hash table. If you need fast lookup and insertion performance, a HashMap may be a better choice.

Another potential disadvantage of a TreeMap is that it does not support null keys. If you need to store null keys in your data set, you may want to use a different data structure that does support null keys such as a HashMap.
```

#### **`Usecases?`**
```
Storing a directory structure, where the directory names are the keys and the contents of each directory are the values. A TreeMap would allow you to maintain the order of the directories, such as alphabetical order, making it easy to traverse the directory structure in a specific order.

Storing a dictionary, where the words are the keys and the definitions are the values. A TreeMap would allow you to maintain the order of the words, such as alphabetical order, making it easy to look up a word and its definition in a specific order.

```

#### **`When to use not use LinkedHashMap ?`**
```
A LinkedHashMap is a data structure that implements the Map interface and maintains the order of the elements. It is similar to a HashMap, which also implements the Map interface, but a LinkedHashMap maintains the order of the elements whereas a HashMap does not.

A LinkedHashMap is a good choice when you need to store data in a map and you want to maintain the order of the elements. For example, if you need to store a list of tasks and retrieve them in the order in which they were added, a LinkedHashMap would be a good choice.

However, there are some situations where a LinkedHashMap may not be the best choice. One potential disadvantage of a LinkedHashMap is that it has slower lookup compared to a HashMap. This is because a LinkedHashMap uses a linked list to store the elements, whereas a HashMap uses a hash table. If you need fast lookup, a HashMap may be a better choice.

Another potential disadvantage of a LinkedHashMap is that it does not support null keys or values. If you need to store null keys or values in your data set, you may want to use a different data structure that does support null keys and values, such as a HashMap.

```

#### **`Usecases?`**
```
Storing a history of recently visited web pages, where the page title are the keys and the URL are the values. A LinkedHashMap would allow you to maintain the order in which the pages were visited, making it easy to retrieve and display the history in the correct order.

LinkedHashMap is a good choice when you need to store data in a map and you want to maintain the order of the elements. It is especially useful when you need to iterate over the elements in the order in which they were added, as it maintains the insertion order of the elements.
```

#### **`How does HashMap hashes the data`**
```
In Java, a HashMap is a data structure that maps keys to values. It works by using a hashing function to compute the index at which each key is stored in the map. When a key is added to a HashMap, the hashing function is used to determine the index at which the key-value pair will be stored. The key-value pair is then stored at that index in the map.

The process of hashing a key involves passing the key through a mathematical function (the hashing function) that produces a hash value. This hash value is then used to determine the index at which the key-value pair will be stored in the map.

The specific way in which a HashMap hashes keys can vary depending on the implementation, but in general, the goal of the hashing function is to produce a hash value that is evenly distributed across the possible range of values, so that key-value pairs are distributed evenly throughout the map. This helps to ensure efficient performance, because it means that on average, each index in the map will have approximately the same number of key-value pairs.
```

#### **`What is initial capacity of hashmap and how does it shink or grow when adding new items into the collection?`**
```
The initial capacity of a HashMap in Java is simply the number of elements that the map can hold without needing to resize itself. This initial capacity is determined by the constructor that is used to create the map.

HashMap constructor, which takes no arguments, creates a map with an initial capacity of 16 elements. 

This means that the map can hold up to 16 elements without needing to resize itself.
If the map reaches its initial capacity and more elements are added to it, the map will automatically resize itself to accommodate the additional elements. This is done by creating a new, larger map and copying the existing elements from the old map to the new map. 

The exact amount by which the map's initial capacity is increased when it is resized depends on the loadFactor of the map. The loadFactor is a parameter that specifies the maximum ratio of elements to capacity that the map is allowed to have before it is resized. By default, the HashMap constructor sets the loadFactor to 0.75, which means that the map will be resized when the number of elements in the map exceeds 75% of the map's initial capacity.

You can change the loadFactor of a HashMap in Java by using a constructor that takes the loadFactor as an argument.

Changing the loadFactor of a HashMap can affect the map's initial capacity and how often it is resized.

A lower loadFactor will cause the map to be resized more frequently, which can result in better performance if the map is frequently adding and removing elements. A higher loadFactor, on the other hand, will cause the map to be resized less frequently, which can result in better performance if the map is relatively static and does not frequently add or remove elements.
```