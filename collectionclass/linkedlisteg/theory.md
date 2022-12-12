#### **`What is linked list?`**
```
A linked list is a data structure that consists of a group of nodes which together represent a sequence. Each node in a linked list contains a data element, as well as a reference (i.e., a link) to the next node in the list. This allows for efficient insertion or removal of elements from any position in the list.
```

#### **`How the LinkedList works?`**
```
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
```

#### **`Why are they used?`**
```
Linked lists are often used because of their efficient insertion and deletion operations, especially when compared to arrays. 
```

#### **`When not to use?`**
```
They do not provide efficient random access to elements, and so they are not the best choice for applications that require frequent access to individual elements in the list as we have to traverse through all the elements in the list to find the kth element in the list thus its O(n) time complexity.
```

#### **`Types of linked list?`**
```
There are several types of linked lists, including singly linked lists, doubly linked lists, and circular linked lists.

`Singly` - In a singly linked list, each node in the list contains a data element and a reference (i.e., a link) to the next node in the list.

`Doubly` - In a doubly linked list, each node in the list contains a data element, as well as references to the previous and next nodes in the list. This allows for efficient insertion or removal of elements from any position in the list, as well as efficient access to the list elements in both directions.

`Circular` - In a circular linked list, the last node in the list points back to the first node (i.e., the list is "circular"). This allows for efficient insertion or removal of elements from the front or back of the list.

`Skip list` - This is a type of linked list where some nodes contain additional references to other nodes that are further ahead in the sequence. This can speed up the process of traversing the list by allowing the traversal to "skip" over certain nodes.

`Sentinel list`- This is a type of linked list where an additional "sentinel" node is added at the beginning or end of the sequence. The sentinel node serves as a placeholder and does not contain any data, but it can simplify the implementation of certain operations on the list, such as adding or removing nodes.
```

#### **`What are the uses and drawbacks of each?`**
```
Singly linked lists are used when we want to manipulate data at the end or start of the list like adding or removing from beginning and the end not just one end. However, they do not allow for efficient access to the elements in middle or in reverse direction.

Doubly linked lists can be used for manipulating data in the middle rather than at the end as it can traverse in both directions.However, they require more memory per node than singly linked lists, since each node must store two references (one to the previous and one to the next node in the list).

Circular linked lists allow for efficient insertion and deletion of elements from the front or back of the list, since the last node in the list points back to the first node. However, they do not provide an efficient way to determine the head or tail of the list, since there is no "end" to the list.
```


#### **`List all types of linked list and where and when they should be used?`**
```
There are several different types of linked lists, including singly linked lists, doubly linked lists, and circularly linked lists.

A singly linked list is a type of linked list in which each node only has a reference to the next node in the list. This makes it simple to traverse the list in one direction, but it is not possible to traverse the list in the reverse direction. Singly linked lists are useful in situations where you only need to traverse the list in one direction, such as when implementing a stack or queue data structure.

A doubly linked list is a type of linked list in which each node has references to both the next and previous nodes in the list. This allows for traversal of the list in both directions, but it also requires more memory to store the additional references. Doubly linked lists are useful in situations where you need to be able to traverse the list in both directions, such as when implementing a bi-directional iterator.

A circularly linked list is a type of linked list in which the last node in the list points back to the first node, creating a circular loop. This allows for efficient traversal of the list in both directions, but it also means that the list does not have a definite end. Circularly linked lists are useful in situations where you need to be able to traverse the list in both directions and where it is not necessary to have a definite end to the list, such as when implementing a circular buffer.

In general, the type of linked list you should use will depend on your specific requirements and the constraints of your application. Singly linked lists are the simplest and most memory-efficient type of linked list, but they can only be traversed in one direction. Doubly linked lists and circularly linked lists allow for traversal in both directions, but they require more memory and may not be suitable for all applications.

```


#### **`Why to use and not to use circual linked list?`**
```
Circularly linked lists are useful in situations where you need to be able to traverse the list in both directions and where it is not necessary to have a definite end to the list, such as when implementing a circular buffer. However, they may not be suitable for all applications.

One potential disadvantage of circularly linked lists is that they can be more difficult to implement than other types of linked lists. Since the last node in the list points back to the first node, it can be challenging to determine when to stop traversing the list. This can make it easy to get stuck in an infinite loop if the list is not implemented correctly.

Another potential disadvantage of circularly linked lists is that they can be less memory efficient than other types of linked lists. Since each node in the list needs to store a reference to the next and previous nodes, circularly linked lists require more memory to store the same number of items as a singly or doubly linked list.

In general, whether or not to use a circularly linked list will depend on the specific requirements and constraints of your application. If you need to be able to traverse the list in both directions and do not need a definite end to the list, a circularly linked list may be a good choice. However, if you only need to traverse the list in one direction or if you have memory constraints, a different type of linked list may be more appropriate.
```